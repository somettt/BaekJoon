package Class_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class MeetingRoom_1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int[][] table = new int[n][2];

        for (int i = 0; i < n; i++) {   //회의 입력
            st = new StringTokenizer(br.readLine());
            table[i][0] = Integer.parseInt(st.nextToken());
            table[i][1] = Integer.parseInt(st.nextToken());
        }
        //접근법 -> 종료 시간이 작은 것부터 집어넣으면 -> 뒤에 더 많은 공간이 생긴다 -> 최대의 이용수

        Arrays.sort(table, Comparator.comparingInt((int[] a) -> a[1]).thenComparingInt(a -> a[0])); //종료시각 기준 오름차순 정렬

        int cnt = 0;
        int prev = 0;
        for (int i = 0; i < n; i++) {
            if (table[i][0]>= prev){   //회의의 시작 시간이 이전회의의 종료시간보다 크거나 같다면.
                cnt++;
                prev = table[i][1];  //prev를 현재 회의의 종료시간으로
            }
        }
        System.out.println(cnt);
    }
}
