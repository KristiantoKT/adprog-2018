package id.ac.ui.cs.advprog.tutorial2.exercise1.receiver;

public class CeilingFan {

    private static final String OUT_FMT = "%s ceiling fan is %s";

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    private String location;
    private int speed;

    public CeilingFan(String location) {
        this.location = location;
        this.speed = OFF;
    }

    public void high() {
        // TODO Complete me!
        System.out.println(String.format(OUT_FMT, location, "on high"));
    }

    public void medium() {
        // TODO Complete me!
        System.out.println(String.format(OUT_FMT, location, "on medium"));
    }

    public void low() {
        // TODO Complete me!
        System.out.println(String.format(OUT_FMT, location, "on low"));
    }

    public void off() {
        // TODO Complete me!
        System.out.println(String.format(OUT_FMT, location, "off"));
    }

    public String getLocation() {
        // TODO Complete me!
        return "";
    }

    public int getSpeed() {
        return speed;
    }
}
