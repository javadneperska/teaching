public class Main {
    public static void main(final String[] args) {
        Father f = new Father("foo", "bar");
        Father s = (Father) f.clone();

        System.out.println(f.property);
        System.out.println(s.property);

        f.property.setValue(100000);
        System.out.println(f.property);
        System.out.println(s.property);
    }
}
