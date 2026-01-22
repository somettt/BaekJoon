package Class_3;

//분류: 그래프 탐색

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class HideAndSeek_1697 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 수빈이의 위치
        int k = Integer.parseInt(st.nextToken()); // 동생의 위치

        int cnt = 0; //소요시간

        // 수빈이의 현재 위치를 x라고 했을때,   x-1 / x+1 / x*2 로 움직일 수 있음
        // -> 선택지가 계속 생김 -> 넓이 탐색을 하며 x==k 가 될때 종료하기

        Deque<Integer> q = new ArrayDeque<>();
        boolean[] visited = new boolean[100001];
        q.offer(n);
        visited[n] = true;

        while (!q.isEmpty()) {
            int size = q.size(); // 같은 레벨에 몇개가 있는지
            for (int i = 0; i < size; i++) {     //레벨 개수단위로 처리하면서 cnt 증가
                int x = q.poll();
                if (x == k) {
                    System.out.println(cnt);
                    return;                   // x==k이면 종료
                }
                for (int next : new int[]{x - 1, x + 1, x * 2}) {
                    if (0 <= next && next <= 100000 && !visited[next]) {
                        visited[next] = true;
                        q.offer(next);
                    }
                }
            }
            cnt ++;
        }
    }
}
