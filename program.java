/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.marksheetusingarray;

import java.util.Scanner;

/**
 *
 * @author nickhnl
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the Name:   ");
            String n = input.nextLine();
            System.out.print("Enter Symbol No.: ");
            String sym = input.nextLine();
            System.out.println("Enter marks in five subjects");
            String[] Sub = {"Java", "Php", "Networking", "Python", "Multimedia"};
            double m[] = new double[Sub.length];
            int Total = 0;
            for (int i = 0; i < 5; i++) {
                System.out.print("Marks in " + Sub[i] + ":");
                m[i] = input.nextInt();
                Total += m[i];
            }
            int percentage = Total / 5;
            System.out.println("\t\t MARKSHEET");
            System.out.println("\t____________________________");
            System.out.println("\n\tName:" + n);
            System.out.println("\tSymbol No.:" + sym);
            System.out.println("\n\t --------Your Marks--------");
            System.out.println("\t1."+Sub[0] + "\t\t\t" + m[0]);
            System.out.println("\t2."+Sub[1] + "\t\t\t" + m[1]);
            System.out.println("\t3."+Sub[2] + "\t\t" + m[2]);
            System.out.println("\t4."+Sub[3] + "\t\t" + m[3]);
            System.out.println("\t5."+Sub[4] + "t\t\t" + m[4]);
            System.out.println("\t____________________________");
            if (m[0] >= 32 && m[1] >= 32 && m[2] >= 32 && m[3] >= 32 && m[4] >= 32) {
                System.out.println("\n\t~RESULT:PASS;)");
                System.out.println("\t~TOTAL MARKS:" + Total);
                System.out.println("\t~PERCENTAGE:" + percentage + "%");
                String Division = null;
                if (percentage >= 75) {
                    System.out.println("\t~GRADE:DISTINCTION");
                } else if (percentage >= 65 && percentage < 75) {
                    System.out.println("\t~GRADE:FIRST DIVISION");
                } else if (percentage >= 50 && percentage < 65) {
                    System.out.println("\t~GRADE:SECOND DIVISION");
                } else if (percentage >= 40 && percentage < 50) {
                    System.out.println("\t~GRADE:PASS");
                }
            } else {
                System.out.println("\n\t~YOU FAILED :(");
            }
            System.out.println("\nWanna continue[Y/N]");
            String choice = input.next();
            if (choice.equalsIgnoreCase("n")) {
                System.exit(0);
            }
        }
    }
}
