package Class_1_2_Essentials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class FourOperations_10869 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer input = new StringTokenizer(bf.readLine());
        int[] num = new int[2];

        for (int i=0; i<2 ; i++) {
            num[i] = Integer.parseInt(input.nextToken());
        }
        System.out.println(num[0]+num[1]);
        System.out.println(num[0]-num[1]);
        System.out.println(num[0]*num[1]);
        System.out.println(num[0]/num[1]);
        System.out.println(num[0]%num[1]);
    }
}
