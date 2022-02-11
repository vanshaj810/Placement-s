import java.util.Scanner;

public class Product {
    public static void main(String[] args) {

        
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");

        
        float num1 = scan.nextFloat();
        
        System.out.print("Enter second number: ");
        float num2 = scan.nextFloat();

        scan.close();
        
        
        float product = num1*num2;
        
        System.out.println("Output: "+product);
    }
}

