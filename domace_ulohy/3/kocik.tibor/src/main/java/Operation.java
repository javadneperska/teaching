
public enum Operation {
    ADD,
    DIFF,
    MULT,
    DIV;

    double Calculate(double num1, double num2,int language) {
        switch (this) {
            case ADD:
                if(language == 1)
                    System.out.println("\nVýsedok sčítania je: " + (num1 + num2));
                else
                    System.out.println("\nThe result of adding is: " + (num1 + num2));
                return (num1 + num2);
            case DIFF:
                if(language == 1)
                    System.out.println("\nVýsedok odčítania je: " + (num1 - num2));
                else
                    System.out.println("\nThe result of difference is: " + (num1 - num2));
                return (num1 - num2);
            case MULT:
                if(language == 1)
                    System.out.println("\nVýsedok násobenia je: " + (num1 * num2));
                else
                    System.out.println("\nThe result of multiplication is: " + (num1 * num2));
                return (num1 * num2);
            case DIV:
                if(language == 1)
                    System.out.println("\nVýsedok delenia je: " + (num1 / num2));
                else
                    System.out.println("\nThe result of dividing is: " + (num1 / num2));
                return (num1 / num2);
            default:
                return 0;
        }
    }
}

