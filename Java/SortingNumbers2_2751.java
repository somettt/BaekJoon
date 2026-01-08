import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class SortingNumbers2_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();        // 출력시간 최소화를 위해 StringBuilder 사용

        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> nums = new ArrayList<>();     //기본 배열은 너무 느렸음

        for (int i = 0; i < n; i++) {
            nums.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(nums);       //Arrays.sort 대신 Collections 사용

        for(Integer i:nums){
            sb.append(i).append('\n');
        }
        System.out.println(sb);
    }
}
