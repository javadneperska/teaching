package sk.zajac.tomas.gl1;

public class Circle {

    private int radius;

    @Override
    public String toString() {
        return ("Circle" + "\nRadius: " + this.getRadius() + "\n");
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double circleArea(){
        return (Math.PI * (Math.pow(this.getRadius(), 2)));
    }

    public double circlePerimeter(){
        return (2 * Math.PI * this.getRadius());
    }

    public double circleDiameter(){
        return (2 * this.getRadius());
    }

}
