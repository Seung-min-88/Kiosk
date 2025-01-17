package esential.Level6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 메뉴아이템에 버거리스트란 새로운 리스트를 생성
        List<MenuItem> bugerList = new ArrayList<>();
        // 버거리스트에 각 값을 생성자에 맞게 입력
        bugerList.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        bugerList.add(new MenuItem("SmokeShack ", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        bugerList.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        bugerList.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        List<MenuItem> dessertList = new ArrayList<>();
        dessertList.add(new MenuItem("French fries", 1.7, "바삭하고 짭짤한 감자튀김"));
        dessertList.add(new MenuItem("Egg Tart", 2.3, "바삭한 크러스트 아래 가득한 달콤한 크림의 에그타르트"));
        dessertList.add(new MenuItem("Ice cream", 1.5, "달콤하고 부드러운 바닐라 아이스크림"));
        dessertList.add(new MenuItem("Cheese Sticks", 2.0, "고소한 모짜렐라 치즈스틱"));

        List<MenuItem>drinkList = new ArrayList<>();
        drinkList.add(new MenuItem("Pepsi", 2.0, "정통 콜라 펩시"));
        drinkList.add(new MenuItem("Pepsi zero", 2.0, "제로 슈거 라임향 펩시"));
        drinkList.add(new MenuItem("Sprite", 2.0, "세계적인 사이다 스프라이트"));
        drinkList.add(new MenuItem("Narangd cider", 2.0, "제로 사이다 나랑드"));

        // 새로운 메뉴 객체를 생성
        Menu bugerMenu = new Menu("Buger", bugerList);
        Menu dessertMenu = new Menu("Dessert", dessertList);
        Menu drinkMenu = new Menu("Drink", drinkList);

        // 메뉴의 메뉴리스트란 새로운 리스트를 생성
        List<Menu> menuList = new ArrayList<>();
        // 메뉴 리스트에 위에서 생성한 객체를 넣는다
        menuList.add(bugerMenu);
        menuList.add(dessertMenu);
        menuList.add(drinkMenu);

        Kiosk kiosk = new Kiosk(menuList);
        kiosk.start();
    }
}