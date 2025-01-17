package esential.Level6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    // 필드
    // 메뉴의 메뉴리스트를 속성으로 가짐
    private List<Menu> menuList;
    private List<MenuItem> cartList = new ArrayList<>();

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

                List<MenuItem> menuItems = menu.getMenuItems();

                // 메뉴 아이템 리스트
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
                    System.out.println("선택한 메뉴 : " + item.getMenuName() + " |  W " + item.getMenuPrice());
                    
                    System.out.println();
                    System.out.println(item.getMenuName() + " | " + "W " +item.getMenuPrice() + " | " + item.getMenuComment());
                    System.out.println("위 메뉴를 장바구니에 넣으시겠습니까?");
                    System.out.println("1. 확인     2. 취소");
                    int inNum = sc.nextInt();
                    if (inNum == 1) {
                        System.out.println("선택한 메뉴를 장바구니에 넣었습니다!");
                        cartList.add(new MenuItem(item.getMenuName(), item.getMenuPrice(), item.getMenuComment()));
                    } else if (inNum == 2) {
                        System.out.println("취소 되었습니다!");
                    }
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

    public void printCart(Scanner sc) {
        boolean ct = true;

        while (ct) {
            try {
                System.out.println("[ Order ]");
                for (int i = 0; i<cartList.size(); i++) {
                    System.out.println(cartList.get(i).getMenuName() + " | W " + cartList.get(i).getMenuPrice() + " | " + cartList.get(i).getMenuComment());
                    System.out.println("[ Total ]");
                    System.out.println("W " + cartList.get(i).getMenuPrice());
                }
                System.out.println("1. 주문하기");
                System.out.println("2. 장바구니 비우기");
                System.out.println("3. 돌아가기");

                System.out.print("선택 : ");
                int orderNum = sc.nextInt();
//                String intput = sc.next();
//                char cartCh = intput.charAt(0);

                switch (orderNum) {
                    case 1 :
                        System.out.println("주문이 완료 됬습니다!");
                        cartList.clear();
                        ct = false;
                        break;
                    case 2 :
                        cartList.clear();
                        System.out.println("장바구니가 비워졌습니다!");
                        ct = false;
                        break;
                    case 3 :
                        System.out.println("Main으로 이동합니다!");
                        ct = false;
                        break;
                    default:
                        System.out.println("잘못된 입력입니다. 다시 입력해주세요!");
                }
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다");
                sc.next();
            }
        }
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("[ Main Menu]");
            for (int i = 0; i < menuList.size(); i++) {
                System.out.println((i + 1) + ". " + menuList.get(i).getCategory());
            }
            System.out.println("0. 종료  | 프로그램을 종료합니다!");
            System.out.println("카테고리를 선택해주세요![번호를 입력해주세요!]");
            if (!cartList.isEmpty()) {
                System.out.println();
                System.out.println("[ Order Menu ]");
                System.out.println("4. Order");
                System.out.println("5. Cancel");
            }

            try {
                int categoryNum = sc.nextInt();
                switch (categoryNum) {
                    case 1:
                        printCategory(sc, menuList.get(0));
                        break;
                    case 2:
                        printCategory(sc, menuList.get(1));
                        break;
                    case 3:
                        printCategory(sc, menuList.get(2));
                        break;
                    case 0:
                        System.out.println("--프로그램 종료--");
                        run = false;
                        break;
                    case 4:
                        if (cartList.isEmpty()) {
                            throw new InputMismatchException("장바구니가 비어 있습니다!!");
                        }
                        printCart(sc);
                        break;
                    case 5:
                        if (cartList.isEmpty()) {
                            throw new InputMismatchException("주문한 메뉴가 없습니다!");
                        }
                        System.out.println("주문을 취소합니다.");
                    default:
                        System.out.println("정확한 값을 입력해주세요!");
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}