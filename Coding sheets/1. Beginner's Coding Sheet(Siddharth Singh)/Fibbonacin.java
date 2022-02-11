import java.util.Scanner;

public class Fibbonacin {
    public static void main(String[] args) {
        int one = 0;
        int two = 1;
        int temp;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(one<=n) {
            System.out.println(one);
            temp = one + two;
            one = two;
            two = temp;
            
        }
    }
}
