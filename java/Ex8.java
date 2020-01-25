//TAKING NAME AND AGE FOR INPUT VALIDATION USING JAVA//
import java.util.Scanner;
import java.io.*;
public class Ex8 
{
    private static boolean InputMismatchException;

    public static void main(String[] args)
    {
        try{
        String name;
        int age;
        System.out.println("Enter Your Name:");
        Scanner scan =new Scanner(System.in);
         name=scan.nextLine();
         System.out.println("Enter Your age:");
        Scanner scann =new Scanner(System.in);
        age=scann.nextInt();
        System.out.println("You Name is : "+name);
        System.out.println("You age is : "+age);
             
         } 
         catch (java.util.InputMismatchException e) {

            System.out.println("Enter the Correct Input Values AGAIN");
    
         }        
        

    }
}