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
public class TrafficTokyo implements TrafficState{
       Traffic traffic;
      private String error[] = {"비행기를 선택해주세요"}; // 에러 메세지
      private String air[] = {"08:00 = 209000원", "10:00 = 190000원", "12:00 = 67000원", "14:00 = 218000원" , "16:00 = 265000원"}; // 비행기 시간 및 가격 목록
      private int ap[] = {209000,190000,67000,218000,265000}; // 비행기 가격
      private String[] TrafficList; // 선택된 교통수단 목록
      private int TrafficPrice; // 선택된 교통수단 가격
      private String tname; // 교통수단 이름  
      
  public TrafficTokyo(Traffic traffic){
      this.traffic = traffic;
  }
  
       @Override
  public void setTraffic(String t){ // 교통수단 선택
      this.tname = t;
      if(null!=t)switch (t) {
             case "비행기":
                     this.TrafficList = air;
                           break;
             default:
                 this.TrafficList=error;
                 break;
                 
         }
  }
       @Override
  public String[] getTraffic(){ // 선택된 교통수단 목록
      return TrafficList;
  }
       @Override
  public int getTrafficprice(int t){// 교통수단 가격
      
      if(null!=tname)switch (tname) {
             case "비행기":
                 this.TrafficPrice = ap[t];
                 break;
             default:
                 break;
         }
      return TrafficPrice;
  }
}