/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StatePattern;

import StatePattern.Culturestate;
import StatePattern.Culture;

/**
 *
 * @author lgpc
 */
public class CultureJeju implements Culturestate{
    Culture culture;
    private String[] jcul={"허브동산 별빛놀이 = 10000원", "보목 자리돔축제 = 25000원", "한림공원 수국축제 = 14000원"}; // 제주도 축제 목록
    private int[] jp ={10000,25000,14000}; // 제주도 축제 가격
    
    public CultureJeju(Culture culture){
        this.culture = culture;
    }
    
    @Override
    public String[] getCulture(){
        return jcul;
    }

    @Override
    public int getCultureprice(int r){
        return jp[r];
    }
    
}
