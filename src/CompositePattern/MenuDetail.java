package CompositePattern;

import IteratorPattern.NullIterator;
import java.util.Iterator;

public class MenuDetail extends MenuComponent {

    String place; // 여행지
    String description; // 패티지 구성
    String days; // 일정
    int price; // 가격
    String detail; // 상세내역
    Object rowData[] = new Object[4];

    public MenuDetail(String place, String description, String days, int price, String detail) { //패키지 메뉴 추가
        this.place = place;
        this.description = description;
        this.days = days;
        this.price = price;
        this.detail = detail;
    }

    @Override
    public String getPlace() {
        return place;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getDays() {
        return days;
    }

    @Override
    public String getDetail() {
        return detail;
    }

    @Override
    public Object[] getObject() {
        return rowData;
    }

    @Override
    public void print() {
        System.out.println(getPlace() + getDescription() + getPrice() + getDays() + getDetail());
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator(); //널 반복자.
    }

}
