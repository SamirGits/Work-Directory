//TAKING BASIC INPUT FROM THE USER
import java.util.Scanner;
public class Ex1{
    public static void main(String[] args) {
       
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = reader.nextInt();
        System.out.println("You entered: " + number);
    }
}