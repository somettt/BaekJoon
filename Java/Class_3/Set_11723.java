package Class_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;
import java.util.StringTokenizer;

public class Set_11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());

        //문제에서 주어진 조건
        // 중복 없음, remove, check , toggle, all, empty -> BitSet 쓰기! (메모리 아끼기)

        BitSet S = new BitSet();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<m;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if(command.equals("add")) {
                int x =  Integer.parseInt(st.nextToken());
                add(x,S);
            }
            else if(command.equals("remove")) {
                int x =  Integer.parseInt(st.nextToken());
                remove(x,S);
            }
            else if(command.equals("check")){
                int x =  Integer.parseInt(st.nextToken());
                sb.append(check(x,S)).append("\n");
            }
            else if(command.equals("toggle")){
                int x =  Integer.parseInt(st.nextToken());
                toggle(x,S);
            }
            else if(command.equals("all")){
                all(S);
            }
            else {
                empty(S);
            }
        }
        System.out.println(sb);
    }
    static void add(int x, BitSet S) {   //연산 메소드 구현하기
        if (x>=1 && x<=20) S.set(x);   //어차피 Set이라서 중복X
    }
    static void remove(int x, BitSet S) {
        if (x>=1 && x<=20) S.clear(x);
    }
    static int check(int x, BitSet S) {
        if (x>=1 && x<=20) return S.get(x) ? 1:0;
        else return -1;
    }

    static void toggle(int x, BitSet S) {
        if (x>=1 && x<=20){    //주어진 x범위 내에서
            if(S.get(x)){    //x가 있다면 제거
                S.clear(x);
            }
            else {            //x가 없다면 추가
                S.set(x);
            }
        }
    }

    static void all(BitSet S) {
        S.clear(0);
        for (int i=1 ; i<=20 ; i++) {
            S.set(i);
        }
    }

    static void empty(BitSet S) {
        S.clear();
    }

}
