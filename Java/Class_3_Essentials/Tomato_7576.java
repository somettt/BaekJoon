package Class_3_Essentials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Tomato_7576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());   //상자의 가로
        int n = Integer.parseInt(st.nextToken());  //상자의 세로

        // 1 = 익은 토마토 0 = 안익은 토마토 -1 = 토마토가 없는칸

        //토마토는 상하좌우로 익은게 번질 수 있음
        //토마토가 전부 익을 수 없다면 -1출력

        int[][] arr =  new int[n][m];

        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        ArrayDeque<int[]> queue=new ArrayDeque<>();    //탐색용 큐(BFS) 선언

        int[] searchR = new int[]{0,0,-1,1};
        int[] searchC = new int[]{1,-1,0,0};          //상하좌우 4방향 탐색용 배열 두개

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==1) queue.offer(new int[]{i,j});     //익은 토마토를 전부 큐로 보내기.
            }
        }

        int cnt=0;

        while(!queue.isEmpty()){
            int size=queue.size();
            boolean state = false;

            for(int i=0;i<size;i++) {         // 레벨단위 탐색 시작 (하루)
                int[] cur = queue.poll();
                int r = cur[0];
                int c = cur[1];

                for (int j = 0; j < 4; j++) {

                    int nextR = r + searchR[j];
                    int nextC = c + searchC[j];
                    if (nextR >= 0 && nextR < n && nextC >= 0 && nextC < m){
                        if (arr[nextR][nextC] == -1) continue;              //다음칸이 토마토가 없는 칸이라면 스킵
                        if (arr[nextR][nextC] == 0) {                      //익지 않은 토마토라면,
                            arr[nextR][nextC] = 1;                         // 해당 토마토를 익은 토마토로 표시하고.
                            queue.offer(new int[]{nextR, nextC});        // BFS Queue에 삽입
                            state = true;
                        }
                    }
                }
            }
            if(state)cnt++;
        }

        boolean hasEmpty = false;     // 안익은 토마토가 있는지 확인용

        outer:
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    hasEmpty = true;
                    break outer;
                }
            }
        }

        System.out.println(hasEmpty ? -1:cnt);
    }
}
