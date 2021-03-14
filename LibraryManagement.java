package com.company;
import java.util.Scanner;


    class Books{
        String[] books;
        int Nob;
        public Books(){

            this.Nob=0;
            books=new String[5];

        }
        public void AddBooks(String a){
            this.books[Nob] = a;
            System.out.println("Book Added-"+ a);
             Nob++;
        }
        public void ShowAvailableBooks(){
            System.out.println("Available Books:");
            for(int i=0;i<books.length;i++)
            {
                if (books[i]==null) {
                    continue;
                }
                System.out.println(books[i]);
            }


        }
    }

    public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String book = sc.nextLine();
        Books B=new Books();
        int exit=0;
        System.out.printf("1.Addbook\n2.Show Available Books\n3.IssueBook\n4.ReturnBook\n5.Exit\n");




        }
    }

