package sk.zajac.tomas.gl1;

public class Rectangle {

    private int height;
    private int width;

    @Override
    public String toString() {
        return ("Rectangle" + "\nHeight: " + this.getHeight() + "\nWidth: " + this.getWidth() + "\n");
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double rectangleArea(){
        return (this.getHeight() * this.getWidth());
    }

    public double rectanglePerimeter(){
        return ((2 * this.getWidth()) + (2* this.getHeight()));
    }

    public double rectangleDiagonal(){
        return (Math.sqrt((Math.pow(this.getWidth(), 2)) + (Math.pow(this.getHeight(), 2))));
    }
}
