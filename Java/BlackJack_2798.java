import java.util.Scanner;

public class BlackJack_2798 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("입력");

        int n = sc.nextInt(); // 주어지는 카드의 수
        int m = sc.nextInt(); // 21
        int[] cards = new int[n];

        for(int i=0; i<n; i++){
            cards[i] = sc.nextInt();
        }
        int biggest=0;
        System.out.println("입력완료");

        for(int i=0; i<n; i++){
            int x = cards[i];
            System.out.println("x:"+x);
            for (int j=i+1; j<n; j++){
                int y = cards[j];
                for(int k=j+1; k<n; k++){
                    int z = cards[k];
                    int sum = x+y+z;
                    if(sum > biggest && sum<=m) biggest = sum;
                }
            }
        }
        System.out.println(biggest);
    }
}
