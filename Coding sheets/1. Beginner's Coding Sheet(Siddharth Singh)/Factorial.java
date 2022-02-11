import java.util.Scanner;
import java.util.logging.LogManager;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("The Number is: ");
        Long fact_no=sc.nextLong();
        long facto=1;
        for (int i =1; i <=fact_no ; i++) {
            facto=facto*i;

        }
        System.out.println("factorial value is "+facto);
    }
}
