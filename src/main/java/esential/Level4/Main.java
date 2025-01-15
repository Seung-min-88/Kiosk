package esential.Level4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Menu bugerList = new Menu("Buger");
        bugerList.getMenuItems().add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        bugerList.getMenuItems().add(new MenuItem("SmokeShack ", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        bugerList.getMenuItems().add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        bugerList.getMenuItems().add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Menu dessertList = new Menu("Dessert");
        dessertList.getMenuItems().add(new MenuItem("French fries", 1.7, "바삭하고 짭짤한 감자튀김"));
        dessertList.getMenuItems().add(new MenuItem("Egg Tart", 2.3, "바삭한 크러스트 아래 가득한 달콤한 크림의 에그타르트"));
        dessertList.getMenuItems().add(new MenuItem("Ice cream", 1.5, "달콤하고 부드러운 바닐라 아이스크림"));
        dessertList.getMenuItems().add(new MenuItem("Cheese Sticks", 2.0, "고소한 모짜렐라 치즈스틱"));

        Menu drinkList = new Menu("Drink");
        drinkList.getMenuItems().add(new MenuItem("Pepsi", 2.0, "정통 콜라 펩시"));
        drinkList.getMenuItems().add(new MenuItem("Pepsi zero", 2.0, "제로 슈거 라임향 펩시"));
        drinkList.getMenuItems().add(new MenuItem("Sprite", 2.0, "세계적인 사이다 스프라이트"));
        drinkList.getMenuItems().add(new MenuItem("Narangd cider", 2.0, "제로 사이다 나랑드"));

        List<Menu> menuList = new ArrayList<>();
        menuList.add(bugerList);
        menuList.add(dessertList);
        menuList.add(drinkList);

        Kiosk kiosk = new Kiosk();
//        Kiosk kiosk = new Kiosk(bugerList,  dessertList,  drinkList);
        kiosk.start();
    }
}


//        Kiosk kiosk = new Kiosk();
//        List<Menu> menuCategory = kiosk.getMenuCategory();
//        System.out.println(kiosk.getMenuCategory());



//        List<MenuItem> menuItemz = new ArrayList<>();
//        menuItemz.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));



//        bugerList.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
//        bugerList.add(new esential.Level3.MenuItem("SmokeShack ", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
//        bugerList.add(new esential.Level3.MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
//        bugerList.add(new esential.Level3.MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));



//        Kiosk kiosk = new Kiosk();
//        List<Menu> menuCategory = kiosk.getMenuCategory();
//        System.out.println("[ MAIN MENU ]");
//        for (int i =0; i<menuCategory.size(); i++){
//            System.out.println((i + 1) + ". " + menuCategory.get(i).getCatagory());
//
//        }
//        System.out.println(menuCategory.get(4).getCatagory());

