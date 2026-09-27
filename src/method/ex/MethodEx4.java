package method.ex;

import java.util.Scanner;

public class MethodEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;
        int amount = 0;

        while ( true ) {
            System.out.println("------------------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("------------------------------------------");
            int choice = scanner.nextInt();
            if (choice == 1){
                System.out.print("입금할 금액 : ");
                amount = scanner.nextInt();
                balance = deposit(balance, amount);
                System.out.println("입금액 : " + amount + "잔액 : " + balance);
            } else if (choice == 2) {
                System.out.print("출금할 금액 : ");
                amount = scanner.nextInt();
                balance = withdraw(balance, amount);
            } else if (choice == 3) {
                System.out.println("현재 잔액 : " + balance);
            }else if (choice == 4) {
                System.out.println("시스템을 종료 합니다.");
                return;
            }else {
                System.out.println("잘못 입력 하셨습니다.");
            }

        }
    }

    public static int deposit (int balance, int depositMoney) {
        System.out.println(depositMoney + "원 을 입금하셨습니다.");
        balance += depositMoney;

        return balance;
    }

    public static int withdraw (int balance, int withdrawMoney) {

        if(balance >= withdrawMoney){
            balance -= withdrawMoney;
            System.out.println("출금액 : " + withdrawMoney + "잔액 : " + balance);
        }else {
            System.out.println("잔액이 부족합니다.");
        }
        return balance;
    }

}
