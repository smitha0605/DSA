import java.util.Scanner;
public class count {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Enter digit to count: ");
        int digitToCount = sc.nextInt();
              int count = 0;

        while (num > 0) {
            int lastDigit = num % 10;

            if (lastDigit == digitToCount) {
                count++;
            }

            num = num / 10;
        }

        System.out.println("Count = " + count);
        sc.close();
       
    }
}

    
      

    

