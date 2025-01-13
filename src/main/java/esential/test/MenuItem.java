package esential.test;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {
    private final List<String> menuList = new ArrayList<>();

    public BugersMenu() {
        menuList.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuList.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuList.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuList.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
    }

    public void printMenu() {
        for (int i = 0; i < BugersMenu.size(); i++) {
            MenuItem item = BugersMenu.get(i);
            System.out.println((i + 1) + ". " + item.getMenuName() + " | " + item.getMenuPrice() + " | " + item.getMenuComent());
        }
    }

    public List<String> getMenuList() {
        return menuList;
    }

    public DrinksMenu() {
    }

    public DessertsMenu() {
    }


}
