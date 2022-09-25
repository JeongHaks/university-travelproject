/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompositePattern;

import IteratorPattern.CompositeIterator;
import Ui.PackageUi;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author lgpc
 */
public class Menu extends MenuComponent { // 전체 패키지 메뉴

    ArrayList<MenuComponent> Menu;
    private Object rowData[] = new Object[4];

    public Menu(String place) { // 전체 패키지 메뉴 설정
        Menu = new ArrayList();
        // 각 여행지 기본 패키지 메뉴 설정
        if (place == "대구") {
            MenuDaegu daegu = new MenuDaegu();
            Menu = daegu.getList();
        } else if (place == "제주") {
            MenuJeju jeju = new MenuJeju();
            Menu = jeju.getList();
        } else if (place == "서울") {
            MenuSeoul seoul = new MenuSeoul();
            Menu = seoul.getList();
        } else if (place == "파리") {
            MenuParis paris = new MenuParis();
            Menu = paris.getList();
        } else if (place == "도쿄") {
            MenuTokyo tokyo = new MenuTokyo();
            Menu = tokyo.getList();
        }
    }

    @Override
    public ArrayList getList() {
        return Menu;
    }

    @Override
    public void add(MenuComponent menuComponent) { // 메뉴추가
        Menu.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) { // 메뉴 삭제
        Menu.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return Menu.get(i);
    }

    @Override
    public Object[] getObject() {
        return rowData;
    }

    @Override
    public void print() { // 이터레이터를 이용한 메뉴 출력
        Iterator iterator = Menu.iterator();    //Menu 정보 뿐아니라 Menu안의 아이템까지 출력
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            rowData[0] = menuComponent.getPlace();
            rowData[1] = menuComponent.getDescription();
            rowData[2] = menuComponent.getDays();
            rowData[3] = menuComponent.getPrice() + "원";
            menuComponent.print();
            PackageUi.model1.addRow(rowData);
        }
    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator(Menu.iterator());
    }
}
