public class Father implements Cloneable {
    String firstName;
    String lastName;
    Property property;

    public Father(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.property = property = new Property(50000);
    }

    protected Object clone() {
        Father k = null;
        try {
            k = (Father) super.clone();
            k.firstName = this.firstName;
            k.lastName = this.lastName;
            k.property = (Property) this.property.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return k;
    }
}
