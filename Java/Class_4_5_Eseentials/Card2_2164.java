package Class_4_5_Eseentials;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Card2_2164 {
    public static void main(String[] args) {
        /*1번카드가 제일 위, n번카드가 제일 아래,
        제일 위에 있는 카드를 버린 후 이후에 제일 위에 있는 카드를 제일 아래로 옮긴다.

        Array를 이용한 구현 -> 동적 구조가 아니기 때문에 복잡해질듯.
        동적인 자료구조를 활용해 top과 bottom을 실시간으로 업데이트하며 루프하면 될듯 -> ArrayList 사용하자!
         n이 만약 4인경우, 1234 -> 234(1버리기)+342(2아래로) -> 42(3버리기)+24(4아래로) + 2   ==> 총 n-1사이클 필요!
        */

        //추가: 아래에서 이용한 getFirst()같은 메소드는 자바 21이전엔 존재X -> 다른 자료구조 이용하자 -> Queue 사용하기(FIFO니까)

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Queue<Integer> cards =  new LinkedList<>();

        for (int i = 1; i <= n; i++) {    //카드 삽입
            cards.add(i);
        }
        int rear = 0; //남은 카드 출력용

        if (n==1) System.out.println('1'); //n이 1일때는 1을 출력하기.

        else {
            while (cards.size() != 1) {     //n이 1이 아니라면, 사이즈가 1이 될때까지 반복
                cards.remove();   //front 지우기
                int front = cards.element(); // 새로운 front의 값 가져오기
                cards.remove(); //새로운 front 지우기
                cards.add(front); //새로운 front값을 rear로.
                rear = cards.element();
            }

            System.out.println(rear);
        }
    }
}
