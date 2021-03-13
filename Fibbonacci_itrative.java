package com.company;

public class Fibbonacci_itrative {
    public static void main(String[] args) {
        int n=20;
        long []a=new long[n];
        a[0]=0;
        a[1]=1;


        if(n==2)
        {
            System.out.print(a[0]+" "+a[1]);
        }
        else {
            for (int i = 2; i < n; i++) {
                a[i] = a[i - 1] + a[i - 2];
            }

            System.out.println("The Fibbonacci Series Is:");

            for (int j = 0; j <= n - 1; j++) {
                System.out.print(a[j] + " ");
            }
        }
    }
}
