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
public class StayResort implements Staystate {

    Stay stay;
    private String[] rroom = {"1인실 = 80000원", "2인실 = 140000원", "4인실 = 200000원"}; // 리조트 객실 목록
    private int[] rrp = {80000, 140000, 200000}; // 가격 목록

    public StayResort(Stay stay) {
        this.stay = stay;
    }

    @Override
    public String[] getRoom() {
        return rroom;
    }

    @Override
    public int getRoomprice(int r) {
        return rrp[r];
    }
}
