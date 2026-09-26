package array;

import java.util.Scanner;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};

        int total = 0;
        for (int student : students) {
            total += student;
        }
        double average = (double) total / 5;

        System.out.println("점수 총합 : " + total);
        System.out.println("점수 평균 : " + average);

        Scanner scanner = new Scanner(System.in);
        int[] number = new int[5];

        System.out.print("숫자를 입력해 주세요.");
        for ( int i = 0; i < number.length; i++){
           number[i] = scanner.nextInt();
        }

        System.out.println("출력");
        for(int i = 0 ; i < number.length; i++){
            System.out.print(number[i]);
            if( i < number.length - 1){
                System.out.print(",");
            }
        }




    }
}
