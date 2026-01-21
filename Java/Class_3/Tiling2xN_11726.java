package Class_3;

import java.util.Scanner;

//분류: DP

public class Tiling2xN_11726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();

        /*
        2x1 사이즈의 경우 -> 1개
        2x2 사이즈의 경우 -> 2개
        2x3 사이즈의 경우 -> 3개
        2x4 사이즈의 경우 -> 5개
        2x5 사이즈의 경우 -> 8개

        마지막을 1자로 끝내기 -> 남은 공간 2x(n-1)의 사이즈와 같음
        마지막을 2개 가로로 끝내기 -> 남은공간2x(n-2)의 사이즈와 같음
        -> 2x(n-1) + 2x(n-2) -> 피보나치 수열

         */

        int[] arr = new int[1001];
        arr[1] = 1;
        arr[2] = 2;

        for(int i=3;i<=n;i++){
            arr[i] = (arr[i-1] + arr[i-2]) % 10007;    //처음부터 나눈 값으로 저장 (정수형이라 표현불가능)
        }

        System.out.println(arr[n]);
    }
}
