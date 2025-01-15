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


}
