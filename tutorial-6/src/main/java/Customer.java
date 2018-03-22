import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Customer {

    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;

        Iterator<Rental> iterator = rentals.iterator();
        String result = "Rental Record for " + getName() + "\n";

        while (iterator.hasNext()) {
            Rental each = iterator.next();

            // Add frequent renter points
            frequentRenterPoints += each.getFrequentRenterPoints();

            // Add bonus for a two day new release rental
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
                    each.getDaysRented() > 1)
                frequentRenterPoints++;

            // Show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    String.valueOf(each.getCharge()) + "\n";
            totalAmount += each.getCharge();
        }

        // Add footer lines
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";

        return result;
    }

    private double getTotalCharge() {
        double result = 0;
        for (Rental each : rentals) {
            result += each.getCharge();
        }
        return result;
    }

    private int getTotalFrequentRenterPoints() {
        int result = 0;
        for (Rental each : rentals) {
            result += each.getFrequentRenterPoints();
        }
        return result;
    }
}