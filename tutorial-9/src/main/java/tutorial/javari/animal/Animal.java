package tutorial.javari.animal;

/**
 * This class represents common attributes and behaviours found in all animals
 * in Javari Park.
 *
 * @author Programming Foundations 2 Teaching Team
 * @author TODO If you make changes in this class, please write your name here
 *     and describe the changes in the comment block
 */
public class Animal {

    private final Integer id;
    private final String type;
    private final String name;
    private final Body body;
    private final Condition condition;

    /**
     * Constructs an instance of {@code Animal}.
     *
     * @param id        unique identifier
     * @param type      type of animal, e.g. Hamster, Cat, Lion, Parrot
     * @param name      name of animal, e.g. hamtaro, simba
     * @param gender    gender of animal (male/female)
     * @param length    length of animal in centimeters
     * @param weight    weight of animal in kilograms
     * @param condition health condition of the animal
     */
    public Animal(Integer id, String type, String name, Gender gender, double length,
                  double weight, Condition condition) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.body = new Body(length, weight, gender);
        this.condition = condition;
    }

    public Integer getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    /**
     * Returns {@code Gender} identification of the animal.
     *
     * @return
     */
    public Gender getGender() {
        return body.getGender();
    }

    public double getLength() {
        return body.getLength();
    }

    public double getWeight() {
        return body.getWeight();
    }

    /**
     * Returns {@code Condition} of the animal.
     *
     * @return
     */
    public Condition getCondition() {
        return condition;
    }

    /**
     * Determines whether the animal can perform their attraction or not.
     *
     * @return
     */
    public boolean isShowable() {
        return condition == Condition.HEALTHY;
    }
}
