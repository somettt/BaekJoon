    package Class_4_Essentials;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.StringTokenizer;

    public class NandM_2_15650 {
        static StringBuilder sb = new StringBuilder();
        static int n;
        static int m;
        static int[] arr;
        public static void main(String[] args) throws IOException {
            //n과 m을 입력받아, 1부터n까지의 자연수 중에서 중복없이 m개를 고른 수열을 출력한다.
            //1 ≤ M ≤ N ≤ 8

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st =  new StringTokenizer(br.readLine());

            n =  Integer.parseInt(st.nextToken());
            m =  Integer.parseInt(st.nextToken());
            arr =  new int[m];

            dfs(0,1);

            System.out.println(sb);
        }
        public static void dfs(int depth, int start){
            if (depth == m) {           //depth(몇개 채웠는지)가 m개와 같아진다면?
                for (int i = 0; i < m; i++){
                    sb.append(arr[i]).append(i==m-1 ? '\n' : ' ');      //m번째 인덱스라면 줄바꿈 , 아니라면 공백
                }
                return;
            }
                for (int i = start; i<=n; i++){  //start부터 n범위까지
                    arr[depth] = i;
                    dfs(depth+1, i+1); // i보다 큰 수를 다시 호출 (다음 자릿수부터, 마지막으로 넣은 수 보다 큰 값부터)
                }

        }
    }
