public class Main {
    public static final String GREETINGS = "Hello World";
    public static final double PI = 3.14;

    public static void main(String[]args){

        System.out.println(GREETINGS);
        System.out.println("PI: "+ PI);
//        int x = 3;
//        ++x;
//        System.out.println(x);
//        x++;
//        System.out.println(x);

        int x1 = 3;
        int y1 = ++x1 + 1;
        System.out.println(y1);

        int x2 = 3;
        int y2 = x2++ + 1;
        System.out.println(y2);

    }
}