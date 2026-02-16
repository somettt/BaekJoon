package Class_4_Essentials;
//분류 : DFS / 백트래킹

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NandM_5_15654 {
    static int n,m;
    static int[] input;        //입력 저장용
    static int[] arr;          // 출력용
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =  new StringTokenizer(br.readLine());

        //n과 m을 입력받아, 입력받은 n개의 수 중에서 중복없이 m개를 고른 수열을 출력한다.
        //1 ≤ M ≤ N ≤ 8

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        input = new int[n];
        arr = new int[m];                               //버퍼용 m사이즈 배열
        visited = new boolean[n];
        st =  new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            input[i] = Integer.parseInt(st.nextToken());
        }                                                   // 입력단

        Arrays.sort(input);

        dfs(0);
        System.out.println(sb);

    }
    static void dfs(int depth){       //depth는 현재 몇번째 arr 인덱스를 채우고 있는지
        if (depth==m){
            for (int i=0; i<m; i++){
                sb.append(arr[i]).append(i==m-1 ? '\n' : ' ');
            }
            return;
        }
        for (int i = 0; i <n; i++){
            if (visited[i]) continue; //이미 방문한 인덱스라면 생략
            visited[i] = true;
            arr[depth] = input[i];
            dfs(depth+1);     // 여기서 탐색 시작

            visited[i] = false;     //visited 다시 해제 (다른 수열에서도 사용해야함)
        }
    }
}
