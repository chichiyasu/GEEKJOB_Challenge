/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Blackjackpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author inagakiyuuichi
 */
public class Dealer extends Human {

    protected ArrayList<Integer> cards = new ArrayList<Integer>();

    //Humanクラスからの継承
    public int open() {
        int total = 0;

        //myCards(手札）分、要素を取得し、合計する処理
        for (int i = 0; i < myCards.size(); i++) {

            total = myCards.get(i) + total;

        }

        return total;//カードの合計値を返す

    }

    public void setCard(ArrayList<Integer> C) {

        myCards.addAll(C);//手札のセット

    }

    public boolean checksum() {
        int total = 0;//カードの合計数値

        //myCards(手札）分、要素を取得し、合計する処理                                           
        for (int i = 0; i < myCards.size(); i++) {

            total = myCards.get(i) + total;
        }

        //合計されたカードの数値が、18以下の場合、trueを、18以上の場合、falseを返す
        if (total <= 16) {

            return true;

        } else {

            return false;
        }

    }

    //新規メソッド追加分
    public Dealer() {

        int limit = 13;//トランプの数字1〜10 絵札は、下記で作成

        //内側のfor文により、10枚のカードをcards(山札)へ追加,外側のfor文により、13枚を4週し、52枚のデッキを作る
        for (int num = 0; num < 4; num++) {
            for (int i = 1; i <= limit; i++) {
             if(i>=10){
                cards.add(10);
             }
                else{
                cards.add(i);
                
            }
        }
       
                
        }
        
        //Collections.shuffle(cards);//山札のランダム化
    }

    public ArrayList<Integer> deal() {
       ArrayList<Integer> dealerCards= new ArrayList<Integer>();
        
        

        Random rand = new Random();//乱数クラスのインスタンス生成

        for (int i = 0; i < 2; i++) {
            Integer index = rand.nextInt(cards.size()); //cards（山札）の配列内をランダムに１つ要素数を取得   

            dealerCards.add(cards.get(index));//myCards(手札）へ、cards（山札）からランダムに取得された要素を追加

        }

        return dealerCards;//for文により、2回繰り返され、追加された手札を返す

    }

    public ArrayList<Integer> hit() {
        ArrayList<Integer> hitCard = new ArrayList<Integer>();

        Random rand = new Random();//乱数クラスのインスタンス生成

        for (int i = 0; i < 1; i++) {
            Integer index = rand.nextInt(cards.size()); //cards（山札）の配列内をランダムに１つ要素数を取得   

            hitCard.add(cards.get(index));//myCards(手札）へ、cards（山札）からランダムに取得された要素を追加

        }

        return hitCard;//追加された手札を返す

    }

}
