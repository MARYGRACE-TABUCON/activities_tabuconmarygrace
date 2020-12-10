/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package num2;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Pc
 */


    /**
     * @param args the command line arguments
     */
    
        public class Num2 {
 static Scanner scn = new Scanner(System.in);
 static LinkedList<String> grasya = new LinkedList<String>();
 
    public static void gg(){
       grasya.add("matchie");
       grasya.add("maloe");
       grasya.add("makuu");
       grasya.add("mikuu");
       grasya.add("mihou");
       System.out.println("Original content of the list:"+ grasya );
    }
    
    public static void main (String[] args){
        gg ();
        menu();
    }
    public static void menu () {
    System.out.println("Select new operation");
    System.out.println("1-Add");
    System.out.println("2-Remove");
    System.out.println("3-search");
    System.out.println("4-Set");
    System.out.println("5-Delete");
    System.out.println("Enter Choice: ");
    int choice = scn.nextInt();
    switch (choice){
        case 1:
            
           System.out.println("1 - add head");
           System.out.println("2 - add tail");
           System.out.println("3 - add element");
           int choice2 = scn.nextInt();
           switch(choice2){
               case 1 :
                addhead();
                System.out.println("New content : "+ grasya);
                menu();
                break;
               case 2 :
                   addtail();
                   System.out.println("New content : "+ grasya);
                   menu();
                   break;
                   case 3 :
                   addelement();
                   System.out.println("New content : "+ grasya);
                   menu();
                   break;
        }
           case 2:
            
           System.out.println("1 - remove head");
           System.out.println("2 - remove tail");
           System.out.println("3 - remove element");
           System.out.println("3 - remove all element");
           int choice3 = scn.nextInt();
           switch(choice3){
           case 1 :
                removehead();
                System.out.println("New content : "+ grasya);
                menu();
                break;
               case 2 :
                   removetail();
                   System.out.println("New content : "+ grasya);
                   menu();
                   break;
                   case 3 :
                   removeelement();
                   System.out.println("New content : "+ grasya);
                   menu();
                   break;
                    case 4 :
                   removeallelement();
                   System.out.println("New content : "+ grasya);
                   menu();
                   break;
           }case 3:
            
           System.out.println("1 - get head");
           System.out.println("2 - get tail");
           System.out.println("3 - get element");
           System.out.println("3 - get size");
           int choice4 = scn.nextInt();
           switch(choice4){
            case 1 :
                gethead();
                menu();
                break;
               case 2 :
                   gettail();
                   menu();
                   break;
                   case 3 :
                   getelement();
                   menu();
                   break;
                    case 4 :
                   getsize();
                   menu();
                   break;
           }case 4:
            
           System.out.println("1 - set head");
           System.out.println("2 - set tail");
           System.out.println("3 - set element");
           System.out.println("3 - set all element");
           int choice5 = scn.nextInt();
           switch(choice5){
               case 1 :
                sethead();
                System.out.println("New content : "+ grasya);
                menu();
                break;
     case 2 :
     settail();
     System.out.println("New content : "+ grasya);
     menu();
     break;
                   case 3 :
                   setelement();
                   System.out.println("New content : "+ grasya);
                   menu();
                   break;
    case 4 :
    setallelement();
    System.out.println("New content : "+ grasya);
    menu();
    break;
           } break;
           
           case 5:
           System.exit(0);
           break;        
    }
}
    public static String input(){
    System.out.println("Enter Element");
    String Enter =scn.next();
    return Enter;
    }

    private static void addhead() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void addtail() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void addelement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void removehead() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void removetail() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void removeelement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void removeallelement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void gethead() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void gettail() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void getelement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void getsize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void sethead() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void settail() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void setelement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void setallelement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

