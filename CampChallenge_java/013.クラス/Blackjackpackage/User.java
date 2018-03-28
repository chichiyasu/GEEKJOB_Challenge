/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Blackjackpackage;

import java.util.ArrayList;

/**
 *
 * @author inagakiyuuichi
 */
public class User extends Human {
 
   
    public int open() {
        int total = 0;

        for (int i = 0; i < myCards.size(); i++) {

            total =myCards.get(i)+ total;

        }
      
        
        return total;

    }

    public void setCard(ArrayList<Integer>C) {
      
        myCards.addAll(C);

    }

    public boolean checksum() {
        int total = 0;

        for (int i = 0; i < myCards.size(); i++) {

            total = myCards.get(i) + total;
        }

        if (total <= 16) {

            return true;

        } else {

            return false;
        }

    }
}

