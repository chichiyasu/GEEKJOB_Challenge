/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StandardClasspackage;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;


/**
 *
 * @author inagakiyuuichi
 */
public class Date3 {
    public static void main(String[] args){
        
        Calendar c = Calendar.getInstance();

        c.set(2016, 10, 4, 10, 0, 0);

        Date d = c.getTime();
        System.out.println(d);
        System.out.println(d.getTime());

        //表示方法の変更
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = sdf.format(d);
        System.out.println(dateString);


        
        
    }
    
    
    
}
