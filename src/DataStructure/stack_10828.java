package DataStructure;

import java.util.*;
import java.io.*;

class Stack {
    //문제의 입력이 스택의 크기를 지정하지 않기 때문에 어레이 리스트 사용(가변성 확보)
    private ArrayList<Integer> stack = new ArrayList<>();

    public void push(int x) {
        stack.add(x);
    }

    //스택이 비었을 경우를 위한 예외 처리
    public int pop() {
        if (stack.isEmpty()) {
            return -1;
        }
        return stack.remove(stack.size() - 1);
    }
    public int size() {
        return stack.size();
    }
    public int empty() {
        if (stack.isEmpty()) {
            return 1;
        }
        else return 0;
    }
    public int top(){
        if (stack.isEmpty()){
            return -1;
        }
        return stack.get(stack.size()-1);
    }
}

public class stack_10828 {
    public static void main (String[]args) throws IOException {
        Stack stack = new Stack();
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
            if(s.equals("top")){
                sb.append(stack.top()).append("\n");
            }
            if(s.equals("empty")){
                sb.append(stack.empty()).append("\n");
            }
            if(s.equals("pop")){
                sb.append(stack.pop()).append("\n");
            }
            if(s.equals("size")){
                sb.append(stack.size()).append("\n");
            }
            if(s.startsWith("push")){
                String[] split = s.split(" ");
                if(split.length == 2) { //push 만 들어오는 상황 제어
                    stack.push(Integer.parseInt(split[1]));
                }
            }
        }
        System.out.println(sb);
    }

}