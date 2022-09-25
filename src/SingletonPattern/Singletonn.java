/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonPattern;

//import singleton.*;
/**
 *
 * @author hak
 */
public class Singletonn {

    private volatile static Singletonn interimcheck;
    //volatile를 넣어서 휘발성이 있게 해준다.
    static boolean flag;
    private int freemoney; // 자유여행 총합가격
    private int pacmoney; // 패키지여행 총합 가격

    private Singletonn() {
        this.flag = false;
    } //싱글턴에서만 생성 가능(중간 점검 정의할 공간)

    public static Singletonn getInstance(/*value*/) {
        if (flag == false) {
            synchronized (Singletonn.class) { //더블 체크를 해서 동기화부분을 줄여준다.
                if (interimcheck == null) {
                    interimcheck = new Singletonn(/*value*/);
                }
            }
        }
        flag = true;
        return interimcheck;
    }

    public void setFreeMoney(int m) { // 자유여행 총합 가격 설정
        this.freemoney = m;
    }

    public int getFreeMoney() {
        return freemoney;
    }

    public void setPacMoney(int m) { // 패키지 여행 총합 가격 설정
        this.pacmoney = m;
    }

    public int getPacMoney() {
        return pacmoney;
    }
}
