/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity3;

/**
 *
 * @author Windows 10
 */
public class Activity3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
//calculate sum of all array elements
int sum = 0;
for(int i=0; i < numbers.length ; i++)
sum = sum + numbers[i];
//calculate average value
double average = sum / numbers.length;
System.out.println("­Average value of the array elements is : " + average); 
        // TODO code application logic here
    }
    
}
