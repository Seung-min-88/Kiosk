package esential.Level4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private Menu menuList;
    private Menu bugerList;
    private Menu drinkList;
    private Menu dessertList;

//    public Kiosk( Menu bugerList, Menu dessertList, Menu drinkList) {
//
//        this.bugerList = bugerList;
//        this.dessertList = dessertList;
//        this.drinkList = drinkList;
//    }

    private void printMenu(Scanner sc, Menu menu) {
        while (true) {
            try {
                System.out.println("[ Main ]");
                for (int i = 0; i < menu.getMenuItems().size(); i++) {
                    System.out.println((i + 1) + ". " + menu.getMenuItems().get(i).toString());
                }
                System.out.println(0 + ". 종료      | 종료");
                System.out.println("카테고리를 선택해주세요![번호를 입력해주세요]");
                int m = sc.nextInt();
            } catch (InputMismatchException e){
                System.out.println("숫자를 입력해주세요1");
                sc.next();
            }
        }
    }

    private void printCategory(Scanner sc, Menu menu) {
        while (true) {
            System.out.println("[ " + menu.getMenuItems() + " Menu ");
            System.out.println("0. 뒤로가기 | 메인으로 돌아갑니다!");
            System.out.println("메뉴를 선택해주세요! [번호를 입력해주세요!]");

            int menuNum = sc.nextInt();
            if (menuNum == 0) {
                System.out.println("메인으로 돌아갑니다!");
                break;
            } else if (menuNum > 0 && menuNum <= menu.getMenuItems().size()) {
                System.out.println("선택한 메뉴 : " + menu.getMenuItems().get(menuNum - 1).toString());
            } else {
                System.out.println("잘못된 입력입니다!");
            }
        }
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        boolean run = true;


        while (run) {
            printMenu(sc, menuList);

            int categoryNum = sc.nextInt();
            switch (categoryNum) {
                case 1:
                    printCategory(sc, bugerList);
                    break;
                case 2:
                    printCategory(sc, dessertList);
                    break;
                case 3:
                    printCategory(sc, drinkList);
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다!");
                    run = false;
                    break;
                default:
                    System.out.println("정확한 값을 입력해주세요!");
            }
        }
        sc.close();

    }
}


//    public void start() {
//        Scanner sc = new Scanner(System.in);
//        boolean run = true;
//
//        while (run) {
//            System.out.println("[ Main ]");
//            for (int i = 0; i < menuList.size(); i++) {
//                System.out.println((i + 1) + ". " + menuList.get(i).getCategory());
//            }
//            System.out.println(0 + ". 종료      | 종료");
//            System.out.println("카테고리를 선택해주세요![번호를 입력해주세요]");
//            int categoryNum = sc.nextInt();
//            switch (categoryNum) {
//                case 1 :
//                    while (true){
//                        System.out.println("[ Buger Menu ]");
//                        for (int i = 0; i < bugerList.size(); i++){
//                            System.out.println((i + 1) + ". " + bugerList.get(i).toString());
//                        }
//                        System.out.println(0 + ". 뒤로가기      |뒤로가기");
//                        System.out.println("버거를 선택해주세요! [번호를 입력해주세요!]");
//                        int bugerNum = sc.nextInt();
//
//                        if (bugerNum == 0){
//                            System.out.println("메인으로 돌아갑니다!");
//                            break;
//                        } else if (bugerNum > 0 && bugerNum <= bugerList.size()) {
//                            System.out.println("선택한 버거 : " + bugerList.get(bugerNum - 1).toString());
//                        } else {
//                            System.out.println("잘못된 입력입니다!");
//                        }
//                        break;
//                    }
//                case 2 :
//                    while (true) {
//                        System.out.println("[ Dessert Menu ]");
//                        for (int i = 0; i< dessertList.size();i++) {
//                            System.out.println((i + 1) + ". " + dessertList.get(i).toString());
//                        }
//                        System.out.println(0 + ". 뒤로가기      |뒤로가기");
//                        System.out.println("디저트를 선택해주세요! [번호를 입력해주세요!]");
//                        int dessertNum = sc.nextInt();
//
//                        if (dessertNum == 0){
//                            System.out.println("메인으로 돌아갑니다!");
//                            break;
//                        } else if (dessertNum > 0 && dessertNum <= bugerList.size()) {
//                            System.out.println("선택한 버거 : " + bugerList.get(dessertNum - 1).toString());
//                        } else {
//                            System.out.println("잘못된 입력입니다!");
//                        }
//                        break;
//                    }
//                case 3 :
//                    while (true) {
//                        System.out.println("[ Drink Menu");
//                        for (int i = 0; i< drinkList.size();i++) {
//                            System.out.println((i + 1) + ". " + drinkList.get(i).toString());
//                        }
//                        System.out.println(0 + ". 뒤로가기      |뒤로가기");
//                        System.out.println("디저트를 선택해주세요! [번호를 입력해주세요!]");
//                        int drinkNum = sc.nextInt();
//
//                        if (drinkNum == 0){
//                            System.out.println("메인으로 돌아갑니다!");
//                            break;
//                        } else if (drinkNum > 0 && drinkNum <= bugerList.size()) {
//                            System.out.println("선택한 버거 : " + bugerList.get(drinkNum - 1).toString());
//                        } else {
//                            System.out.println("잘못된 입력입니다!");
//                        }
//                        break;
//                    }
//
//                case 0 :
//                    System.out.println("프로그램을 종료합니다.");
//                    run = false;
//                    break;
//
//                default:
//                    System.out.println("정확한 값을 입력해주세요!");
//                    break;
//            }
//            break;
//        }
//    }
//}


//    private List<Menu> menuCategory = new ArrayList<>();

//    public Kiosk(){
//        menuCategory.add(new Menu("Buger"));
//        menuCategory.add(new Menu("Dessert"));
//        menuCategory.add(new Menu("Drink"));
//        menuCategory.add(new Menu("종료     | 종료"));
//    }

//    public List<Menu> getMenuCategory() {
//        return menuCategory;
//    }


//    public Menu getBugerMenu() {
//        return bugerMenu;
//    }
//
//    public Menu getDessertMenu() {
//        return dessertMenu;
//    }
//
//    public Menu getDrinkMenu() {
//        return drinkMenu;
//    }
//
//    public void setBugerMenu(Menu bugerMenu) {
//        this.bugerMenu = bugerMenu;
//    }
//
//    public void setDessertMenu(Menu dessertMenu) {
//        this.dessertMenu = dessertMenu;
//    }
//
//    public void setDrinkMenu(Menu drinkMenu) {
//        this.drinkMenu = drinkMenu;
//    }


//    public void start() {
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("[BUGER MENU}");
//            System.out.println( "0.종료");
//            for (int i =0; i< catagoly.size(); i++) {
//                Menu buger = catagoly.get(i);
//                System.out.println(i+1 + "." + buger.getMenuName() + " | " + buger.getMenuPrice() + " | " + buger.getMenuComment());
//            }
//            int selcetNum = sc.nextInt();
//            switch (selcetNum){
//                case (0) :
//                    System.out.println("프로그램을 종료합니다.");
//                    break;
//                case (1) :
//                    System.out.println("1." + catagoly.get(0).getMenuName() + " | " + catagoly.get(0).getMenuPrice() + " | " + bugerLists.get(0).getMenuComment());
//                    break;
//                case (2) :
//                    System.out.println("2." + catagoly.get(1).getMenuName() + " | " + catagoly.get(1).getMenuPrice() + " | " + bugerLists.get(1).getMenuComment());
//                    break;
//                case (3) :
//                    System.out.println("3." + catagoly.get(2).getMenuName() + " | " + catagoly.get(2).getMenuPrice() + " | " + bugerLists.get(2).getMenuComment());
//                    break;
//                case (4) :
//                    System.out.println("4." + catagoly.get(3).getMenuName() + " | " + catagoly.get(3).getMenuPrice() + " | " + bugerLists.get(3).getMenuComment());
//                    break;
//            }
//            break;
//        }
//    }
//}
