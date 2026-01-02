public class FunctionScope {
    public static void main(String[] args){
        int a = 10;
        int b =20;
        int result = a + b;
        System.out.println(result * a);

    
    
    int returnedValue = random(90); 
System.out.println("Returned value: " + returnedValue);
    }
    static int random (int marks){
        int num = 65;
        System.out.println(num);
        System.out.println(marks);
        return marks;
    }
}
