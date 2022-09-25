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
public class TrafficDaegu implements TrafficState {
      Traffic traffic;
      private String error[] = {"버스와 기차에서 선택해주세요"}; // 에러메세지
      private String bus[] = {"08:00 = 6700원", "10:00 = 6700원", "12:00 = 6700원", "14:00 = 6700원"}; // 버스 시간 및 가격 목록
      private String ktx[] = {"무궁화 06:00 = 7700원", "ITX-새마을 10:00 = 11400원", "무궁화 01:00 = 7700원", "무궁화 14:00 = 7700원"}; // 기차 시간 및 가격 목록
      private int bp[] = {6700,6700,6700,6700}; // 버스 가격
      private int kp[] = {7700,11400,7700,7700}; // 기차 가격
      private String[] TrafficList; // 선택된 교통수단 목록
      private int TrafficPrice; // 선택된 교통수단 가격
      private String tname; // 교통수단 이름
  public TrafficDaegu(Traffic traffic){
      this.traffic = traffic;
  }
  
      @Override
  public void setTraffic(String t){  // 교통수단 선택
      this.tname = t;
      if(null!=t)switch (t) {
             case "버스":
                    this.TrafficList = bus;
                break;
             case "기차":
                    this.TrafficList=ktx;
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
  public int getTrafficprice(int t){ // 교통수단 가격 선택
      if(null!=tname)switch (tname) {
             case "버스":
                 this.TrafficPrice = bp[t];
                 break;
             case "기차":
                 this.TrafficPrice = kp[t];
                 break;
             default:
                 break;
         }
      return TrafficPrice;
  }  
}
