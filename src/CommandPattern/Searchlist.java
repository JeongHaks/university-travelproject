/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandPattern;

/**
 *
 * @author hak
 */
public class Searchlist implements Command {

    private ShowMoney showmoney;

    public Searchlist(ShowMoney showmoney) {
        this.showmoney = showmoney;
    }

    public void OtherUp(int av) { //입력된 금액을 보여주는 클래스에 전달해준다.
        showmoney.usedMoney(av);
    }
}
