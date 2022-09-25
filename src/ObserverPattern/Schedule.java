/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverPattern;

/**
 *
 * @author lgpc
 */
import java.util.ArrayList;
import java.util.Arrays;
import Ui.FreeTraffic.*;
import Ui.FreeShedule.*;

public class Schedule implements Subject {

    private int startmonth; // 출발 월
    private int startday; // 출발 일
    private int returnmonth; // 복귀 월
    private int returnday; // 복귀 일
    private int people; // 인원 수 
    private String place; // 여행지
    private String text; // 일정
    private ArrayList<Observer> observers; // 갱신 데이터

    public Schedule() {
        observers = new ArrayList<>(); // 갱신 데이터 생성
    }

    public void register(Observer observer) {
        observers.add(observer); // 데이터 갱신
    }

    public void remove(Observer observer) {
        int index = observers.indexOf(observer);
        observers.remove(index);
    }

    public void notifyobserver() {
        for (Observer observer : observers) {
            observer.update(place, people); // 여행지 및 인원 수 갱신
        }
    }

    public void setdays(int startmonth, int startday, int returnmonth, int returnday, int people, String place) { // 일정 설정
        this.startmonth = startmonth;
        this.startday = startday;
        this.returnmonth = returnmonth;
        this.returnday = returnday;
        this.people = people;
        this.place = place;
        this.text = "일정 출발일 : " + startmonth + "월 " + startday + "일 " + "복귀일 : " + returnmonth + "월 " + returnday + "일 " + "출발지 : 부산 여행지 : " + place + " 인원 : " + people;
        notifyobserver(); // 갱신
    }

    public int getStartmonth() {
        return startmonth;
    }

    public int getStartday() {
        return startday;
    }

    public int getReturnmonth() {
        return returnmonth;
    }

    public int getReturnday() {
        return returnday;
    }

    public int getPeople() {
        return people;
    }

    public String getPlace() {
        return place;
    }

    public String getDaily() {
        System.out.println(text);
        return text;
    }

}
