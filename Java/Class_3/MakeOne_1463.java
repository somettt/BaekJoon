package Class_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

// 분류: DP

public class MakeOne_1463 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        //n까지 그냥 bottom-up 해버리기

        int[] dp = new int[n+1];

        dp[1] = 0;

        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1]+1; //디폴트 값

            if(i%3==0){        // 후보정
                dp[i] = Math.min(dp[i],dp[i/3]+1); //가장 최솟값으로

            }if (i%2==0) {    //6의 배수인 경우 스킵되는걸 막기위해 if문 독립실행 (체인x)
                dp[i] = Math.min(dp[i],dp[i/2]+1);
            }
        }
        System.out.println(dp[n]);
    }
}
