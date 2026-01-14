package Class_4_5_Eseentials;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PalindromeNumber_1259{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {

            String input = br.readLine();
            if (input == null) break;      // EOF 방어
            if(input.equals("0")) break; // 입력이 0이면 루프 탈출

            int n = input.length();
            StringBuilder sb = new StringBuilder();

            for (int i = n - 1; i >= 0; i--) {        //입력을 뒤집은 문자열 생성
                sb.append(input.charAt(i));
            }

            if (sb.toString().equals(input)) { // 생성된 문자열 비교
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }
    }
}
