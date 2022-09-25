/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StatePattern;

import StatePattern.Traffic;
import StatePattern.TrafficState;


/**
 *
 * @author hak
 */
public class TrafficJeju implements TrafficState{
      Traffic traffic;
      private String error[] = {"배와 비행기에서 선택해주세요"}; // 에러메세지
      private String vessel[] = {"08:00 = 32000원", "10:00 = 37000원", "16:00 = 30000원", "19:00 = 44000원"}; // 배 시간 및 가격 목록
      private String air[] = {"08:00 = 59000원", "10:00 = 65000원", "12:00 = 67000원", "14:00 = 62000원" , "16:00 = 60000원", "18:00 = 59000원"}; // 비행기 시간 및 가격 목록
      private int vp[] = {32000,37000,30000,44000}; // 배 가격
      private int ap[] = {59000,65000,67000,62000,60000,59000}; // 비행기 가격
      private String[] TrafficList; // 선택된 교통수단 목록
      private int TrafficPrice; // 선택된 교통수단 가격
      private String tname; // 교통수단 이름  
      
  public TrafficJeju(Traffic traffic){
      this.traffic = traffic;
  }
  
      @Override
  public void setTraffic(String t){ // 교통수단 선택
      this.tname = t;
      if(null!=t)switch (t) {
             case "배":
                     this.TrafficList = vessel;
                           break;
             case "비행기":
                     this.TrafficList = air;
                           break;
             default:
                 this.TrafficList = error;
                 break;
         }
  }
      @Override
  public String[] getTraffic(){ // 선택된 교통수단 목록
      return TrafficList;
  }
      @Override
  public int getTrafficprice(int t){ // 교통수단 가격 선택
      if(null!=tname)switch (tname) {
             case "배":
                 this.TrafficPrice = vp[t];
                 break;
             case "비행기":
                 this.TrafficPrice = ap[t];
                 break;
             default:
                 break;
         }
      return TrafficPrice;
  }
}
