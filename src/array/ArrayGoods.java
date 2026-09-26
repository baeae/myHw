package array;

import java.util.Scanner;

public class ArrayGoods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxProducts = 10;
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCount = 0;

        while (true) {
            System.out.println("===================================");
            System.out.println("1. 상품등록 | 2. 상품목록 | 3. 종료");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    if (productCount >= maxProducts) {
                        System.out.println("더이상 상품을 등록할 수 없습니다.");
                        break;
                    }
                    System.out.print("상품 이름 : ");
                    productNames[productCount] = scanner.nextLine();
                    System.out.print("상품 가격 : ");
                    productPrices[productCount] = scanner.nextInt();

                    productCount++;
                    break;
                case 2:
                    if(productCount == 0){
                        System.out.println("등록된 상품이 없습니다.");
                        break;
                    }
                    for (int i = 0; i < productCount; i++) {
                        System.out.println((i + 1) + ". " + productNames[i] + " - " + productPrices[i] + "원");
                    }
                    break;

                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    return;

                default:
                    System.out.println("잘못입력하였습니다. 다시입력해 주세요.");
                    break;
            }
        }
    }

}
