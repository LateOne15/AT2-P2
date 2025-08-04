/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberwithspaces;

import java.util.Scanner;

/**
 *
 * @author lleyt
 */
public class NumberWithSpaces {

    public static void main(String[] args) {
        int inputNum = 0;
        String unseparated, separated;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string of 5 digits, and this program will");
        System.out.println(" them separated by a space.");
        
        System.out.print("Input here: ");
        inputNum = sc.nextInt();
        unseparated = Integer.toString(inputNum);
        
        char a = unseparated.charAt(0);
        char b = unseparated.charAt(1);
        char c = unseparated.charAt(2);
        char d = unseparated.charAt(3);
        char e = unseparated.charAt(4);
        
        separated = a+" "+b+" "+c+" "+d+" "+e;
        System.out.println(separated);
    }
}
