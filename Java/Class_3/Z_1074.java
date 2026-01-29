package Class_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Z_1074 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        //핵심 로직 : 크게 봤을때, 무조건 사분면 단위로 방문하게 됨 -> 반복

        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());  // r,c를 몇번째에 방문했는지?

        int len = 1<<n;       //한 변의 길이 2^n

        int res = 0;

        while(len>1){
            int half = len/2;
            int block = half * half; // 사분면의 칸의 개수

            int x = 0;                     //몇 사분면에 r/c가 속해있는지 판별
            if (r >= half) x+=2;            // 세로좌표가 절반보다 크다면 2 더하기 (3,4 사분면)
            if (c >= half) x+=1;           // 가로좌표가 절반보다 크다면 1 더하기 (2,4 사분면)

            res += block*x;               //사분면 칸의 개수 * n번째 사분면 -> 범위 정해짐

            if (r >= half) r -= half;       //r과 c범위 재조정
            if (c >= half) c -= half;

            len = half;
        }
        System.out.println(res);
    }
}
