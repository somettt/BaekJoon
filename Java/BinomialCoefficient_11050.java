import java.util.Scanner;

public class BinomialCoefficient_11050 {
    static int factorial(int n){
        if(n==0) return 1;
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = factorial(a) / (factorial(b)*factorial(a-b));

        System.out.println(x);
    }
}
