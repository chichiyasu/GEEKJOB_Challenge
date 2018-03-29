/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StandardClasspackage;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author inagakiyuuichi
 */
public class File1 {
    public static void main(String[] args) throws IOException{
        
          File fp = new File("prof.text");//ファイルオープン
        FileWriter fw = new FileWriter(fp);

        fw.write("わたしの名前は、稲垣裕一です。出身地は、神奈川県です。");

        fw.close();//ファイルクローズ

    }

}

