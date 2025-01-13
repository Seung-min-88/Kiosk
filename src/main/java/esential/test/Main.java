package esential.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 각 메뉴들을 설정
    Scanner sc = new Scanner(System.in);
    MenuItem menuItem = new MenuItem();
    Kiosk kiosk = new Kiosk();

    boolean strat = true;

    while (strat) {
        System.out.println(menuItem.menuList());// 메뉴리스트

        System.out.println("숫자를 입력해주세요!");
        int menuNumber = sc.nextInt();


    }
}
