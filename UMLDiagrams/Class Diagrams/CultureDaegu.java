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
public class CultureDaegu implements Culturestate{
    Culture culture;
    private String[] dcul={"이월드 별빛축제 = 10000원", "강정 대구 현대미술제 = 15000원", "달성 토마토축제 = 20000원"}; // 대구 축제 목록
    private int[] dp ={10000,15000,20000}; // 축제 가격 목록
    
    public CultureDaegu(Culture culture){
        this.culture = culture;
    }
    
    @Override
    public String[] getCulture(){
        return dcul;
    }

    @Override
    public int getCultureprice(int r){
        return dp[r];
    }
    
}
