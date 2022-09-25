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
public class MenuDaegu {

    ArrayList<MenuComponent> daeguMenu;

    public MenuDaegu() { // 대구 패키지 메뉴의 상세 내역
        daeguMenu = new ArrayList();
        addItem("대구1", "기차,펜션,별빛축제", "2박3일", 141400, "기차 10시 11400원\n펜션 40000원\n이월드 별빛 축제 10000원\n");
        addItem("대구2", "기차,호텔,미술축제", "3박4일", 426400, "기차 10시 11400원\n호텔 100000원\n강정 대구 현대미술제 15000원\n");
        addItem("대구3", "기차,리조트,토마토축제", "4박5일", 431400, "기차 10시 11400원\n리조트 80000원\n달성 토마토축제 20000원\n");
    }

    public void addItem(String place, String description, String days, int price, String detail) { // 패키지 메뉴에 메뉴내용 추가
        MenuDetail menuItem = new MenuDetail(place, description, days, price, detail);
        daeguMenu.add(menuItem);
    }

    public ArrayList getList() {
        return daeguMenu;
    }
}
