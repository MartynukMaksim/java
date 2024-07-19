import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        float num1 = sc.nextFloat();
        System.out.println("Enter second number");
        float num2 = sc.nextFloat();
        System.out.println("Enter operation:");
        String op = sc.next();
        float res;
        switch (op){
            case "+":
                res = num1 + num2;
                System.out.println("The result is: " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("The result is: " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("The result is: " + res);
                break;
            case "/":
                res = num1 / num2;
                System.out.println("The result is: " + res);
                break;
        }
    }
}
