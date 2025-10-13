/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberwithspaces;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lleyt
 */
public class NumberWithSpaces {

    public static void main(String[] args) {
        int inputNum = 0, size = 0;
        ArrayList<Integer> uncorrected = new ArrayList<Integer>();
        ArrayList<Integer> corrected = new ArrayList<Integer>();
        String separated;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string of 5 digits, and this program will"
                + " output them separated by a space.");
        
        System.out.print("Input here: ");
        inputNum = sc.nextInt();
        
        while(inputNum > 0) {
            uncorrected.add(inputNum % 10);
            inputNum = inputNum/10;
            size++;
        }
        
        for(int num : uncorrected) {
            corrected.addFirst(num);
        }
        
        separated = "";
        int i = 0;
        for(int sepNum : corrected) {
            i++;
            separated += sepNum;
            if (i < size) {
                separated += " ";
            }
        }
        
        System.out.println(separated);
    }
}