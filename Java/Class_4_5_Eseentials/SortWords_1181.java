package Class_4_5_Eseentials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SortWords_1181 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> words = new TreeSet<>(Comparator.<String>comparingInt(String::length).thenComparing(String::compareTo));
        // Tree Set을 이용한 자동정렬
        for (int i = 0; i < n; i++) {
            words.add(br.readLine());
        }
        List<String> list = new ArrayList<>(words); //한줄씩 출력하기 위한 TreeSet->List 변환

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
