import java.util.Scanner;

public class Sumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        int sum = (n*(n + 1)) / 2;
        System.out.println("Sum of n natural Numbers by method one is " + sum);
        for (int i = 0; i <=n; i++) {
            c+=i;
        }
        System.out.println("Sum of n natural Numbers by method two is " + c);
    }
}
