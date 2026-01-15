package Class_1_2_Essentials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class ColoringChessBoard_1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] board =  new char[n][m];

        for (int i=0; i<n; i++){
            String line = br.readLine().trim();
            for (int j=0; j<m; j++){
                board[i][j] = line.charAt(j);
            }
        }

        int w = chess(board,'W');
        int b = chess(board,'B');

        if (w<b) System.out.println(w);
        else System.out.println(b);

    }

    //0-7

    static int chess(char[][]board, char color){
        int X = board[0].length;    //주어진 보드의 가로 크기
        int Y = board.length;      //주어진 보드의 세로 크기
        int min = X*Y;

        for (int i=0; i<=Y-8; i++){
            for (int j=0; j<=X-8; j++){     //시작점 찾기

            int cnt = 0;

            for (int a=0; a<8; a++){     //시작점 기준으로 8X8
                for (int b=0; b<8; b++){
                    if ((a+b)%2== 0 && board[i+a][j+b]!=color) cnt++;   //짝수일때 -> 기준점과 같야아함(시작점 포함)
                    if ((a+b)%2== 1 && board[i+a][j+b]==color) cnt++;   //홀수일때 -> 달라야함.
                }
            }
            if (cnt < min) min = cnt;
            }
        }
        return min;
    }
}
