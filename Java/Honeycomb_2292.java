import java.util.Scanner;

public class Honeycomb_2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //1은 1칸 2~7(6칸) = 2칸 , 8~19(총 12칸) = 3칸,  20~37(총18칸) = 4칸

        int cnt = 0;
        int range = 1;

        while(true){                //루프를 통해 최댓값을 갱신 후 입력값 n과 비교
            range = range + (cnt*6);         // 1 - 7 - 19 - 37 ...
            if(range >= n) break;  //n보다 range의 값이 더 크다면, 루프 탈출
            cnt++;                 //cnt값 유지
        }
        System.out.println(cnt+1); //시작 칸도 포함
    }
}
