package sk.globallogic.durisin.lesson.geometry;


/**
 * Class for representing a square.
 */
public class Square extends Rectangle {
    public static final String name = "square";

    /**
     * Initializes Square.
     * Note: Based on standard naming ABCD, A at the bottom left.
     *
     * @param a length of site a (AB)
     */
    public Square(double a) {
        super(a, a);
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
