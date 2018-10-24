package sk.globallogic.durisin.lesson.geometry;


/**
 * Class for representing a rectangle.
 */
public class Rectangle extends Parallelogram {
    public static final String name = "rectangle";

    /**
     * Initiallizes Rectangle.
     * Note: Based on standard naming ABCD, A at the bottom left.
     *
     * @param a length of site a (AB)
     * @param b length of site b (BC)
     */
    public Rectangle(double a, double b) {
        super(a, b, 90);
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
