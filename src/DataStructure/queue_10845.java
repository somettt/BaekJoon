package DataStructure;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

class queue {
    private LinkedList<Integer> queue = new LinkedList<>(); //링크드 리스트를 이용한 큐 구현

    public void push(int x) {
        queue.add(x);
    }

    public int pop() {
        if (queue.isEmpty())
            return -1;
        else return queue.removeFirst();
    }

    public int size() {
        return queue.size();
    }

    public int empty() {
        return queue.isEmpty() ? 1 : 0;
    }

    public int front() {
        return queue.isEmpty() ? -1 : queue.getFirst();
    }

    public int back() {
        return queue.isEmpty() ? -1 : queue.getLast();
    }
}
public class queue_10845 {
    public static void main (String[]args) throws IOException {
        queue q = new queue();
        //속도를 위해 BR 사용
        Scanner br = new Scanner(System.in);

            int n = 0;
            try {
                n = Integer.parseInt(br.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: 숫자를 입력해야 함");
                return;
            }        //첫번째 입력된 정수 n 만큼 반복 , 정수가 아닐시 예외처리
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < n; i++) {
                String s = br.nextLine();

                //문자열 비교는 equals 메소드
                if(s.equals("front")){
                    sb.append(q.front()).append("\n");
                }
                if(s.equals("back")){
                    sb.append(q.back()).append("\n");
                }
                if(s.equals("empty")){
                    sb.append(q.empty()).append("\n");
                }
                if(s.equals("pop")){
                    sb.append(q.pop()).append("\n");
                }
                if(s.equals("size")){
                    sb.append(q.size()).append("\n");
                }
                if(s.startsWith("push")){
                    String[] split = s.split(" ");
                    if(split.length == 2) { //push 만 들어오는 상황 제어
                        q.push(Integer.parseInt(split[1]));
                    }
                }
            }
            System.out.println(sb);
        }
}
