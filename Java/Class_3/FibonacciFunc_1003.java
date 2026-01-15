package Class_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//분류: DP

public class FibonacciFunc_1003 {
    //입력을 받았을 때, n까지의 0,1값을 저장할 필요가 있을듯.  (시간제한이 0.25초임)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[][] arr = new int[41][2];    //저장공간
        arr[0][0] = 1;
        arr[0][1] = 0;
        arr[1][0] = 0;
        arr[1][1] = 1;
        for (int i = 2; i < 41; i++) {
            arr[i][0] = arr[i-1][0] + arr[i-2][0];
            arr[i][1] = arr[i-1][1] + arr[i-2][1];
        }                                               //0~40까지의 모든 0,1계산

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            sb.append(arr[N][0]).append(" ").append(arr[N][1]).append("\n");
        }
        System.out.println(sb);
    }

}


/*   피보나치 재귀함수에서의 0 , 1 호출 횟수
0         1   0
1         0   1
2         1   1
3         1   2     (1호출 / 2호출)
4         2   3     (2호출 / 3호출)
5         3   5     (3호출 / 4호출)
6         5   8     (4호출 / 5호출)
7         8   13    (5호출 / 6호출)
8         13  21    (6호출 / 7호출)
 */
// 그냥 전체 0,1호출횟수를 한번에 저장하기?