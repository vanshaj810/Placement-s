import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("The divisior is: ");
        int divs=sc.nextInt();
        System.out.print("\nThe dividend is: ");
        int div=sc.nextInt();
        int quo=div/divs;
        int rem=div%divs;
        System.out.println("The quotient is: "+quo);
        System.out.println("The remainder is: "+rem);

    }
}
