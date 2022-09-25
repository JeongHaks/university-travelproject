/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StatePattern;

import StatePattern.Staystate;

/**
 *
 * @author lgpc
 */
public class StayHotel implements Staystate {

    Stay stay;
    private String[] hroom = {"1인실 = 100000원", "2인실 = 180000원", "4인실 = 250000원"}; // 호텔 객실 목록
    private int[] hrp = {100000, 180000, 250000}; // 객실 가격

    public StayHotel(Stay stay) {
        this.stay = stay;
    }

    @Override
    public String[] getRoom() {
        return hroom;
    }

    @Override
    public int getRoomprice(int r) {
        return hrp[r];
    }
}
