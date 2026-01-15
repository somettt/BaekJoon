package Class_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//분류: 그리디

public class ATM_11399 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] cost = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        //문제 접근법 -> n까지 소모된 시간을 최소로 만드는 것이 핵심 -> 오름차순 정렬

        for(int i=0; i<n; i++){
            cost[i] = Integer.parseInt(st.nextToken()); //배열에 값 입력
        }
        Arrays.sort(cost);               //배열 오름차순으로 정렬

        int result = 0;
        int sum = 0;

        for (int i=0; i<n; i++){
            sum += cost[i];     //i번째 사람이 기다린 시간,
            result += sum;      //총 대기 시간
        }

        System.out.println(result);
    }
}
