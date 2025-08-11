package Implementation;

import java.util.*;

public class Stock_20546 {

    // BNP: 매일 가능한 만큼 매수, 끝날 때 평가
    static int BNP(int s, int[] p){
        int cash = s, stock = 0;
        for (int price : p) {
            int buy = cash / price;
            if (buy > 0) {
                stock += buy;
                cash  -= buy * price;
            }
        }
        return cash + stock * p[p.length - 1];
    }

    // TIMING: 3연상→오늘 전량 매도, 3연하→오늘 전량 매수
    static int Timing(int s, int[] p){
        int cash = s, stock = 0;
        int up = 0, down = 0;

        for (int i = 1; i < p.length; i++) {
            if (p[i] > p[i-1]) { up++;   down = 0; }
            else if (p[i] < p[i-1]) { down++; up = 0; }
            else { up = 0; down = 0; }

            if (up >= 3 && stock > 0) {            // 전량 매도
                cash += stock * p[i];
                stock = 0;
            } else if (down >= 3 && cash >= p[i]) { // 전량 매수(가능한 만큼)
                int buy = cash / p[i];
                stock += buy;
                cash  -= buy * p[i];
            }
        }
        return cash + stock * p[p.length - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seed = Integer.parseInt(sc.nextLine().trim());
        String[] m = sc.nextLine().trim().split("\\s+");

        int[] price = new int[m.length];
        for (int i = 0; i < m.length; i++) price[i] = Integer.parseInt(m[i]);

        int sm = BNP(seed, price);
        int jh = Timing(seed, price);

        if (sm > jh)      System.out.println("BNP");
        else if (sm < jh) System.out.println("TIMING");
        else              System.out.println("SAMESAME");
    }
}
