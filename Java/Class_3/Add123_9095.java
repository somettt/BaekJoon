package Class_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Add123_9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        int[] arr = new int[11];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        for(int c=4;c<11;c++){
            arr[c] = arr[c-1] + arr[c-2] + arr[c-3];
        }

        for (int i = 0; i < t; i++) {
            int n =  Integer.parseInt(br.readLine());
            System.out.println(arr[n]);
        }

        /*
        1. 1개
        2. 2개
        3. 4개

        4를 표현할 수 있는 경우의 수 - 1+3(4개) / 2+2(2개) / 3+1(1개) -> 7개
        5를 표현할 수 있는 경우의 수 - 1+4 (7개), 2+3(4개), 3+2(2개) -> 13개
        6                       - 1+5(13개), 2+4(7개), 3+3(4개)  24개
        7                       -> 24개 + 13개 + 7개 -> 44개
         */
    }
}
