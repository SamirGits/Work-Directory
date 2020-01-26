import java.util.Scanner;
import java.io.*;
public class Assignmennt1 
	{
	    private static boolean InputMismatchException;

	    public static void main(String[] args)
	    {
	        try{
	        String name;
	        int age;
	        System.out.println(" Enter Name here :");
	        Scanner scan =new Scanner(System.in);
	         name=scan.nextLine();
	         System.out.println("Year of Graduated: ");
	        Scanner scann =new Scanner(System.in);
	        age=scann.nextInt();
	        System.out.print("My Name is "+name+ " and i'm graduated in "+age);
	             
	         } 
	         catch (java.util.InputMismatchException e) {

	            System.out.println("Enter the Correct Input Values AGAIN");
	    
	         }        
	        

	    }
	}
