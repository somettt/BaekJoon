import java.util.Scanner;

public class FindingPrimeNumber_1978 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] num = new int[n];
        int cnt = 0;

        for (int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }


        for (int i=0; i<n; i++){
            boolean isPrime = true;
            if(num[i]==1) isPrime = false;

            for(int j=2; j<= Math.sqrt(num[i]); j++ ){ // 2부터 n제곱근의 값으로 나눴을때 나머지
                if (num[i] % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) cnt++;
        }
        System.out.println(cnt);
    }
}
