package esential.Level4;


import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<Menu> menuList;

    public Kiosk(List<Menu> menuList) {
        this.menuList = menuList;
    }

    private void printCategory(Scanner sc, Menu menu) {
        boolean pc = true;
        while (pc) {
            try {
                System.out.println("[ " + menu.getCategory() + " Menu " + "]");

                List<MenuItem> menuItems = menu.getMenuItems();// 메뉴 아이템 리스트
                for (int i = 0; i < menuItems.size(); i++) {
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
                    MenuItem item = menuItems.get(menuNum - 1);
                    System.out.println("선택한 메뉴 : " + item.getMenuName() + " |  W" + item.getMenuPrice());
                    pc = false;
                } else if (menuNum > menu.getMenuItems().size()) {
                    throw new IndexOutOfBoundsException("잘못된 입력입니다!");
                }

            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해주세요1");
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
                    System.out.println("프로그램 종료");
                    run = false;
                default:
                    System.out.println("정확한 값을 입력하세요");
            }
        }
    }
}