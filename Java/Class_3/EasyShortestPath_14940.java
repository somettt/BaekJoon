package Class_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

public class EasyShortestPath_14940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] start = new int[2];

        int[][] matrix = new  int[n][m];
        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++){
                int x = Integer.parseInt(st.nextToken());
                matrix[i][j] = x;
                if (x==2){
                    start[0] = i;
                    start[1] = j;
                }
            }
        }
        int[][] dist = new  int[n][m];  // 출력할 배열 생성

        for (int i = 0; i < n; i++){
            Arrays.fill(dist[i], -1);
        }

        ArrayDeque<int[]> q = new ArrayDeque<>();    //좌표 저장용 큐
        q.add(start);                     //시작 좌표 입력
        dist[start[0]][start[1]] = 0;

        int[] dr = {-1, 1, 0, 0}; // 위, 아래, 왼쪽, 오른쪽 (행 변화)
        int[] dc = {0, 0, -1, 1}; // 위, 아래, 왼쪽, 오른쪽 (열 변화)

        while (!q.isEmpty()){
            int[] cur = q.remove();
            int r = cur[0];
            int c = cur[1];

            for (int i=0; i<4; i++){
                int nextR = r + dr[i];
                int nextC = c + dc[i];

                if (nextR < 0 || nextR >= n || nextC < 0 || nextC >= m) continue; //범위설정

                if (matrix[nextR][nextC] == 0) continue;    // 벽이 존재하면 스킵
                if (dist[nextR][nextC] != -1) continue;     // 방문한 곳이라면 스킵

                dist[nextR][nextC] = dist[r][c] + 1;
                q.add(new int[]{nextR, nextC});
            }
        }
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                if (matrix[i][j] == 0) sb.append(0).append(" ");
                else sb.append(dist[i][j]).append(" ");
            }
            sb.append('\n');
        }
        System.out.println(sb);

    }
}
