/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StandardClasspackage;

/**
 *
 * @author inagakiyuuichi
 */
public class String1 {
    public static void main(String[] args){
    
        String name = "稲垣裕一";

        //名前の表示
        System.out.println(name);
        //名前の長さを取得、表示
        System.out.println("文字数は、"+name.length());
        //名前のバイト数を取、表示
        System.out.println("バイト数は、" + name.getBytes().length);


    }
}
