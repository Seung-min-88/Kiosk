package esential.Level2;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {
    private List<MenuItem> menu = new ArrayList<>();

    // Main에서 입력받은 메뉴들을 어레이에 저장
    // getter를 만들어 main에 출력되게 설정
    String menuName; // 메뉴이름
    String menuComent; // 메뉴설명
    double menuPrice; // 메뉴 가격



    public MenuItem(String menuName, double menuPrice, String menuComent) {
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.menuComent = menuComent;
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
