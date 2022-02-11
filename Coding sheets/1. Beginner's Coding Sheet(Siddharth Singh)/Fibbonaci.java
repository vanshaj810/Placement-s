import java.util.Scanner;

public class Fibbonaci {
    public static void main(String[] args) {
        int one = 0;
        int two = 1;
        int temp;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println(one);
            temp = one + two;
            one = two;
            two = temp;
            
        }
    }

}
