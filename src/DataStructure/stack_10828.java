package DataStructure;

import java.util.*;
import java.io.*;

class Stack {
    //문제의 입력이 스택의 크기를 지정하지 않기 때문에 어레이 리스트 사용(가변성 확보)
    private ArrayList<Integer> stack = new ArrayList<>();

    public void push(int x) {
        stack.add(x);
    }

    public int pop() {
        stack.remove(stack.size() - 1);
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
        return stack.get(stack.size()-1);
    }
}

public class stack_10828 {
    public static void main (String[]args) {

    }
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//속도를 위한 BR사용
    StringBuilder sb = new StringBuilder();

    Stack stack = new Stack();



}