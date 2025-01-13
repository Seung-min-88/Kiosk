package esential.Level2;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {
    private static final List<String> menu = new ArrayList<>();

    String menuName; // 메뉴이름
    String menuComent; // 메뉴설명
    double menuPrice; // 메뉴 가격


    public static ArrayList<String> getMenu() {
        return new ArrayList<>(menu);
    }

    public MenuItem(String menuName, double menuPrice, String menuComent) {
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.menuComent = menuComent;

        menu.add(menuName + " | " + menuPrice + " | " + menuComent);

    }

    public String getMenuName() {
        return menuName;
    }

    public double getMenuPrice() {
        return menuPrice;
    }

    public String getMenuComent() {
        return menuComent;
    }

}
