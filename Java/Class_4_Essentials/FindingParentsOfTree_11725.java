package Class_4_Essentials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FindingParentsOfTree_11725 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        List<Integer>[] list = new ArrayList[n+1];
        for(int i=1;i<=n;i++){
            list[i] = new ArrayList<>();
        }

        for (int i=0;i<n-1;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list[x].add(y);
            list[y].add(x);
        }

        //2번 노드부터 출력하기

        Deque<Integer> stack = new ArrayDeque<>();     //DFS를 위한 스택(LIFO)
        int[] parents = new int[n+1];                  //정답 기록용 배열
        boolean[] visited = new boolean[n+1];
        stack.push(1);
        visited[1] = true;

        while(!stack.isEmpty()){                          //탐색 시작
            int cur =  stack.pop();

            for (int i=0;i<list[cur].size();i++){     //1과 연결된 노드를 방문 하기
                int child = list[cur].get(i);

                if (!visited[child]){                 //현재 노드에서 처음 발견됐다 -> cur를 부모로 갖는 새로운 노드임
                    visited[child] = true;
                    stack.push(child);
                    parents[child] = cur;
                }
            }
        }
        for (int i = 2;i<=n;i++){
            sb.append(parents[i]+"\n");
        }
        System.out.println(sb);
    }
}
