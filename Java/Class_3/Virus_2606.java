package Class_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


//분류: 그래프

public class Virus_2606 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 컴퓨터의 수
        int m = Integer.parseInt(br.readLine()); // 순서쌍의 수

        List<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <=n; i++) {
            graph.add(new ArrayList<>()); //컴퓨터 수만큼(0은 버림)
        }

        for (int i = 0; i < m; i++) { //입력받기
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);  //get(인덱스).add(원소)
        }



        boolean[] visited = new boolean[n+1];   //방문 확인용
        Queue<Integer> q = new LinkedList<>(); //방문할 노드 확인용
        int cnt=0;

        q.offer(1);
        visited[1]=true;

        while(!q.isEmpty()){
            int node = q.poll();

            for (int i=0; i< graph.get(node).size(); i++){
                int temp = graph.get(node).get(i); //현재 탐색중인 노드의 인접노드

                if(!visited[temp]) {
                    visited[temp] = true;
                    q.offer(temp);  //방문한적이 없다면, 큐에 추가
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

}
