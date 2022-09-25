/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StatePattern;

import ObserverPattern.Observer;
import ObserverPattern.Observer;
import ObserverPattern.Schedule;
import ObserverPattern.Subject;
import ObserverPattern.Subject;
import StatePattern.CultureDaegu;
import StatePattern.CultureJeju;
import StatePattern.CultureParis;
import StatePattern.CultureSeoul;
import StatePattern.CultureTokyo;
import StatePattern.Culturestate;

/**
 *
 * @author lgpc
 */
public class Culture implements Observer {

    private Subject subject;
    private String place; // 일정의 여행지
    private int people; // 일정의 인원 수
    private int cp; // 축제 가격
    // 각 여행지 축제 상태 값
    Culturestate daegu;
    Culturestate paris;
    Culturestate tokyo;
    Culturestate jeju;
    Culturestate seoul;
    Culturestate culturestate = seoul; // 축제 상태 기본 값은 서울

    public Culture(Subject subject) {
        this.subject = subject;
        subject.register(this);
        // 각 여행지 축제 생성
        daegu = new CultureDaegu(this);
        paris = new CultureParis(this);
        tokyo = new CultureTokyo(this);
        jeju = new CultureJeju(this);
        seoul = new CultureSeoul(this);
    }

    @Override
    public void update(String place, int people) { // 여행지 및 인원 수 갱신
        this.place = place;
        this.people = people;
    }

    public void setState() {
        if (null != this.place) {
            switch (this.place) { // 여행지에 따른 축제 상태 변경
                case "서울":
                    culturestate = seoul;
                    break;
                case "파리":
                    culturestate = paris;
                    break;
                case "도쿄":
                    culturestate = tokyo;
                    break;
                case "제주":
                    culturestate = jeju;
                    break;
                case "대구":
                    culturestate = daegu;
                    break;
                default:
                    break;
            }
        }
    }

    public String[] getCulture() {
        String[] CultureList = culturestate.getCulture(); // 축제 목록
        return CultureList;
    }

    public int getCulturepice(int i) {
        this.cp = culturestate.getCultureprice(i); // 축제 가격
        int cpp = cp * people; // 인원 수에 따른 축제 가격
        System.out.println("축제 : " + cpp + "원");
        return cpp;
    }

}
