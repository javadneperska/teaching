public class Main {
    public static void main(String[] argv) throws CloneNotSupportedException {
        Person father = new Person();
        father.setFirstName("miro");
        father.setLastName("katrak");
        Date fatherDob = new Date();
        fatherDob.setDay(1);
        fatherDob.setMonth(8);
        fatherDob.setYear(1952);
        father.setDob(fatherDob);

        Person son = new Person();
        son.setFirstName("miro");
        son.setLastName("katrak");
        Date sonDob = new Date();
        sonDob.setDay(1);
        sonDob.setMonth(8);
        sonDob.setYear(1982);
        son.setDob(sonDob);


        if (father.equals(son)) {
            System.out.println("father and son are equals");
        } else {
            System.out.println("father and son NOT equals");

        }


        final int sonHashCode = son.hashCode();
        System.out.println("sonHashCode: " + sonHashCode);
        final int fahterHashCode = father.hashCode();
        System.out.println("fahterHashCode: " + fahterHashCode);


        Person grandSon = (Person) son.clone();
        System.out.println("grandSon: " + grandSon.toString());

    }
}
