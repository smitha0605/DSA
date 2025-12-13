import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number a: ");
        int a = sc.nextInt();

        System.out.print("Enter number b: ");
        int b = sc.nextInt();

        System.out.println("Choose operation:");
        System.out.println("1 : Addition");
        System.out.println("2 : Subtraction");
        System.out.println("3 : Multiplication");
        System.out.println("4 : Division");
        System.out.println("5 : Modulo");
        int op = sc.nextInt();

        switch(op) {
            case 1:
                System.out.println("Result = " + (a + b));
                break;
            case 2:
                System.out.println("Result = " + (a - b));
                break;
            case 3:
                System.out.println("Result = " + (a * b));
                break;
            case 4:
                if(b != 0)
                    System.out.println("Result = " + (a / b));
                else
                    System.out.println("Cannot divide by zero");
                break;
            case 5:
                System.out.println("Result = " + (a % b));
                break;
            default:
                System.out.println("Invalid operation!");
        }
        sc.close();
    }
}