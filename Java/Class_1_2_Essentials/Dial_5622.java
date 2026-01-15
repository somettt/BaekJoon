package Class_1_2_Essentials;

import java.util.*;

public class Dial_5622{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input.trim().isEmpty()) {
            System.out.println(0);
            return;
        }

        String[] word = input.trim().split("\\s+");

        System.out.println(word.length);
    }
}