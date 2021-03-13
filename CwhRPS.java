package com.company;
import java.util.Random;
import java.util.Scanner;

public class CwhRPS {
    public static void main(String[] args) {
        Random RN = new Random();
        int ComScore=0;
        int UserScore=0;
        int number;
        Scanner Sc = new Scanner(System.in);
        System.out.println("HOW MANY TIMES YOU WANT TO PLAY ??");
        number=Sc.nextInt();
        for(int i=0;i<number;i++)
        {

            System.out.println("Enter Your multiple Choice:\t\t");
            System.out.print("0 = Rock\t");
            System.out.print("1 = Paper\t");
            System.out.println("2 = Scissors");

            int UserChoice = Sc.nextInt();
            int Random = RN.nextInt(3);

            if(Random==UserChoice)
            {
                ComScore=ComScore+1;
                UserScore=UserScore+1;
                switch(Random)
                {
                    case 0:
                        System.out.println("You And Computer Choosed ROCK");
                        break;
                    case 1:
                        System.out.println("You And Computer Choosed PAPER");
                        break;
                    case 2:
                        System.out.println("You And Computer Choosed SCISSORS");
                        break;
                }

            }
            else switch(UserChoice)
            {
                case 0:
                    System.out.println("You Selected Rock");
                    if (Random == 1) {
                        System.out.println("Computer Win ,Computer Choosed PAPER");
                        ComScore=ComScore+1;
                    }

                    if (Random == 2) {
                        System.out.println("You Win , Computer Choosed SCISSORS");
                        UserScore=UserScore+1;
                    }
                    break;

                case 1:
                    System.out.println("You Selected Paper");
                    if (Random == 0) {
                        System.out.println("You Win ,Computer Choosed ROCK");
                        UserScore=UserScore+1;
                    }

                    if (Random == 2) {
                        System.out.println("Computer Win ,Computer Choosed SCISSORS");
                        ComScore=ComScore+1;
                    }
                    break;

                case 2:
                    System.out.println("You Selected Scissors");
                    if (Random == 0) {
                        System.out.println("Computer Win ,Computer Choosed ROCK");
                        ComScore=ComScore+1;
                    }

                    if (Random == 1) {
                        System.out.println("You Win ,Computer kasnfjnfiu Choosed PAPER");
                        UserScore=UserScore+1;
                    }
                    break;

                default:
                    System.out.println("ENTER A VALID RESPONSE");
            }

            System.out.println("COMPUTER SCORE = "+ ComScore + "\t\t\tYOUR SCORE= "+ UserScore);
            System.out.println("\n");
        }

        if(ComScore>UserScore)
        {
            System.out.println("COMPUTER WINS THE GAME !!!");

        }
        else if(ComScore==UserScore)
        {
            System.out.println("THE Gsdfb hdgsvAME IS DRAW !!!");
        }

        else
        {
            System.out.println("YOU WgbjsdyufON THE GAME");
        }


    }
}