/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StatePattern;

import ObserverPattern.Observer;
import ObserverPattern.Schedule;
import ObserverPattern.Subject;
import java.util.Scanner;
import StatePattern.TrafficState;

/**
 *
 * @author lgpc
 */
public class Traffic implements Observer {
   private Subject subject;
   private String place; // 일정의 여행지
   private int people; // 일정의 인원수
   private int tp; // 교통수단 가격
   // 각 여행지의 고통수단 상태 값
   TrafficState daegu;
   TrafficState paris;
   TrafficState tokyo;
   TrafficState jeju;
   TrafficState seoul;
   TrafficState state = seoul; // 기본 교통수단 상태 값은 서울
        
   public Traffic(Subject subject){
        this.subject = subject;
        subject.register(this);
        //각 여행지 교통수단 상태 생성
        daegu = new TrafficDaegu(this);
        paris = new TrafficParis(this);
        tokyo = new TrafficTokyo(this);
        jeju = new TrafficJeju(this);
        seoul = new TrafficSeoul(this);
        
   }
   @Override
   public void update(String palce, int people) { // 여행지 및 인원 수 갱신
     this.place = palce;
     this.people = people;    
  }
   public void setState(){ // 여행지에 따른 교통수단 상태 설정
       if(null!=place)switch (place){            
            case "서울":
                this.state = seoul;
                break;
            case "제주":
                this.state = jeju;
                break;   
            case "대구":
                this.state = daegu;
                break;
            case "파리":
                this.state = paris;
                break;   
            case "도쿄":
                this.state = tokyo;
                break;     
        }
   }
   
   public void setTraffic(String t){ // 상태에 따른 교통수단 선택
       state.setTraffic(t);
   }
   
  public String[] getTraffic(){ // 선택된 교통수단 목록 
      return state.getTraffic();
  }
   public int getTrafficprice(int t){ // 선택된 교통수단 가격
       tp = state.getTrafficprice(t);
       int tpp = tp*people; // 인원 수에 따른 교통수단 가격
       System.out.println("교통수단 : " + tpp+ "원");
       return tpp;
   }
   
}
