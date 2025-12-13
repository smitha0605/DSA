import java.util.Scanner;
public class EvenNumbersWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Even numbers up to " + n + ":");
        int i = 2;
        while (i <= n) {
            System.out.println(i);
            i += 2;
        }
        sc.close();
    }
}
