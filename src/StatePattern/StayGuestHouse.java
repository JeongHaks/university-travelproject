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
public class StayGuestHouse implements Staystate {

    Stay stay;
    private String[] groom = {"1인실 = 30000원", "2인실 = 50000원", "4인실 = 100000원"}; // 게스트하우스 객실 목록
    private int[] grp = {30000, 50000, 100000}; // 객실 가격

    public StayGuestHouse(Stay stay) {
        this.stay = stay;
    }

    @Override
    public String[] getRoom() {
        return groom;
    }

    @Override
    public int getRoomprice(int r) {
        return grp[r];
    }

}
