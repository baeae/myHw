package array;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("입력받을 숫자의 갯수를 작성해주새요.");
        int count = sc.nextInt();
        int[] number = new int[count];

        int minNumber = 0;
        int maxNumber = 0;
        System.out.println(count + "개의 정수를 입력하세요");
        for (int i = 0 ; i < count ; i++){
            number[i] = sc.nextInt();
        }

        minNumber = number[0];
        maxNumber = number[0];
        for(int i = 1 ; i < count ; i++){
            if(number[i] < minNumber){
                minNumber = number[i];
            }
            if(number[i] > maxNumber){
                maxNumber = number[i];
            }
        }

        System.out.println("가장 작은 점수 : " + minNumber);
        System.out.println("가장 큰 점수 : " + maxNumber);


    }
}
