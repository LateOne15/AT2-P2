/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javastory;

import java.util.Scanner;

/**
 *
 * @author 30128198
 */
public class JavaStory {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = "John", name2 = "Jane";
        int apples = 0, oranges = 0;
        double cost1 = 0.0, cost2 = 0.0, totalcost = 0.0, split = 0.0;
        double name1cost = 0.0, name2cost = 0.0;
        
        System.out.print("Who is our first character? ");
        name1 = sc.nextLine();
        System.out.print("Who is out second character? ");
        name2 = sc.nextLine();
        System.out.print("How many apples do they want? ");
        apples = sc.nextInt();
        System.out.print("How much do they cost each? ");
        cost1 = sc.nextDouble();
        System.out.print("How many oranges do they want? ");
        oranges = sc.nextInt();
        System.out.print("How much do they cost each? ");
        cost2 = sc.nextDouble();
        
        totalcost = apples*cost1 + oranges*cost2;
        
        System.out.print("What percentage of "+totalcost+" is "+name1+" willing to pay? ");
        split = sc.nextDouble();
        
        name1cost = totalcost * (split/100);
        name2cost = totalcost - name1cost;
        
        String output = name1+" and "+name2+" were at a market stall selling "
                + "apples and oranges.\n"+name1+" asked "+name2+" how many apples"
                + " they wanted, which was "+apples+", and how many oranges\nthey"
                + " wanted, which was "+oranges+". The apples cost $"+cost1+" each,"
                + " while the oranges\ncost $"+cost2+" each, totalling to $"+totalcost
                + ". "+name1+" was willing to pay for "+split+"% of that,\nleaving"
                + " them to pay $"+name1cost+", and "+name2+" to pay $"+name2cost+".";
        System.out.println(output);
    }
}
