package Class_4_5_Eseentials;

import java.util.Scanner;

public class MultiplicationTable_2739 {
    public MultiplicationTable_2739() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 1; i <= 9; ++i) {
            System.out.printf("%d * %d = %d%n", N, i, N * i);
        }

    }
}
