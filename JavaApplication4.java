/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author rsamadov
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Scanner in = new Scanner(System.in);           
        
  int m1 = 0 , m2 =0, m3=0; 
  int bigx=0;
  
  System.out.print("Please insert all 3 masses");
  
  
   m1=in.nextInt();
   m2=in.nextInt();
   m3=in.nextInt();
   
   if ((m1 < 94) || (m2<94) || (m3<94) || (m1 > 727 ) || (m2>727) || (m3>727)) {
        System.out.println("Error");
        System.exit(0);
    } 
   
   if (bigx<m1) {
       bigx=m1;
           }
   
   if (bigx<m2) {
       bigx=m2;
           }
   
   if (bigx<m3) {
       bigx=m3;
           }
   
   System.out.println("The biggest mass is:" + bigx);
}

}