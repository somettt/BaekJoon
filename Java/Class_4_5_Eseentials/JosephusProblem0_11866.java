package Class_4_5_Eseentials;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JosephusProblem0_11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        sb.append('<');

        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            q.offer(i);                // 큐에 데이터 입력
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < k; j++) {    //k-1번만큼 데이터를 뒤로 이동
                q.offer(q.poll());
            }
            sb.append(q.poll()); //k번째 엘리먼트 제거
            if(!q.isEmpty())sb.append(", ");  //출력 형식 맞추기
        }
        sb.append(">");
        System.out.println(sb.toString());
    }
}
