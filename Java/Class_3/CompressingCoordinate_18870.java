package Class_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CompressingCoordinate_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] input = new int[n];
        int[] copy = new int[n];

        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(st.nextToken());
            copy[i] = input[i];
        }

        Arrays.sort(input); //정렬된 배열 완성   -> 중복제거 하면 될듯.

        int m = 0;
        int[] arr = new int[n];

        for (int i=0;i<n;i++){       // 0 - m-1사이즈의 유니크 배열 만들기
            if (i==0 || input[i] != input[i-1]){
                arr[m++] = input[i];
            }
        }

        for (int x: copy){
            int index =  Arrays.binarySearch(arr, 0, m, x);
            sb.append(index).append(" ");
        }
        System.out.println(sb);
    }
}
