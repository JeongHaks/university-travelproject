/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StatePattern;

import StatePattern.TrafficState;

/**
 *
 * @author hak
 */
public class TrafficParis implements TrafficState {

    Traffic traffic;
    private String error[] = {"비행기를 선택해주세요"};//에러메세지
    private String air[] = {"08:00 = 659000원", "10:00 = 765000원", "12:00 = 807000원", "14:00 = 1262000원", "16:00 = 1560000원", "18:00 = 1509000원"}; // 비행기 시간 및 가격
    private int ap[] = {659000, 765000, 807000, 1262000, 1560000, 1509000}; // 비행기 가격
    private String[] TrafficList; // 선택된 교통수단 목록
    private int TrafficPrice; // 선택된 교통수단 가격
    private String tname; // 교통수단 이름

    public TrafficParis(Traffic traffic) {
        this.traffic = traffic;
    }

    @Override
    public void setTraffic(String t) {
        this.tname = t;

        if (null != t) {
            switch (t) {
                case "비행기":
                    this.TrafficList = air;
                    break;
                default:
                    this.TrafficList = error;
                    break;

            }
        }
    }

    @Override
    public String[] getTraffic() {
        return TrafficList;
    }

    @Override
    public int getTrafficprice(int t) {
        if (null != tname) {
            switch (tname) {
                case "비행기":
                    this.TrafficPrice = ap[t];
                    break;
                default:
                    break;
            }
        }
        return TrafficPrice;
    }
}
