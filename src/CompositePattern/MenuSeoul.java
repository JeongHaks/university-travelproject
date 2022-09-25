/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompositePattern;

import IteratorPattern.CompositeIterator;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author lgpc
 */
public class MenuSeoul { // 서울 패키지 메뉴

    ArrayList<MenuComponent> seoulMenu;

    public MenuSeoul() { // 패키지 상세내역 설정 
        seoulMenu = new ArrayList();
        addItem("서울1", "기차,펜션,달빛축제", "2박3일", 199800, "기차 10시 59800원\n펜션 40000원\n창덕궁 달빛기행 20000원\n");
        addItem("서울2", "비행기,게스트하우스,달빛축제", "2박3일", 165000, "비행기 10시 55000원\n게스트하우스 30000원\n창덕궁 달빛기행 20000원\n");
        addItem("서울3", "기차,호텔,H-스타축제", "3박4일", 499800, "기차 10시 59800원\n호텔 100000원\nH-스타 페스티벌 예선 40000원\n");
        addItem("서울4", "비행기,펜션,H-스타축제", "3박4일", 255000, "비행기 10시 55000원\n펜션 40000원\nH-스타 페스티벌 예선 40000원\n");
        addItem("서울5", "기차,펜션,라틴축제", "4박5일", 284800, "기차 10시 59800원\n펜션 40000원\n라틴 아메리카 축제 25000원\n");
        addItem("서울6", "비행기,리조트,라틴축제", "4박5일", 480000, "비행기 10시 55000원\n리조트 80000원\n라틴 아메리카 축제 25000원\n");

    }

    public void addItem(String place, String description, String days, int price, String detail) { // 패키지 메뉴에 메뉴내용 추가
        MenuDetail menuItem = new MenuDetail(place, description, days, price, detail);
        seoulMenu.add(menuItem);
    }

    public ArrayList getList() {
        return seoulMenu;
    }
}
