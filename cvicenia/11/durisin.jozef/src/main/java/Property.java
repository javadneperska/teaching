public class Property implements Cloneable {
    private double value;

    Property(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    protected Object clone() {
        Property k = null;
        try {
            k = (Property) super.clone();
            k.value = this.value;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return k;
    }

    @Override
    public String toString() {
        return "Property{" +
                "value=" + value +
                '}';
    }
}
