import java.util.*;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.print("Enter 1 to continue or 0 to stop: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter marks (0-100): ");
                int marks = sc.nextInt();

                if (marks >= 90) {
                    System.out.println("This is Good");
                } else if (marks >= 60) {
                    System.out.println("This is also Good");
                } else if (marks >= 0) {
                    System.out.println("This is Good as well");
                    System.out.println("Because marks don't matter but effort does.");
                } else {
                    System.out.println("Invalid marks");
                }
            }
        } while (choice != 0);

        sc.close();
    }
}