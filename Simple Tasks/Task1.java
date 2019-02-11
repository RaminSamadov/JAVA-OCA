/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Task 1: 

Сумма
(Время: 1 сек. Память: 16 Мб Сложность: 19%)
Требуется посчитать сумму целых чисел, расположенных между числами 1 и N включительно.

Входные данные
В единственной строке входного файла INPUT.TXT записано единственное целое число N, не превышающее по абсолютной величине 104.

Выходные данные
В единственную строку выходного файла OUTPUT.TXT нужно вывести одно целое число — сумму чисел, расположенных между 1 и N включительно.

Пример
№	INPUT.TXT	OUTPUT.TXT
1	5	15
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author rsamadov
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    
                       
    public static void main(String[] args) {
        // TODO code application logic here
            
        Scanner in = new Scanner(System.in);
        
        //int[] a = new int[5000];

       System.out.print("Please insert N: ");
        
        int i = in.nextInt();
        int s = 0;
        int j=1;
        
     
        while (j<=i)
        {
          s=s+j;
          j++;         
        }        
                        
        System.out.println("Summ:" + s);               
    }      
    
}
