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
public interface Staystate {
  public String[] getRoom(); // 객실 설정

  public int getRoomprice(int r) ; // 객실 가격

}
