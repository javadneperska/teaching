package sk.globallogic.durisin.lesson.geometry;


/**
 * Class for representing a rhombus.
 */
public class Rhombus extends Parallelogram {
    public static final String name = "rhombus";

    /**
     * Initializes Rhombus.
     * Note: Based on standard naming ABCD, A at the bottom left.
     *
     * @param a length of site a (AB)
     * @param alpha size of angle alpha in degrees (angle between site a (AB) and d (DA))
     */
    public Rhombus(double a, double alpha) {
        super(a, a, alpha);
    }

    /**
     * Returns string representation.
     *
     * @return string representation
     */
    @Override
    public String getName() {
        return name;
    }
}
