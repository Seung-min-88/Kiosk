package esential.Level2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 각 메뉴들을 설정
        MenuItem menu1 = new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem menu2 = new MenuItem("SmokeShack ", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem menu3 = new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem menu4 = new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");


        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-----메뉴-----");
            System.out.println("1. " + menu1.getMenuName() + " | " + menu1.getMenuPrice() + " | " + menu1.getMenuComent());
            System.out.println("2. " + menu2.getMenuName() + " | " + menu2.getMenuPrice() + " | " + menu2.getMenuComent());
            System.out.println("3. " + menu3.getMenuName() + " | " + menu3.getMenuPrice() + " | " + menu3.getMenuComent());
            System.out.println("4. " + menu4.getMenuName() + " | " + menu4.getMenuPrice() + " | " + menu4.getMenuComent());
            System.out.println("5. 종료");
            System.out.println("숫자를 입력하세요");

            int num = sc.nextInt();

            if (num == 1) {
                System.out.println("1. " + menu1.getMenuName() + " 주문 완료 됬습니다. " + "W" + menu1.getMenuPrice());
                break;
            } else if (num == 2) {
                System.out.println("2. " + menu2.getMenuName() + " 주문 완료 됬습니다. " + "W" + menu2.getMenuPrice());
                break;
            } else if (num == 3) {
                System.out.println("3. " + menu3.getMenuName() + " 주문 완료 됬습니다. " + "W" + menu3.getMenuPrice());
                break;
            } else if (num == 4) {
                System.out.println("4. " + menu4.getMenuName() + " 주문 완료 됬습니다. " + "W" + menu4.getMenuPrice());
                break;
            } else if (num == 5) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 정확한 숫자를 입력해주세요.");
            }
        }
    }
}
