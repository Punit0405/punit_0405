package com.company;


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
    public void  Check1(int a,int b)

    {
      if(a>b)
      {
          System.out.printf("Your Number Is Lower Than The Computer\nPlease,Choose Higher Then %d\n\n",b);
      }
      if(a<b)
      {
          System.out.printf("Your Number Is Higher Than The Computer\nPlease,Choose Lower Then %d\n\n",b);
      }



    }
  }
  class NoOfGusses{
    private int Num=1;

    public void SetNum()
    {
       this.Num +=1;
    }
    public int GetNum()
    {
      return this.Num;
    }
  }
public class Cwh_Guess {
    public static void main(String[] args)
    {   Computer R1=new Computer();
        Scanner NN= new Scanner(System.in);
        Check Ck=new Check();
        NoOfGusses nof=new NoOfGusses();
        System.out.println("Guess the number!! ");
        User U1= new User();
        while (R1.Comnum!= U1.UserInput)
        {
            Ck.Check1(R1.Comnum, U1.UserInput);
            nof.SetNum();
            System.out.println("Now Guess the number!! ");
            U1.UserInput=NN.nextInt();
        }
        if(R1.Comnum== U1.UserInput)
        {
            System.out.println("Congratulations!! You Guessed the number!! ");
            System.out.println("No. Of Attempts Of Gusseing Right Number: "+ nof.GetNum());
        }
    }
}
