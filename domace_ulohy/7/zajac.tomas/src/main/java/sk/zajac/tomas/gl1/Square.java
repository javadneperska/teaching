package sk.zajac.tomas.gl1;

public class Square {

    private double width;

    @Override
    public String toString() {
        return ("Square" + "\nHeight: " + this.getWidth() + "\nWidth: " + this.getWidth() + "\n");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double squareArea(){
        return (Math.pow(this.getWidth(), 2));
    }

    public double squarePerimeter(){
        return (4 * this.getWidth());
    }

    public double squareDiagonal(){
        return (this.getWidth() * Math.sqrt(2));
    }
}
