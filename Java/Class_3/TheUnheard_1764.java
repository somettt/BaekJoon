package Class_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class TheUnheard_1764 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());  // 듣도 못한사람
        int m = Integer.parseInt(st.nextToken());  // 보도 못한 사람

        //조건: 중복 X / 출력은 알파벳 순 -> 중복을 허용하지 않으며 *정렬*이 용이한 자료구조를 사용할 것 -> Tree/Hash Set이 좋아보임

        Set<String> unseen = new TreeSet<>();
        Set<String> unheard = new HashSet<>();


        for (int i = 1; i <= n; i++) {
            unseen.add(br.readLine());
        }
        for (int i = 1; i <= m; i++) {
            unheard.add(br.readLine());
        }
        unseen.retainAll(unheard);

        sb.append(unseen.size()).append("\n");
        for(String str : unseen) {
            sb.append(str).append("\n");
        }
        System.out.println(sb);
    }
}
