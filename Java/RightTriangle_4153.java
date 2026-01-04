import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RightTriangle_4153 {
    public static void  main(String[] args) throws IOException {
        Scanner sc = new Scanner(new InputStreamReader(System.in));    //정수를 읽기위해 BufferedReader대신 Scanner 사용

        while(true) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            if (x == 0 && y == 0 && z == 0) break;

            if(x*x == (y*y + z*z)){              //대각선을 알 수 없기때문에 모든 케이스에 대하여 구현
                System.out.println("right");
            }else if(y*y == (x*x + z*z)){
                System.out.println("right");
            }else if(z*z == (x*x + y*y)){
                System.out.println("right");
            }else {
                System.out.println("wrong");
            }
        }
    }
}
