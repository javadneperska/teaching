package sk.globallogic.durisin.lesson.geometry;


/**
 * Class for representing a parallelogram.
 */
public class Parallelogram {
    public static final String name = "parallelogram";

    private double a;
    private double b;
    private double alpha;

    private double heightA;
    private double heightB;

    private double d1;
    private double d2;

    private double area;
    private double perimeter;

    /**
     * Initializes Parallelogram.
     * Note: Based on standard naming ABCD, A at the bottom left.
     *
     * @param a length of side a (AB)
     * @param b length of side b (BC)
     * @param alpha size of angle alpha in degrees (angle between site a (AB) and d (DA))
     */
    public Parallelogram(double a, double b, double alpha) {
        this.a = a;
        this.b = b;
        this.alpha = alpha;

        heightA = b * Math.sin(Math.toRadians(alpha));
        heightB = a * Math.sin(Math.toRadians(alpha));

        d1 = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) + 2 * a * b * Math.cos(Math.toRadians(alpha)));
        d2 = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(Math.toRadians(alpha)));

        area = a * heightA;
        perimeter = 2 * (a + b);
    }

    /**
     * Returns length of site a.
     *
     * @return length of site a
     */
    public double getA() {
        return a;
    }

    /**
     * Returns length of site b.
     *
     * @return length of site b
     */
    public double getB() {
        return b;
    }

    /**
     * Returns size of angle alpha.
     *
     * @return size of angle alpha
     */
    public double getAlpha() {
        return alpha;
    }

    /**
     * Returns height to site a.
     *
     * @return height to site a
     */
    public double getHeightA() {
        return heightA;
    }

    /**
     * Height to site b.
     *
     * @return
     */
    public double getHeightB() {
        return heightB;
    }

    /**
     * Returns length of diagonal AC.
     *
     * @return length of diagonal d1
     */
    public double getD1() {
        return d1;
    }

    /**
     * Retorns length of diagonal BD.
     *
     * @return length of diagonal d2
     */
    public double getD2() {
        return d2;
    }

    /**
     * Gets name of the polygon.
     *
     * @return name of the polygon
     */
    public String getName() {
        return name;
    }

    /**
     * Returns string representation.
     *
     * @return string representation
     */
    @Override
    public String toString() {
        return "a=" + a + ", b=" + b + ", alpha=" + alpha + ", area=" + area + ", perimeter=" + perimeter;
    }
}
