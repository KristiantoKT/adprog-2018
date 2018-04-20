package tutorial.javari.animal;

/**
 * This class describes possible genders for an animal.
 *
 * @author Programming Foundations 2 Teaching Team
 * @author TODO If you make changes in this class, please write your name here
 *     and describe the changes in the comment block
 */
public enum Gender {

    MALE, FEMALE;
    private static final String MALE_STR = "male";
    private static final String FEMALE_STR = "female";

    /**
     * Returns the correct gender enum based on given string representation
     * of a gender.
     *
     * @param str gender description
     * @return
     */
    public static Gender parseGender(String str) {
        if (str.equalsIgnoreCase(MALE_STR)) {
            return Gender.MALE;
        } else if (str.equalsIgnoreCase(FEMALE_STR)) {
            return Gender.FEMALE;
        } else {
            throw new UnsupportedOperationException();
        }
    }
}
