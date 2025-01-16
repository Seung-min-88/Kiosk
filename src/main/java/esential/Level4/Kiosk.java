package esential.Level4;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    // 필드
    // 메뉴의 메뉴리스트를 속성으로 가짐
    private List<Menu> menuList;

    // 생성자
    // 키오스크 생성시 메뉴리스트를 가지고 있어야함
    public Kiosk(List<Menu> menuList) {
        this.menuList = menuList;
    }

    // 메소드
    // 입력과 메뉴의 정보를 받아 실행
    private void printCategory(Scanner sc, Menu menu) {
        boolean pc = true;
        while (pc) {
            try {
                System.out.println("[ " + menu.getCategory() + " Menu " + "]");

                List<MenuItem> menuItems = menu.getMenuItems();// 메뉴 아이템 리스트
                for (int i = 0; i < menuItems.size(); i++) {
                    // 메뉴 아이템의 i번째 것을 item에 저장
                    MenuItem item = menuItems.get(i);
                    System.out.println((i + 1) + ". " + item.getMenuName() + " | " + "W" +item.getMenuPrice() + " | " + item.getMenuComment());
                }
                System.out.println("0. 뒤로가기 | 메인으로 돌아갑니다!");
                System.out.println("메뉴를 선택해주세요! [번호를 입력해주세요!]");

                int menuNum = sc.nextInt();
                if (menuNum == 0) {
                    System.out.println("메인으로 돌아갑니다!");
                    break;
                } else if (menuNum > 0 && menuNum <= menuItems.size()) {
                    // 메뉴 아이템의 (입력값 -1)의 값을 item에 저장
                    MenuItem item = menuItems.get(menuNum - 1);
                    System.out.println("선택한 메뉴 : " + item.getMenuName() + " |  W" + item.getMenuPrice());
                    pc = false;
                } else if (menuNum > menu.getMenuItems().size()) {
                    throw new IndexOutOfBoundsException("잘못된 입력입니다!");
                }

            } catch (InputMismatchException e) {
                System.out.println("정확한 숫자를 입력해주세요!");
                sc.next();
            }
        }
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("[ Main ]");
            for (int i = 0; i < menuList.size(); i++) {
                System.out.println((i + 1) + ". " + menuList.get(i).getCategory());
            }
            System.out.println("0. 종료  | 프로그램을 종료합니다!");
            System.out.println("카테고리를 선택해주세요![번호를 입력해주세요!]");

            int categoryNum = sc.nextInt();
            switch (categoryNum) {
                case 1:
                    printCategory(sc, menuList.get(0));
                    break;
                case 2 :
                    printCategory(sc, menuList.get(1));
                    break;
                case 3:
                    printCategory(sc, menuList.get(2));
                    break;
                case 0:
                    System.out.println("--프로그램 종료--");
                    run = false;
                default:
                    System.out.println("정확한 값을 입력해주세요!");
            }
        }
    }
}