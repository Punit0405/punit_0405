package com.company;

public class Fibbonacci {
        static int fibo(int a)
        {  if(a==1 || a==2)
            {
                return a-1;
            }
            else
             {
               return fibo(a-1)+fibo(a-2);
             }



        }
    public static void main(String[] args) {
//        fibbonacci series= 0,1,1,2,3,5,8....

        int n=10;

        int [] arr=new int[n];
       int c = fibo(n);

       for(int i=1;i<=n;i++)
       {
           arr[i-1]=fibo(i);
       }
        System.out.println(c);

        System.out.println("The Fibbonacci Series is :");


         for(int j=0;j<=n-1;j++)
         {
             System.out.print(arr[j]+",");
         }



    }
}
