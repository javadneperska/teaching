package sk.zajac.tomas.gl1;

public class Triangle {

    private int sideA;
    private int sideB;
    private int sideC;

    @Override
    public String toString() {
        return ("Triangle" + "\nSide A: " + this.getSideA() + "\nSide B: " + this.getSideB() + "\nSide C: " + this.getSideC() + "\n");
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public double triangleArea(){
        double s = (double)(this.getSideA() + this.getSideB() + this.getSideC()) / 2;

        return (Math.sqrt(s * (s - this.getSideA()) * (s - this.getSideB()) * (s - this.getSideC())));
    }

    public double trianglePerimeter(){
        return (this.getSideA() + this.getSideB() + this.getSideC());
    }

    public double triangleHeight(){
        double triangleArea = this.triangleArea();

        return (2 * (triangleArea / this.getSideA()));
    }

}
