package esential.Level3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    List<MenuItem> bugerLists;


    public Kiosk(){
        bugerLists = new ArrayList<>();
        bugerLists.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        bugerLists.add(new MenuItem("SmokeShack ", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        bugerLists.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        bugerLists.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("[BUGER MENU}");
            System.out.println( "0.종료");
            for (int i =0; i< bugerLists.size(); i++) {
                MenuItem buger = bugerLists.get(i);
                System.out.println(i+1 + "." + buger.getBugerName() + " | " + buger.getBugerPrice() + " | " + buger.getBugerComment());
            }
            int selcetNum = sc.nextInt();
            switch (selcetNum){
                case (0) :
                    System.out.println("프로그램을 종료합니다.");
                    break;
                case (1) :
                    System.out.println("1." + bugerLists.get(0).getBugerName() + " | " + bugerLists.get(0).getBugerPrice() + " | " + bugerLists.get(0).getBugerComment());
                    break;
                case (2) :
                    System.out.println("2." + bugerLists.get(1).getBugerName() + " | " + bugerLists.get(1).getBugerPrice() + " | " + bugerLists.get(1).getBugerComment());
                    break;
                case (3) :
                    System.out.println("3." + bugerLists.get(2).getBugerName() + " | " + bugerLists.get(2).getBugerPrice() + " | " + bugerLists.get(2).getBugerComment());
                    break;
                case (4) :
                    System.out.println("4." + bugerLists.get(3).getBugerName() + " | " + bugerLists.get(3).getBugerPrice() + " | " + bugerLists.get(3).getBugerComment());
                    break;
            }
            break;
        }
    }
}
