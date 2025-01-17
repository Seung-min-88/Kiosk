package esential.Level3;

public class MenuItem {

    // 필드
    private String bugerName;
    private double bugerPrice;
    private String bugerComment;


    // 생성자
    public MenuItem(String bugerName, double bugerPrice, String bugerComment){
        this.bugerName = bugerName;
        this.bugerPrice = bugerPrice;
        this.bugerComment = bugerComment;
    }

    // getter
    public String getBugerName() {
        return bugerName;
    }

    public double getBugerPrice() {
        return bugerPrice;
    }

    public String getBugerComment() {
        return bugerComment;
    }

    public void setBugerName(String bugerName) {
        this.bugerName = bugerName;
    }

    public void setBugerPrice(double bugerPrice) {
        this.bugerPrice = bugerPrice;
    }

    public void setBugerComment(String bugerComment) {
        this.bugerComment = bugerComment;
    }
}
