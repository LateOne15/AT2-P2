/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.totalaverage;

import java.util.Scanner;

/**
 *
 * @author lleyt
 */
public class TotalAverage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalInt, FirstInt = 0, SecondInt = 0, ThirdInt = 0;
        double averageDouble;
        
        System.out.print("Give me three integers, and I'll give you");
        System.out.println(" the average and the total.");
        System.out.print("First int: ");
        FirstInt = sc.nextInt();
        System.out.print("Second int: ");
        SecondInt = sc.nextInt();
        System.out.print("Third int: ");
        ThirdInt = sc.nextInt();
        
        totalInt = FirstInt + SecondInt + ThirdInt;
        averageDouble = (double)totalInt/3;
        
        System.out.println("The integer sum of your input is " + totalInt + ".");
        System.out.println("The average of your inputs is " + averageDouble + ".");
    }
}
