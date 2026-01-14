package Class_4_5_Eseentials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SumOfNumbers_11720 {
    public SumOfNumbers_11720() {
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        new Scanner(System.in);
        int n = Integer.parseInt(bf.readLine());
        if (n <= 100 && n >= 1) {
            int sum = 0;
            char[] input = bf.readLine().toCharArray();
            int[] a = new int[input.length];

            for(int i = 0; i < input.length; ++i) {
                a[i] = input[i] - 48;
                sum += a[i];
            }

            System.out.println(sum);
        }
    }
}
