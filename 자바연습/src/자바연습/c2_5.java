package 자바연습;
import java.util.*;
public class c2_5 {
public static void main(String []args)
{
	Scanner stdin=new Scanner(System.in);
	Random r=new Random();
	int n=r.nextInt(99);
	int a;
	String s;
	System.out.println("Random number is generated. Guess the number: ");
	System.out.println("0-99");
	for(int i=1;;++i)
	{
		try
		{
			System.out.print(i+">>");
			a=stdin.nextInt();
			if(a>n)
			{
				System.out.println("Enter a smaller number");
			}
			else if(a<n)
			{
				System.out.println("Enter a larger number");
			}
			else if(a==n)
			{
				System.out.println("Correct");
				System.out.print("try again? (y/n)>>");
				s=stdin.next();
				char c=s.charAt(0);
				if(c=='y')
				{
					n=r.nextInt(99);
					i=0;
					continue;
				}
				else if(c=='n')
				{
					break;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Only integer is allowed.");
			stdin.next();
			--i;
		}
	}
}
}
