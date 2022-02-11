import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.print("\nEnter the second number: ");
        int num2=sc.nextInt();
        int num3=num1+num2;
        System.out.println("Sum using first method: "+num3);
        System.out.println("Sum using second method: "+(num1+num2));
    }
}
