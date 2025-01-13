package esential.Level2;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {
    private static final List<String> menu = new ArrayList<>();

    // Main에서 입력받은 메뉴들을 어레이에 저장
    // getter를 만들어 main에 출력되게 설정
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

        // Main에서 입력한 메뉴들을 array에 저장
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
