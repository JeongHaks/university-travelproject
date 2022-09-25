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
//seoul/.................
public class TrafficSeoul implements TrafficState{
      Traffic traffic;
      private String error[] = {"버스와 기차와 비행기에서 선택해주세요"}; // 에러메세지
      private String bus[] = {"08:00 = 23000원", "10:00 = 23000원", "12:00 = 23000원", "14:00 = 23000원"};// 버스 시간 및 가격 목록
      private String ktx[] = {"무궁화 08:00 = 28600원", "KTX 10:00 = 59800원", "KTX 12:00 = 59800원", "KTX 14:00 = 53900원"}; // 기차 시간 및 가격 목록
      private String air[] = {"08:00 = 49000원", "10:00 = 55000원", "12:00 = 56000원", "14:00 = 55000원" , "16:00 = 52000원", "18:00 = 49000원"}; // 비행기 시간 및 가격 목록
      private int bp[] = {23000,23000,23000,23000}; // 버스 가격
      private int kp[] = {28600,59800,59800,53900}; // 기차 가격
      private int ap[] = {49000,55000,56000,55000,52000,49000}; // 비행기 가격
      private String[] TrafficList; // 선택된 교통수단 목록
      private int TrafficPrice; // 선택된 교통수단 가격
      private String tname; // 교통수단 이름  
     
  public TrafficSeoul(Traffic traffic){
      this.traffic = traffic;
  }
  
      @Override
  public void setTraffic(String t){
      this.tname = t;
      
      if(null!=t)switch (t) {
             case "버스":
                     this.TrafficList = bus;
                           break;
             case "기차":
                     this.TrafficList = ktx;
                           break;
             case "비행기":
                     this.TrafficList = air;
                           break;
             default:
                 this.TrafficList=error;
                 break;
                 
         }
  }
      @Override
  public String[] getTraffic(){
      return TrafficList;
  }
      @Override
  public int getTrafficprice(int t){
      if(null!=tname)switch (tname) {
             case "버스":
                 this.TrafficPrice = bp[t];
                 break;
             case "기차":
                 this.TrafficPrice = kp[t];
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