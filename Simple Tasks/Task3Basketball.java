/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author rsamadov
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here                  
        
       Scanner in = new Scanner(System.in);                                               
       System.out.println("Please insert mathc results: ");                               
        int n[] = new int [8];                       
        int i=0;                
        
        while (i<8)
        {
        n[i]=in.nextInt();
        i++;               
        }
                          
        int s1 =0;
        int s2 = 0;
                          
              
for (int j=0; j<8; j++)
{               
    if (((j+1) % 2)== 0)
        {
            s2=s2+n[j];             
        }
            else {
                    s1=s1+n[j];                    
                 }
}
        
            
        
if (s1>s2) {
  System.out.println("The wiiner is First team");
} else if (s1<s2) {
   System.out.println("The wiiner is Second team");
} else {
      System.out.println("The result is Draw"); 
}                     
    
    }    
}
