/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StandardClasspackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author inagakiyuuichi
 */


public class File3 {
    public static void main(String[] args) throws IOException{
     
        
        Date start = new Date();
        Date finish =new Date();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String st =  sdf.format(start);
        String fin=  sdf.format(finish);
       
    
        File Log = new File("logfile.txt");

        FileWriter fw = new FileWriter(Log);

        fw.write(sdf.format(start) + "開始");

        //Mathクラスの利用
        double a = 5d;
        double b = 5d;
        double c = Math.pow(a, b);
        
        System.out.println("それでは、Mathクラスを利用して乗数の計算を行います。");
        System.out.println(a + "の" + b + "乗は、");
        System.out.println(c + "です");

       
        fw.write(sdf.format(finish) + "終了");

        fw.close();

        FileReader fr = new FileReader(Log);
        BufferedReader br = new BufferedReader(fr);

        System.out.println(br.readLine());

        br.close();

    }

   
    }
    

