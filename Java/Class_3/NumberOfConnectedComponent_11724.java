package Class_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class NumberOfConnectedComponent_11724 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());   //노드의 개수
        int m = Integer.parseInt(st.nextToken());   //간선의 개수

        //이후 입력: M개의 줄에 간선의 양 끝점 u/v가 주어짐(중복x)
        //문제 포인트: 고립된 그래프의 개수를 세어야함 -> 입력이 간선을 주기때문에 행렬보다 리스트로 구현하는 것이 용이할 듯

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i <= n; i++) list.add(new ArrayList<>());  // 0은 버리고 사용하기위해 n+1개의 리스트 생성


        for (int i = 1; i <=m; i++) {                    //그래프 생성
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            list.get(u).add(v);                             //무방향이기 때문에 양쪽에 삽입
            list.get(v).add(u);
        }
        int cnt = 0;

        ArrayDeque<Integer> stack = new ArrayDeque<>(); //DFS 사용
        boolean[] visited = new boolean[n+1];                        //방문 확인용

        for (int start=1 ; start<=n; start++) {
            stack.push(start);                                       //1부터 시작
            if (visited[start]) continue; //이미 방문했다면 다음루프
            cnt++;
            while(!stack.isEmpty()){                                // start 노드와 연결된 노드를 모드 탐색 후 visited=True로
                int cur = stack.pop();                              // 다음 루프에서 visited가 true인 경우는 스킵되며 고립된 그래프 개수 판단
                visited[cur] = true;
                for (int next : list.get(cur)) {
                    if (!visited[next]){
                        stack.push(next);
                        visited[next] = true;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
