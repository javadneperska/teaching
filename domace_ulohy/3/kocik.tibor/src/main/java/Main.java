
import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    static Scanner sc = new Scanner(System.in);
    static int language;

    public static  void main(String []args) {

        double num1 = 0;
        double num2 = 0;
        double[] numbers = new double[2];
        ArrayList<String> mode = new ArrayList<String>();



        printLogo();
        askLanguage();
        numbers = askNumbers();
        if(numbers != null)
        {
            num1 = numbers[0];
            num2 = numbers[1];
        }
        mode = askMode();
        calculateNumbers(num1,num2,mode,language);

    }

    public static void printLogo()
    {
        System.out.println("*****************************************************************");
        System.out.println("*****************************************************************");
        System.out.format("%65s%n","cccccc          a           l                cccccc     **");
        System.out.format("%65s%n","c                a  a         l              c            **");
        System.out.format("%65s%n","c                a    a        l             c             **");
        System.out.format("%65s%n","c                a      a       l            c              **");
        System.out.format("%65s%n","c               aaaaaaaaaa      l            c              **");
        System.out.format("%65s%n","c              a          a     l            c              **");
        System.out.format("%65s%n","c            a            a    l             c             **");
        System.out.format("%65s%n"," c          a              a   l              c            **");
        System.out.format("%65s%n","cccccc  a                a  lllllllll        cccccc     **");
        System.out.println("*****************************************************************");
        System.out.println("*****************************************************************");
    }
    public static void askLanguage()
    {
        System.out.println("Vyberte jazyk / Choose language");
        System.out.format("%14s%n", "1. Slovenský");
        System.out.format("%12s%n", "2. English");


        String languageS;
        do {
            languageS = sc.next();
            if(languageS.charAt(0) == '1' || languageS.charAt(0) == '2')
            {
                language = Integer.parseInt(languageS);
                break;
            }
            else
            {
                System.out.println("Nezadali ste správne číslo jazyka / You didn't use proper number of language");
            }
        }
        while(languageS != "1" || languageS !="2");
    }
    public static double[] askNumbers()
    {
        double[] res = new double[2];
        if(language==1)
            System.out.println("\nZadajte prosím prvé číslo");
        else
            System.out.println("\nPlease insert the first number");
        while(!sc.hasNextDouble())
        {
            if(language == 1) {
                System.out.println("Nezadali ste číslo");
                System.out.println("\nZadajte prosím prvé číslo");
            }
            else
            {
                System.out.println("You didn't insert number");
                System.out.println("\nPlease insert the first number");
            }
            sc.next();
        }
        res[0] = sc.nextDouble();
        if(language == 1)
            System.out.println("Zadajte prosím druhé číslo");
        else
            System.out.println("Please add the second number");
        while(!sc.hasNextDouble())
        {
            if(language == 1) {
                System.out.println("Nezadali ste číslo");
                System.out.println("\nZadajte prosím druhé číslo");
            }
            else {
                System.out.println("You didn't insert number");
                System.out.println("\nPlease add the second number");
            }
            sc.next();
        }
        res[1] = sc.nextDouble();

        return res;
    }
    public static ArrayList<String> askMode()
    {
        ArrayList<String> mode = new ArrayList<String>();

        if(language == 1) {
            System.out.println("\n***********************************************");
            System.out.format("%10s%n", "Vyberte mód výpočtu:");
            System.out.format("%18s%n", "1. súčet");
            System.out.format("%20s%n", "2. rozdiel");
            System.out.format("%18s%n", "3. súčin");
            System.out.format("%19s%n", "4. podiel");
            System.out.println("Pre ukončenie režimu vyberu módu zadajte 's'\n");
            System.out.println("***********************************************");
        }
        else {
            System.out.println("\n***********************************************");
            System.out.format("%10s%n", "Select the mode of calculation:");
            System.out.format("%18s%n", "1. add");
            System.out.format("%19s%n", "2. diff");
            System.out.format("%19s%n", "3. mult");
            System.out.format("%18s%n", "4. div");
            System.out.println("For exiting from mode selection please insert 's'\n");
            System.out.println("***********************************************");
        }
        while(!sc.hasNext("s")) {
            String value = sc.next();
            switch (value.charAt(0)) {
                case '1':
                case '2':
                case '3':
                case '4':
                    mode.add(value);
                    break;
                default:
                    if(language == 1)
                        System.out.println("Nezadali ste správne číslo módu\n");
                    else
                        System.out.println("You didn't use correct numbert\n");
            }
        }
        return mode;
    }
    public static void calculateNumbers(double num1, double num2, ArrayList<String> mode, int language)
    {
        for(int i=0;i<mode.size();i++)
        {
            switch (mode.get(i).charAt(0))
            {
                case '1':
                    Operation.ADD.Calculate(num1,num2, language);
                    break;
                case '2':
                    Operation.DIFF.Calculate(num1,num2, language);
                    break;
                case '3':
                    Operation.MULT.Calculate(num1,num2, language);
                    break;
                case '4':
                    Operation.DIV.Calculate(num1,num2, language);
                    break;
                default:
                    System.out.println("\nError");
            }
        }
    }
}
