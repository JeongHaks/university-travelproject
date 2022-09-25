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
public class CultureParis implements Culturestate {

    Culture culture;
    private String[] pcul = {"파리모터쇼 = 33000원", "메종오브제 = 45000원", "오포지토 거리극 페스티벌 = 47000원"}; // 프랑스 축제 목록
    private int[] pp = {33000, 45000, 47000}; // 프랑스 축제 가격

    public CultureParis(Culture culture) {
        this.culture = culture;
    }

    public String[] getCulture() {
        return pcul;
    }

    public int getCultureprice(int r) {
        return pp[r];
    }

}
