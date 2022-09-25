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
public interface Culturestate {
  public String[] getCulture(); // 축제 목록

  public int getCultureprice(int r) ; // 축제 가격
    
}
