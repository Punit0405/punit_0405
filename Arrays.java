package com.company;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int row,column;
        Scanner S=new Scanner(System.in);
        System.out.println("Enter The Number of Rows You want");
        row=S.nextInt();
        System.out.println("Enter The Number of coloumns you want");
        column=S.nextInt();
        String [] [] TwoDarr;
        TwoDarr=new String[row][column];



        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.printf("Enter Data For %d%d Position\n",i,j);
                TwoDarr[i][j]=S.next();
            }

        }
        System.out.printf("THE DATA IS\n\n");

        for(int i=0;i<row;i++)
        {
           for(int j=0;j<column;j++)
           {
               System.out.print(TwoDarr[i][j]+"\t");
           }
            System.out.println();
        }


    }
}
