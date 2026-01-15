package Class_1_2_Essentials;

import java.util.Scanner;
import java.util.TreeSet;

public class FindingNumbers_1920 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> tree = new TreeSet<>();
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            tree.add(sc.nextInt()); //n은 트리에 저장
        }

        int m = sc.nextInt();
        int[] arr = new int[m]; //m 저장용 배열

        for(int i=0; i<m; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<m; i++){
            int a = arr[i];
            if (tree.contains(a)) sb.append(1).append('\n');
            else sb.append(0).append('\n');
        }
        System.out.println(sb);

    }
}
