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
public class MenuJeju { // 제주 패키지 메뉴

    ArrayList<MenuComponent> jejuMenu; // 제주 패키지

    public MenuJeju() { // 제주패키지 상세내역
        jejuMenu = new ArrayList();
        addItem("제주1", "배,펜션,별빛축제", "2박3일", 162000, "배 8시 32000원\n펜션 40000원\n허브동산 별빛놀이 10000원\n");
        addItem("제주2", "비행기,게스트하우스,별빛축제", "2박3일", 159000, "비행기 8시 59000원\n게스트하우스 30000원\n허브동산 별빛놀이 10000원\n");
        addItem("제주3", "배,호텔,자리돔축제", "3박4일", 462000, "배 10시 37000원\n호텔 100000원\n보목 자리돔축제 25000원\n");
        addItem("제주4", "비행기,펜션,자리돔축제", "3박4일", 250000, "비행기 10시 65000원\n펜션 40000원\n보목 자리돔축제 25000원\n");
        addItem("제주5", "배,펜션,수국축제", "4박5일", 244000, "배 16시 30000원\n펜션 40000원\n한림공원 수국축제 14000원\n");
        addItem("제주6", "비행기,리조트,수구축제", "4박5일", 474000, "비행기 16시 60000원\n리조트 80000원\n한림공원 수국축제 14000원\n");
    }

    public void addItem(String place, String description, String days, int price, String detail) { // 패키지 메뉴에 메뉴내용 추가
        MenuDetail menuItem = new MenuDetail(place, description, days, price, detail);
        jejuMenu.add(menuItem);
    }

    public ArrayList getList() {
        return jejuMenu;
    }
}
