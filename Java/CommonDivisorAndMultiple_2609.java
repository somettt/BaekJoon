import java.util.Scanner;

public class CommonDivisorAndMultiple_2609 {
    static int euclidean(int a, int b) {
        if (b == 0) return a;
        return euclidean(b, a % b);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = euclidean(a, b);
        int lcm = (a*b)/gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }
}
