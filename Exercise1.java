package com.company;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        // Take Input from user and derive the perceentage clculator
        Scanner S = new Scanner(System.in);
        System.out.println("Enter The total marks:");
        int total= S.nextInt();
        System.out.println("Enter The Marks Of Subject 1");
        int Sub1 = S.nextInt();
        System.out.println("Enter The Marks Of Subject 2");
        int Sub2 = S.nextInt();
        System.out.println("Enter The Marks Of Subject 3");
        int Sub3 = S.nextInt();
        System.out.println("Enter The Marks Of Subject 4");
        int Sub4 = S.nextInt();
        System.out.println("Enter The Marks Of Subject 5");
        int Sub5 = S.nextInt();

        int Sum= Sub1+Sub2+Sub3+Sub4+Sub5;
        int TotalM=5*total;
        float Per=Sum*100/TotalM;

        System.out.println("The Percentage of Student is "+ Per);

    }
}
