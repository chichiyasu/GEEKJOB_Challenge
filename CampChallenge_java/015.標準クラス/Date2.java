/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StandardClasspackage;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author inagakiyuuichi
 */
public class Date2 {
    public static void main(String[] args){
        
        Date now = new Date();
        
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH/:mm:ss");
        
        String dateString=sdf.format(now);
        System.out.print(dateString);   
        
        
    }
    
}
