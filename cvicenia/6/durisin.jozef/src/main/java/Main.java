public class Main {
    public static void main(String[] args) {
        Util.printEuro(30);

        System.out.println(Util.fact(5));

        Person foo = new Person("foo", "bar");
        Person bar = new Person("foobar", "bar");

        System.out.println(foo.toString());
        System.out.println(bar.toString());

        System.out.println(Person.COUNT_PERSON);
    }

}
