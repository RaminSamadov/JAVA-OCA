/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

https://acmp.ru/index.asp?main=task&id_task=35

 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author rsamadov
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        // TODO code application logic here
            
        Scanner in = new Scanner(System.in);
        
        //int[] a = new int[5000];
                                      
       System.out.println("Please insert k (count of k avtomat): ");        
                
        int k = in.nextInt();
        
        
        int n[] = new int [k+1];         
        int m[] = new int [k+1]; 
        int d[] = new int [k+1];
        
        int i=0;
        
        System.out.println("K = " + k);
        
        while (i<k)
        {
         System.out.println("Please insert " + i + " first elements m and n: ");       
         n[i]= in.nextInt();
         m[i]= in.nextInt();
         System.out.println("K = " + m[i] + "  " + n[i]);
         
         i++;
        }        
        
      
        
        for (int j=0; j<k; j++)
        {
        d[j] = (19*m[j] + ((n[j] + 239)*(n[j] + 366) / 2));   
        System.out.println("d = " +d[j]);
    }  
    }    
    
}


