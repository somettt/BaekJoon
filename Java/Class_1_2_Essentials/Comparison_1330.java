package Class_1_2_Essentials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Comparison_1330 {
    public Comparison_1330() {
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer input = new StringTokenizer(bf.readLine());
        int a = Integer.parseInt(input.nextToken());
        int b = Integer.parseInt(input.nextToken());
        if (a > b) {
            System.out.println(">");
        }

        if (a == b) {
            System.out.println("==");
        }

        if (a < b) {
            System.out.println("<");
        }

    }
}
