import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class StringReiterate_2675 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int n;
        String s;

        for (int i = 1; i <= T; i++) { //테스트 케이스 개수만큼 반복
            String[] input = br.readLine().split(" ");
            n = Integer.parseInt(input[0]);
            s = input[1];

            for (int j = 0; j<s.length(); j++) { //문자열 길이만큼 반복
                for (int k = 0; k < n; k++) { // n번만큼 반복
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
