package array;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력받을 숫자의 갯수를 입력해주세요.");
        int count = scanner.nextInt();
        int[] grade = new int[count];
        int sum = 0;
        double average;
        System.out.println(" 점수를 입력하세요 ");
        for(int i = 0; i < grade.length ; i++){

            grade[i] = scanner.nextInt();

            sum+=grade[i];

        }
        average = (double)sum / 5;
        System.out.println("점수의 합계 " + sum);
        System.out.println("점수의 평균 " + average );
    }

}
