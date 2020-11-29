/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity6;

import java.io.File;

/**
 *
 * @author Windows 10
 */
public class Activity6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File my_file_dir = new File("/desktop/tabucon/sample.txt");
if (my_file_dir.exists()) 
{
System.out.println("­The directory or file exists.\n");
} 
else
{
System.out.println("­The directory or file does not exist.\n");
}
        // TODO code application logic here
    }
    
}
