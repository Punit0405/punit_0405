package com.company;
import javax.swing.*;
import java.util.*;

 abstract class Trade{

      abstract  double Taketrade(double x,double y);

        }

        class Taked_Trade extends Trade{
            @Override
            double Taketrade(double x, double y) {
                return x/y;
            }
        }

public class QUANTITY_DECIDER {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int End=0;
        while(End==0){
            System.out.println("Enter The Risk You Want To Take:");
            double x = S.nextDouble();
            System.out.println("Enter Stoploss Amount.(Difference between BUY and STOPLOSS)");
            double y = S.nextDouble();
            Taked_Trade T = new Taked_Trade();
            double Qty = T.Taketrade(x, y);
            System.out.println("You Should Buy " + Qty + "Quantity");
            System.out.println("If You Want To Exit the programme then press 1,If you want to continue then Press 0");
            int input=S.nextInt();
            if(input==1){End=input;}
            if(input==0){End=input;}


        }

    }



}
