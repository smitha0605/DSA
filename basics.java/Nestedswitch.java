import java.util.Scanner;
public class Nestedswitch {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int empID = sc.nextInt();
        String department = sc.next();

        switch(empID){
            case 1 :
                System.out.println("Smitha");
                break;
                case 2 :
                    System.out.println("Kunal");
                    break;
                case 3: 
                        System.out.println("Emp number 3");  
                    switch(department){
                        case "IT" :
                            System.out.println("IT Department");
                            break;
                            case "CSE" :
                                System.out.println("CSE Department");
                                break;
                                default :
                                System.out.println("No Department found");
                                break;
                    }
        }
        sc.close();

    }
    
}
