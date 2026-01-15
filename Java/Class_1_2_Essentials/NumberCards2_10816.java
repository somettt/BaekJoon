package Class_1_2_Essentials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class NumberCards2_10816 {
    static int lowerBound(int[] arr, int target){     //경계값만 추출하기
        int low = 0;
        int high = arr.length;
        while (low < high){
            int mid = (low+high)/2;
            if(arr[mid] >= target) high = mid; //시작점
            else low =  mid+1;
        }
        return low;
    }

    static int upperBound(int[] arr, int target){
        int low = 0;
        int high = arr.length;
        while (low < high){
            int mid = (low+high)/2;
            if(arr[mid] > target) high = mid; //마지막점
            else low =  mid+1;
        }
        return low;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(br.readLine());  //숫자 카드의 개수
        System.out.println("n:" +n);
        int[] detailN =  new int[n];
        String[] temp = br.readLine().split(" ");

        for(int i=0;i<n;i++){
            detailN[i] = Integer.parseInt(temp[i]);     //숫자 카드에 할당된 수
        }

        int m = Integer.parseInt(br.readLine());  //주어진 카드의 개수
        int[] detailM =  new int[m];
        temp = br.readLine().split(" ");

        for(int i=0;i<m;i++){              //M개의 카드에 할당된 수
            detailM[i] = Integer.parseInt(temp[i]);
        }

        // M개의 카드에 적힌 수를 상근이가 몇개 갖고 있는가?
        // 시간제한이 관건인듯한.  -> Scanner 이용시 병목 있을수도. -> String Tokenizer?
        // 전부 비교하기보다, N을 정렬 후 이진탐색하기.

        Arrays.sort(detailN);

        int[] result = new int[m];
        for (int i=0;i<m;i++){
            result[i] = 0;
        }

        for (int i=0;i<m;i++){
            int target = detailM[i];
            int x = upperBound(detailN,target);
            int y = lowerBound(detailN, target);

            result[i] = x-y;
        }

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<m; i++) {
            sb.append(result[i]).append(" ");
        }
        System.out.println(sb);
    }
}
