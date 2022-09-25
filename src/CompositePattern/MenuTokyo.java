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
public class MenuTokyo { // 도쿄 패키지 메뉴

    ArrayList<MenuComponent> tokyoMenu;

    public MenuTokyo() { // 도쿄 패키지 상세내역
        tokyoMenu = new ArrayList();
        addItem("도쿄1", "비행기,펜션,살롱축제", "2박3일", 359000, "비행기 8시 209000원\n펜션 40000원\n도쿄오토살롱 30000원");
        addItem("도쿄2", "비행기,게스트하우스,디자인축제", "3박4일", 335000, "비행기 10시 190000원\n게스트하우스 30000원\n도쿄디자인페스타 25000원\n");
        addItem("도쿄3", "비행기,호텔,코믹축제", "3박4일", 482000, "비행기 12시 67000원\n호텔 100000원\n코믹마켓 15000원");
        addItem("도쿄4", "비행기,리조트,디자인축제", "4박5일", 690000, "비행기 16시 265000원\n리조트 80000원\n도쿄디자인페스타 25000원\n");

    }

    public void addItem(String place, String description, String days, int price, String detail) { // 패키지 메뉴에 메뉴내용 추가
        MenuDetail menuItem = new MenuDetail(place, description, days, price, detail);
        tokyoMenu.add(menuItem);
    }

    public ArrayList getList() {
        return tokyoMenu;
    }
}
