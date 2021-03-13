package com.company;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
class Computer{
    int Comnum;
    public  Computer()
    {
        Random Rn = new Random();

         Comnum= Rn.nextInt(100);

    }
}
class User{
    int UserInput;
    public User()
    {
        Scanner Sc = new Scanner(System.in);
         UserInput=Sc.nextInt();
    }
}
class Check{
    public Check(int a,int b)
    {

    }
}
public class Cwh_Guess {
    public static void main(String[] args)
    {   Computer R1=new Computer();
        System.out.println("Now Guess the number!! ");
        User U1= new User();
        Check Ck= new Check(R1.Comnum, U1.UserInput);



    }


}
