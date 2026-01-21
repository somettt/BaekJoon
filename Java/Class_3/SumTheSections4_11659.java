package Class_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//분류: 누적 합
public class SumTheSections4_11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());   //수의 개수
        int m = Integer.parseInt(st.nextToken());   // 구해야하는 합의 횟수

        int[] prefix = new int[n+1];      //인덱스 시작을 1부터

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i-1] + Integer.parseInt(st.nextToken());
        }

        for (int x = 0; x < m; x++) {    //출력단
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            int sum = prefix[j]-prefix[i-1];       //i부터 j까지의 합

            sb.append(sum).append("\n");
        }

        System.out.println(sb);

        }
    }