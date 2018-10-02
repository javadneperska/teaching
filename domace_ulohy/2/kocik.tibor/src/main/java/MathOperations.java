public class MathOperations {

    public double Add (double num1, double num2)
    {
        System.out.println("\nVýsedok sčítania je: " + (num1+num2));
        return (num1+num2);
    }

    public double Diff (double num1, double num2)
    {
        System.out.println("\nVýsedok odčítania je: " + (num1-num2));
        return (num1-num2);
    }

    public double Mult (double num1, double num2)
    {
        System.out.println("\nVýsedok násobenia je: " + (num1*num2));
        return (num1*num2);
    }

    public double Div (double num1, double num2)
    {
        System.out.println("\nVýsedok delenia je: " + (num1/num2));
        return (num1/num2);
    }
}
