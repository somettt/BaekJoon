package Class_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

//분류: 그래프, 그래프탐색, 플러드필

public class OrganicCabbage_1012 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken()); //테스트 케이스의 개수

        for (int test = 0; test < T; test++) {
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken()); // 밭의 가로길이
            int N =  Integer.parseInt(st.nextToken()); //세로길이
            int K = Integer.parseInt(st.nextToken()); //배추가 심어진 위치의 개수

            int cnt = 0;                                //필요 지렁이


            boolean[][] field = new boolean[N][M];
            boolean[][] visited = new boolean[N][M];
            int[] dr = {-1,1,0,0};      //상하좌우 이동용 배열
            int[] dc = {0,0,-1,1};


            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                field[y][x] = true;                       //밭 구현
            }
            for (int r = 0; r < N; r++) {         //세로길이 탐색
                for (int c = 0; c < M; c++) {     //가로길이 탐색
                    if (field[r][c] && !visited[r][c]) { //필드에 배추가 존재하고, 방문하지 않았으면
                        cnt++;
                        visited[r][c] = true;
                        ArrayDeque<int []> stack = new ArrayDeque<>(); //DFS용 스택(덱사용) -> 4방향의 좌표들이 저장됨

                        stack.push(new int[]{r,c});    //현재 위치 스택에 삽입

                        while (!stack.isEmpty()) {
                            int[] cur = stack.pop(); //현재 위치
                            int curR = cur[0], curC = cur[1];

                            for (int k = 0; k < 4; k++) {
                                int nr = curR + dr[k];         //행 변화 (세로)
                                int nc = curC + dc[k];         //열 변화 (가로)

                                if (nr < 0 || nc < 0 || nr >= N || nc >= M) continue; // 경계 설정
                                if (!field[nr][nc] || visited[nr][nc]) continue;      // 이미 방문한 경우

                                visited[nr][nc] = true;
                                stack.push(new int[]{nr, nc});
                            }
                        }
                    }
                }
            }
            System.out.println(cnt);

        }
    }
}
