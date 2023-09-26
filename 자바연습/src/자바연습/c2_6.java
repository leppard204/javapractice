package 자바연습;
import java.util.*;
public class c2_6 {
public static void main(String []args)
{
	Scanner stdin=new Scanner(System.in);
	char a[]=new char[26];
	int b[]=new int[26];
	String s;
	char x;
	for(char i=65;i<=90;++i)
		a[i-65]=i;
	for(;;)
	{
		try
		{
			s=stdin.next();
			s=s.toUpperCase();
			x=s.charAt(0);
			if(x<65||x>90)
			{
				throw new ArrayIndexOutOfBoundsException();
			}
			for(int i=0;i<26;++i)
			{
				if(a[i]==x)
					b[i]+=1;
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e+" : input includes non-alphbet.");
			break;
		}
	}
	for(int j=0;j<26;++j)
	{
		System.out.println("Charactor "+a[j]+": "+b[j]);
	}
}
}
