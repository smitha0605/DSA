
import java.util.Scanner;
public class EvenNumbersFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Even numbers up to " + n + ":");
        for (int i = 2; i <= n; i += 2) {
            System.out.println(i);
        }
        sc.close();
    }
}
