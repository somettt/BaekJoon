import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class SortingCoordinate_11650 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n =  Integer.parseInt(br.readLine());

        int[][] coordinates = new int[n][2]; //2차원 배열 생성
        String[] input;

        for (int i = 0; i < n; i++) {
            input = br.readLine().split(" ");
            coordinates[i][0] = Integer.parseInt(input[0]);
            coordinates[i][1] = Integer.parseInt(input[1]);
        }

        Arrays.sort(coordinates, Comparator.comparingInt((int[] x) -> x[0]).thenComparingInt(x -> x[1]));
        // x값 오름차순 정렬 후 y축 오름차순 정렬 (Comparator 클래스 사용)

        for (int i = 0; i < n; i++) {
            sb.append(coordinates[i][0]).append(" ").append(coordinates[i][1]).append("\n");
        }

        System.out.println(sb);
    }
}

