package sk.robovarga.les4;

import java.util.ArrayList;

public class Main {

    public static void main(String args[]){

        System.out.println("Som na hodine 4");

//        List x = new ArrayList<String>();


        for (int i = 0; i < 10; i++) {
            System.out.println( i + " je parne? " + isEven(i) );
        }

    }


    public static int isEven(int num){
        return

        if (num % 2 == 1){
            return 0;
        }else{
            return 1;
        }
    }

}
