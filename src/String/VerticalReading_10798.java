package String;

import java.io.*;

public class VerticalReading_10798  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[][] board;

        board  = new char[5][15]; //보드 크기 설정
        for (int i = 0; i < 5; i++) {
            String inputLine = br.readLine();  //나머지 문자열을 char화 해서 집어넣기
            for (int j = 0; j < inputLine.length(); j++) { //입력된 줄의 길이만큼 인풋
                    board[i][j] = inputLine.charAt(j);
            }
        }

        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                if(board[i][j] != '\0') {
                    sb.append(board[i][j]);
                }
            }
        }
        System.out.println(sb);
    }
}
