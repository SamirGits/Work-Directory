import java.util.*;
public class Assignment3 {

	public static void main(String[] args)
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you want to play quiz Y/N");
		//char c=sc.nextInt();
		char c=sc.next().charAt(0);
		if(c=='y')
		{
			System.out.println("Let's Start");
			System.out.println("What is the Captial of India");
			System.out.println("1 Delhi");
			System.out.println("2 Mumbai");
			System.out.println("3 Chennai");
			byte choice=sc.nextByte();
			switch(choice)
			{
			case 1:System.out.println("You Are Right!!");
				   count++;
				   break;
			default :System.out.println("'OOPS Wrong !!!' the Capital of india is Delhi");
			}
			System.out.println("Can you store the value \"dog\" in a variable of type int?");
			System.out.println("1 Yes");
			System.out.println("2 No");
			byte choice1=sc.nextByte();
			switch(choice1)
			{
			case 2:System.out.println("thats Right..!!");
				   count++;
				   break;
			default :System.out.println("Sorry, \"dog\" is a string. int can only store numbers");
			}
			System.out.println("Which City is known as Pink City? ");
			System.out.println("1 Agra");
			System.out.println("2 Delhi");
			System.out.println("2 Jaipur");
			byte choice3=sc.nextByte();
			switch(choice3)
			{
			case 3:System.out.println("thats Right..!!");
				   count++;
				   break;
			default :System.out.println("'OOPS Wrong!!!' the result is Jaipur");
			}
		 System.out.println("your score is "+count+" out of 3");
		}
		else
			System.out.println("ok Bye ^_^");
		 //System.exit(0);	
	}

	
}