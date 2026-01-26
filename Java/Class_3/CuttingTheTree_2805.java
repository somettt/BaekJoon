package Class_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeSet;

//분류: 이분탐색

public class CuttingTheTree_2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());   //나무의 수
        int m = Integer.parseInt(st.nextToken());     //가져가려는 나무의 길이

        int[] log = new int[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            log[i] = Integer.parseInt(st.nextToken());
        }

        // M미터의 나무를 가져가기 위해 설정할 수 있는 높이 H의 최댓값
        Arrays.sort(log);

        int low = 0;          //각 h가 될 수 있는 최대,최솟값
        int high = log[n - 1];
        int res = 0;

        while (low <= high) {
            int mid = (low + high) / 2;  //중간값을 h로 설정

            long sum = 0;

            for (int x : log) {
                if (x > mid) sum += (x - mid); //h(mid)가 x보다 크다면 나머지를 sum에 입력
            }

            if (sum >= m) {         // 현재 mid 값에서 m보다 크다면 (가져갈 수 있다면)
                res = mid;
                low = mid + 1;      // mid값을 늘려서 확인
            } else {
                high = mid - 1;     // 가져갈 수 없다면 mid(h)값을 줄임
            }
        }
        System.out.println(res);
    }
}
