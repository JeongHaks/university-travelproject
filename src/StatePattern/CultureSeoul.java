/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StatePattern;

import StatePattern.Culturestate;

/**
 *
 * @author lgpc
 */
public class CultureSeoul implements Culturestate {

    Culture culture;
    private String[] scul = {"창덕궁 달빛기행 = 20000원", "H-스타 페스티벌 예선 = 40000원", "라틴 아메리카 축제 = 25000원"}; // 서울 축제 목록
    private int[] sp = {20000, 40000, 25000}; // 서울 축제 가격

    public CultureSeoul(Culture culture) {
        this.culture = culture;
    }

    @Override
    public String[] getCulture() {
        return scul;
    }

    @Override
    public int getCultureprice(int r) {
        return sp[r];
    }

}
