package 복학연습;
import java.util.*;
public class 연습 {
public static void main(String args[]) {
	Scanner stdin=new Scanner(System.in);
	Random r=new Random();
	int n=r.nextInt(99);
	int a;
    for(int i=1;;i++)
	{
		try
		{
			System.out.print(i+">>");
			a=stdin.nextInt();
			if(a<n)
			{
				System.out.println("enter a larger number");
			}
			else if(a>n)
				System.out.println("enter a smaller number");
			else if(a==n)
			{
                i=0;
				n=r.nextInt(99);
				System.out.println("correct.");
				System.out.print("try again? (y/n)>>");
				String b=stdin.next();
				if(b=="y")
				{
					continue;
				}
				else
					break;
			}
		}
		catch(Exception e)
		{
			stdin.next();
			System.out.println("only integer is allowed.");
			--i;
		}
	}
}
}
