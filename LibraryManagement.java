package com.company;
import java.awt.print.Book;
import java.util.Scanner;


    class Books{
        String[] books;
        int Nob,Noi;
        public Books(){

            this.Nob=0;
            this.Noi=0;
            books=new String[50];

        }
        public void AddBooks(){
            System.out.println("Enter The Book Name");
            Scanner sc = new Scanner(System.in);
            String a = sc.nextLine();
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
        public void IssueBook(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter The Book Name You want to issue");
            String a=sc.nextLine();
            for(int i=0;i< this.books.length;i++)
            {
                if(this.books[i].equals(a))
                {
                    this.books[i]=null;
                     Noi++;
                    System.out.println(a+" Book Issued!");
                    return;
                }else System.out.println("Book Not found");
                break;
            }
            Nob--;
        }
        public void ReturnBook(){
            Books b= new Books();
            b.AddBooks();
            Noi--;
        }
        public void GetStatus(){
            System.out.println("The Number Of Available Book is := "+Nob);
            System.out.println("The Number Of Issued Book is := "+Noi);
        }
    }

    public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String book = sc.nextLine();
        Books B=new Books();
        int exit=0;
        while (exit!=1){
        System.out.printf("\n\n1.Add book\n2.Show Available Books\n3.Issue Book\n4.Return Book\n5.Get Numbers\n6.Exit\n");
        int n= sc.nextInt();
        switch (n){
            case 1:B.AddBooks();
                   break;
            case 2:B.ShowAvailableBooks();
                   break;
            case 3:B.IssueBook();
                break;
            case 4:B.ReturnBook();
                break;
            case 5:B.GetStatus();
                break;
            case 6:exit=1;
                break;
            default:
                System.out.println("Enter A Valid Response!!");
         }
        }

        }
    }

