package Class_3;

//분류 : 분할정복 / 재귀

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class MakingColoredPaper_2630 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[][] paper = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 종료 조건 -> 모든 종이가 단일색 or 변이 2가 됐을 때
        // 그 전까지 반복하기 -> DFS 응용하여 풀이 가능할 듯

        ArrayDeque<int[]> stack = new ArrayDeque<>(); //시작 행,열 / 변의 길이를 저장하기
        stack.push(new int[]{0,0,N});                 //처음 삽입은 전체 행렬

        int blue = 0;
        int white = 0;

        while(!stack.isEmpty()){
            int[] cur = stack.pop();
            int y =  cur[0];
            int x = cur[1];
            int len = cur[2];

            int base = paper[y][x];
            boolean isUniform = true;

            for (int i = y; i < y+len; i++) {
                for (int j = x; j < x+len; j++) {
                    if(paper[i][j] != base){
                        isUniform = false;
                        break;
                    }
                }
                if(!isUniform) break;
            }

            if(isUniform){
                if(base == 0) white++;
                else blue++;
            } else{
                int h = len/2;
                stack.push(new int[]{y,x,h});
                stack.push(new int[]{y+h,x,h});
                stack.push(new int[]{y,x+h,h});
                stack.push(new int[]{y+h,x+h,h});        //4등분 값 삽입
            }
        }
        System.out.println(white);
        System.out.println(blue);
    }
}
