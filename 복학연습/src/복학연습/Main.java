package 복학연습;
import java.util.*;
public class Main {
public static void main(String args[])
{
	Scanner stdin=new Scanner(System.in);
	char a[]=new char[26];
	int b[]=new int[26];
	String s;
	char n;
	for(char i=65;i<=90;++i)
	{
		a[i-65]=i;		
	}
	for(;;)
	{
		try
		{
			s=stdin.next();
			n=s.charAt(0);
			if(n<65||n>90)
			{
				throw new ArrayIndexOutOfBoundsException();
			}
			for(int x=0;x<26;x++)
			{
				if(a[x]==n)
				{
					b[x]+=1;
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e+" : input includes non-alphabet.");
			break;
		}
	}
	for(int x=0;x<26;x++)
	{
		System.out.println("charactor "+a[x]+": "+b[x]);
	}
}
}