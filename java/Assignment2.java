import java.util.Scanner;
import java.io.*;
public class Assignment2 {
	public static void name()
	{	        
	         System.out.println(" Enter Name here :");
 	         Scanner scan =new Scanner(System.in);
 	         String str=scan.nextLine();
 	         char[] ch=str.toCharArray();
 			 for(int i=0;i<ch.length;i++)
 			 {
 				 if((ch[i]>=65&&ch[i]<=90)||(ch[i]>=97&&ch[i]<=122))
 				 {
 					 	if(i==str.length()-1)
 					    System.out.println("Hello my name is "+str);
 				 }
 				else
 				 {
 					System.out.println("Name should contain only alphabets");
 					name();
 					break;
 				 }
 			 }
	}
 				public static void age()
 				{
 				 System.out.print("Enter Age here:");
 				 Scanner sc=new Scanner(System.in);
 				 String age=sc.nextLine();
 				 try {	
							Integer.parseInt(age);	    	 		
	        	 			System.out.print("My Age is:"+age);
	        	 	 }
 				 	 catch (NumberFormatException e) { 
 				 		 	System.out.println("Age should have Int type only");
 				 	 }
 				 }
 				public static void main(String []args) {
 				name();
 				age();
 			}
	}

