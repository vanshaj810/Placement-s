import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("The first number is: ");
        
        int num1=sc.nextInt();
        System.out.print("\n The second number is: ");
        int num2=sc.nextInt();
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("The swapped numbers are "+(num1)+" and "+(num2));
    }
}
