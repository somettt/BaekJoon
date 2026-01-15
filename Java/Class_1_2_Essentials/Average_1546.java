package Class_1_2_Essentials; ///은호는 기말고사를 망쳤다. 은호는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.

        ///예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.

///세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.

/// 3 입력할 점수 개수
        ///40 80 60 점수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Average_1546{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(reader.readLine());
        if (num > 1000){
            return;
        }
        int[] scores = new int[num];

        String[] input = reader.readLine().split(" ");

        for (int i=0; i<num; i++){
            scores[i] = Integer.parseInt(input[i]);
            if (0>scores[i] || scores[i]>100)
           return;
        }

        int biggest = 0;

        for (int i=0; i<num; i++){
            if (scores[i] > biggest){
                biggest = scores[i];
            }
        }


        double[] newScores = new double[num];
        for (int i=0; i<num; i++){
            newScores[i] = ((double)scores[i] / biggest * 100);
        }

        double answer = 0;
        for (int i=0; i<num; i++){
            answer += newScores[i];
        }
        System.out.println(answer/num);
    }
}


