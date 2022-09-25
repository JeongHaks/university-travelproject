/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StatePattern;

import ObserverPattern.Observer;
import ObserverPattern.Schedule;
import ObserverPattern.Subject;
import StatePattern.StayGuestHouse;
import StatePattern.StayHotel;
import StatePattern.StayPension;
import StatePattern.StayResort;
import StatePattern.Staystate;
import StatePattern.Staystate;
import java.util.Scanner;

/**
 *
 * @author lgpc
 */
public class Stay {

    private int sp; // 숙박 가격
    // 각 숙박시설 상태 값
    Staystate GuestHouse;
    Staystate Hotel;
    Staystate Pension;
    Staystate Resort;
    Staystate staystate = GuestHouse; // 기본 숙박시설 상태 값은 게스트하우스

    public Stay() {
        // 각 숙박시설 상태 생성
        GuestHouse = new StayGuestHouse(this);
        Hotel = new StayHotel(this);
        Pension = new StayPension(this);
        Resort = new StayResort(this);

    }

    public void setState(String s) { // 숙박시설 상태 설정
        if (null != s) {
            switch (s) {
                case "게스트하우스":
                    staystate = GuestHouse;
                    break;
                case "호텔":
                    staystate = Hotel;
                    break;
                case "펜션":
                    staystate = Pension;
                    break;
                case "리조트":
                    staystate = Resort;
                    break;
                default:
                    break;
            }
        }
    }

    public String[] getRoom() { // 숙박시설에 따른 객실 목록
        String[] sr = staystate.getRoom();
        return sr;
    }

    public int getRoompice(int r, int num) {// 숙박시설에 따른 객실 가격
        this.sp = staystate.getRoomprice(r);
        int snump = sp * num; //객실 수에 따른 가격
        System.out.println("숙박 : " + snump + "원");
        return snump;
    }
}
