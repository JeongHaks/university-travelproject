/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StatePattern;

/**
 *
 * @author lgpc
 */
public interface TrafficState {

    public void setTraffic(String t); // 교통수단 

    public String[] getTraffic();

    public int getTrafficprice(int t);

}
