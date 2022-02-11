import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The first number is: ");
        int num1 = sc.nextInt();
        System.out.print("\n The 2nd number is: ");
        int num2 = sc.nextInt();
        System.out.print("\nThe 3rd number is: ");
        int num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the Greatest");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the Greatest");
        } else {
            System.out.println(num3 + " is the Greatest");
        }

    }
}
