/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StandardClasspackage;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author inagakiyuuichi
 */
public class Date4 {
    public static void main(String[] args){
        //一つ目の日付を作成
        Calendar c1 = Calendar.getInstance();
        c1.set(2015,0,1,0,0,0);     
        Date d1 =c1.getTime();
        System.out.println(d1);
       
       //二つ目の日付を作成
       Calendar c2 = Calendar.getInstance();
       c2.set(2015,11,31,23,59,59);
       Date d2 =c2.getTime();
       System.out.println(d2);
       
       //二つの日時の秒数の差を計算
       Long L =d1.getTime()-d2.getTime();
       
       System.out.println(L);
              
    }
    
    
}
