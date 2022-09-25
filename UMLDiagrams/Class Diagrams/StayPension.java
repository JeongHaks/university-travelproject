/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StatePattern;

import StatePattern.Stay;
import StatePattern.Staystate;

/**
 *
 * @author lgpc
 */
public class StayPension implements Staystate {
    Stay stay;
    private String[] proom={"1인실 = 40000원", "2인실 = 80000원", "4인실 = 150000원"}; // 펜션 객실 목록
    private int[] prp ={40000,80000,150000}; // 가격 목록
    
    public StayPension(Stay stay){
        this.stay = stay;
    }
    
    @Override
    public String[] getRoom(){
        return proom;
    }

    @Override
    public int getRoomprice(int r){
        return prp[r];
    }
}
