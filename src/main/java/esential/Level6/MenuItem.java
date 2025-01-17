package esential.Level6;

public class MenuItem {
    //필드
    private String menuName;
    private double menuPrice;
    private String menuComment;

    // 생성자
    public MenuItem(String menuName, double menuPrice, String menuComment){
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.menuComment = menuComment;
    }

    // getter
    public String getMenuName() {
        return menuName;
    }
    public double getMenuPrice() {
        return menuPrice;
    }
    public String getMenuComment() {
        return menuComment;
    }

    // setter
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public void setMenuPrice(double menuPrice) {
        this.menuPrice = menuPrice;
    }

    public void setMenuComment(String menuComment) {
        this.menuComment = menuComment;
    }
}
