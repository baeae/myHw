package cond;

public class ScoreEx {
    public static void main(String[] args) {
        int score = 80;

        if(score >= 90){
            System.out.println("학점은 A입니다.");
        } else if(score >= 80){
            System.out.println("학점은 B입니다.");
        } else if (score >= 70) {
            System.out.println("학점은 C입니다.");
        }else if(score >= 60){
            System.out.println("학점은 D입니다.");
        }else{
            System.out.println("학점은 F입니다.");
        }

        int a = 10;
        int b = 20;

        int number = (a > b) ? a : b ;
        System.out.println("더 큰 숫자는 " + number + "입니다.");




    }
}
