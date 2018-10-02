package sk.durisin.jozef.gl1.less4;


public class Main {
    public static void main(String[] args) {
//        System.out.println("Message from lesson 4.");
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
        System.out.println(isEven(3));

    }

    private static int isEven(int number) {
        if (number % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

}
