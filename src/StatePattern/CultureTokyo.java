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
public class CultureTokyo implements Culturestate {

    Culture culture;
    private String[] tcul = {"도쿄오토살롱 = 30000원", "도쿄디자인페스타 = 25000원", "코믹마켓 = 15000원"}; // 도교 축제 목록
    private int[] tp = {30000, 25000, 15000}; // 도쿄 축제 가격

    public CultureTokyo(Culture culture) {
        this.culture = culture;
    }

    public String[] getCulture() {
        return tcul;
    }

    public int getCultureprice(int r) {
        return tp[r];
    }

}
