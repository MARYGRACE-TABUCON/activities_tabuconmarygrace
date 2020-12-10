/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package num3;

import java.io.File;

/**
 *
 * @author Pc
 */
public class Num3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       test();
    }
    
    public static void test(){
    File data = new File ("C:\\Users\\Pc\\Desktop\\module2_assesment\\");
    String [] fileList = data.list();
    for (String beef : fileList){
    System.out.println(beef);
    
    }
    }
    }
    
}
