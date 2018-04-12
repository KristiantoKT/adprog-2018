package game;

/**
 * Created by billy on 9/27/16.
 * Edited by hafiyyan94 on 4/10/18
 */
public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction() {
        this(0, 1);
    }

    public Fraction(int num) {
        this(num, 1);
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * get numerator value.
     *
     * @return numerator in integer
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Set the numerator with give integer value.
     *
     * @param numerator numerator integer value
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * get denominator value.
     *
     * @return denominator in integer
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Set the denominator with give integer value.
     *
     * @param denominator denominator integer value
     */
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    /**
     * Getting new instance of fraction that the values has been simplified.
     *
     * @return simplified {@link Fraction} instance
     */
    public Fraction getSimpleValue() {
        int gcdVal = findGcd(numerator, denominator);
        return new Fraction(numerator / gcdVal, denominator / gcdVal);
    }

    /**
     * Do fraction addition from given fraction object, and return the result as new instance.
     *
     * @param targetFraction given target fraction
     * @return new {@link Fraction} result instance
     */
    public Fraction getAddition(Fraction targetFraction) {
        if (numerator != targetFraction.getDenominator()) {
            return new Fraction(
                    numerator * targetFraction.getDenominator()
                            + denominator * targetFraction.getNumerator(),
                    denominator * targetFraction.getDenominator());
        } else {
            return new Fraction(numerator + targetFraction.getNumerator(), denominator);
        }
    }

    /**
     * Do fraction substraction from given fraction object, and return the result as new instance.
     *
     * @param targetFraction given target fraction
     * @return new {@link Fraction} result instance
     */
    public Fraction getSubstraction(Fraction targetFraction) {
        if (numerator != targetFraction.getDenominator()) {
            return new Fraction(
                    numerator * targetFraction.getDenominator()
                            - denominator * targetFraction.getNumerator(),
                    denominator * targetFraction.getDenominator());
        } else {
            return new Fraction(numerator - targetFraction.getNumerator(), denominator);
        }
    }

    /**
     * Do fraction multiplication from given fraction object, and return the result as new instance.
     *
     * @param targetFraction given target fraction
     * @return new {@link Fraction} result instance
     */
    public Fraction getMultiplication(Fraction targetFraction) {
        return new Fraction(numerator * targetFraction.getNumerator(),
                denominator * targetFraction.getDenominator());
    }

    /**
     * Do fraction divisioning from given fraction object, and return the result as new instance.
     *
     * @param targetFraction given target fraction
     * @return new {@link Fraction} result instance
     */
    public Fraction getDivision(Fraction targetFraction) {
        return new Fraction(numerator * targetFraction.getDenominator(),
                denominator * targetFraction.getNumerator());
    }

    /**
     * Check if given fraction is equal in value with given fraction.
     *
     * @param targetFraction given fraction that need to be checked
     * @return boolen value that indicate equalibility
     */
    public boolean isEqual(Fraction targetFraction) {
        Fraction crtFrac = getSimpleValue();
        Fraction trgtFrac = targetFraction.getSimpleValue();
        return (Math.abs(crtFrac.getNumerator()) == Math.abs(trgtFrac.getNumerator())
                && Math.abs(crtFrac.getDenominator()) == Math.abs(trgtFrac.getDenominator())
                && crtFrac.isNegative() == trgtFrac.isNegative());
    }

    /**
     * Get the fraction value in manner format.
     *
     * @return the fraction string in manner format
     */
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }


    /**
     * Find the GCD (Greatest Common Divisor) from given two integer values.
     *
     * @param valA integer value
     * @param valB integer value
     * @return GCD value from both given value
     */
    private int findGcd(int valA, int valB) {
        return (valA == 0 ? valB : findGcd(valB % valA, valA));
    }

    /**
     * Check if current fraction is in negative state.
     *
     * @return boolean that indicate is fraction in negative state
     */
    private boolean isNegative() {
        return (numerator < 0 && denominator >= 0) || (denominator < 0 && numerator >= 0);
    }
}
