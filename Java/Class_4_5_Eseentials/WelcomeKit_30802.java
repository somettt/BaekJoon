package Class_4_5_Eseentials;

import java.util.Scanner;

public class WelcomeKit_30802 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 참가자의 수

        int[] size = new int[6];
        for (int i=0; i<6; i++){
            size[i] = sc.nextInt();
        }

        int T = sc.nextInt(); //티셔츠 묶음 단위
        int P = sc.nextInt(); //펜 묶음 단위

        int cnt = 0;

        for(int i=0; i<6; i++){
            cnt = cnt + (int) Math.ceil(size[i]/(double)T); // 사이즈별로 T로 나눈 후 무조건 올림처리
        }



        System.out.println(cnt);

        System.out.print(n/P+" "+n%P);

    }
}
