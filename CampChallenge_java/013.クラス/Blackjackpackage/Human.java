/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Blackjackpackage;
/**
 *
 * @author inagakiyuuichi
 */
import java.util.ArrayList;
abstract class Human {

    protected ArrayList<Integer> myCards = new ArrayList<Integer>();
    

    abstract public int open();

    abstract public void setCard(ArrayList<Integer> C);

    abstract public boolean checksum();

}
