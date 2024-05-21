package com.tut02;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        int dollars, quarters, dimes, nickles, pennies;

        Scanner sc = new Scanner(System.in);
        System.out.println("Quarters: ");
        quarters = sc.nextInt();
        System.out.println("dimes: ");
        dimes = sc.nextInt();
        System.out.println("nickles: ");
        nickles = sc.nextInt();
        System.out.println("pennies: ");
        pennies = sc.nextInt();

        dollars = quarters/4 + dimes/10 + nickles/20 + pennies/100;
        System.out.println("dollars: " + dollars);
    }
}
