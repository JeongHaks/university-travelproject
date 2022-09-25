/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandPattern;

import java.util.Scanner;

/**
 *
 * @author hak
 */
public class OtherExpenses {

    ShowMoney sm = new ShowMoney();
    private Command command;
    private int priceA; //입력한 금액을 받아올 변수
    private String numm = "1";
    int priceBB;
    String[] food = {"1.음식", "2.렌터카", "3.기념품"};
    String search = "1";

    public OtherExpenses() {
    }

    public void setCommand(Command command) {  // 목록값 전달.
        for (int i = 0; i < food.length; i++) {
            System.out.println(food[i]);
        }
        this.command = command;
    }

    public void setSearch(String num, int priceA) {
        //금액,상품선택 받아오는 함수
        this.numm = num;//num의 값을 numm에 저장
        this.priceBB = priceA; //priceA의 값을 priceBB에 저장
        switch (numm) {
            case "1":
                System.out.println("사용하실 예상금액 입력해주세요 : " + priceBB);
                sm.usedMoney(priceBB);//금액을 표시해주는 함수로 전달

                break;
            case "2":
                System.out.println("사용하실 예상금액 입력해주세요 : " + priceBB);
                sm.usedMoney(priceBB);
                break;
            case "3":
                System.out.println("사용하실 예상금액 입력해주세요 : ");
                sm.usedMoney(priceBB);
                break;
            default:
                System.out.println("잘못 입력되었습니다");
                break;
        }
    }

    public String[] getCommand() {//목록을 저장해서 보내주는 함수
        String[] pr1;
        pr1 = this.food;
        return pr1;
    }
}
