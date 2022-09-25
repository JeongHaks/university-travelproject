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
public class MenuParis { // 파리 패키지 메뉴

    ArrayList<MenuComponent> pairsMenu;

    public MenuParis() { // 파리 패키지 상세내역
        pairsMenu = new ArrayList();
        addItem("파리1", "비행기,펜션,달빛축제", "2박3일", 812000, "비행기 8시 659000원\n펜션 40000원\n파리모터쇼 33000원\n");
        addItem("파리2", "비행기,게스트하우스,달빛축제", "3박4일", 930000, "비행기 10시 765000원\n게스트하우스 30000원\n메종오브제 45000원\n");
        addItem("파리3", "비행기,호텔,H-스타축제", "4박5일", 1340000, "비행기 12시 807000원\n호텔 100000원\n파리모터쇼 33000원\n");
        addItem("파리4", "비행기,리조트,H-스타축제", "4박5일", 2007000, "비행기 16시 1560000원\n리조트 80000원\n오포지토 거리극 페스티벌 47000원\n");
    }

    public void addItem(String place, String description, String days, int price, String detail) { // 패키지 메뉴에 메뉴내용 추가
        MenuDetail menuItem = new MenuDetail(place, description, days, price, detail);
        pairsMenu.add(menuItem);
    }

    public ArrayList getList() {
        return pairsMenu;
    }
}
