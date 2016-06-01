/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.marksheet.Mrk;

import java.util.Scanner;

/**
 *
 * @author Karan
 */
public class Marks {

    public void calc() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name:");
        String ch = in.next();
        System.out.println("Enter symbol number:");
        String x = in.next();

        System.out.println("Enter the mark in English:");
        int a = in.nextInt();
        System.out.println("Enter the mark in Nepali:");
        int b = in.nextInt();
        System.out.println("Enter the mark in Math:");
        int c = in.nextInt();
        System.out.println("Enter the mark in Science:");
        int d = in.nextInt();
        System.out.println("Enter the mark in Optional Math:");
        int e = in.nextInt();
        System.out.println("Enter the mark in Computer:");
        int f = in.nextInt();
        System.out.println("Enter the mark in Social:");
        int g = in.nextInt();

        int Total;
        Total = a + b + c + d + e + f + g;

        int Percentage;
        Percentage = Total / 7;

        String DIVISION = null;
        if (Percentage >= 80) {
            DIVISION = "Distinction";
        } else if (Percentage >= 60 && Percentage < 80) {
            DIVISION = "First Division";
        } else if (Percentage < 60 && Percentage >= 50) {
            DIVISION = "Second Division";

        } else if (Percentage >= 40 && Percentage < 50) {
            DIVISION = "Third Division";
        } else {
            DIVISION = "*";
        }
        System.out.println("English                :" + a);
        System.out.println("Nepali                 :" + b);
        System.out.println("Math                   :" + c);
        System.out.println("Science                :" + d);
        System.out.println("Optional Math          :" + e);
        System.out.println("Computer               :" + f);
        System.out.println("Social                 :" + g);
        System.out.println(".................................");
       

        if (a >= 32 && b >= 32 && c >= 32 && d >= 32 && e >= 32 && f >= 32 && g >= 32) {
            System.out.println("Total=" + Total);
            System.out.println("Percentage=" + Percentage);
            System.out.println("DIVISION=" + DIVISION);
        } else {
            System.out.println("Total=");
            System.out.println("Percentage=");
            System.out.println("DIVISION=");
            System.out.println("Fail");
        }

    }

}
