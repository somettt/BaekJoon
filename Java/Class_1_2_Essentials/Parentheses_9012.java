package Class_1_2_Essentials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parentheses_9012 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 괄호가 완전히 닫혀야함.
        // 조건:
        // 1. 첫번째와 마지막은 각각 '(' , ')' 이어야함.
        // 2. '('과 ')'의 개수는 같아야함.
        // 접근법:
        // (,) 의 개수를 for루프에서 업데이트하며, )이 (보다 루프 내에서 커지지 않음과 동시에 같은 개수로 마무리되는지 확인하기.
        // 자료형은 Array 써도 될듯.

        outer:
        for (int i = 1; i <= n; i++) {
            String input = br.readLine();
            char[] arr =  input.toCharArray();

            if (arr[0] == ')') {
                System.out.println("NO");   //1번조건
                continue;
            }
            if (arr[arr.length-1] == '(') {
                System.out.println("NO"); //1번조건
                continue;
            }


            int a = 0;   // ( 저장용
            int b = 0;   // ) 저장용

            for (int j = 0; j <= arr.length-1; j++) {

                if (arr[j] == '(') a++;
                if (arr[j] == ')') b++;
                if (a < b){
                    System.out.println("NO");
                    continue outer;   //루프 내에서는 절대 커질 수 없음! -> 외부 루프로
                }
            }
            if (a != b){
                System.out.println("NO");
                continue outer;   // a=b인지 검사. -> 아니라면 외부루프로
            }
            System.out.println("YES");         // 아니라면 YES.
        }
    }
}
