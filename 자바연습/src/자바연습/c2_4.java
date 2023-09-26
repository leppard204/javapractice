package 자바연습;
import java.util.*;
public class c2_4 {
public static void main(String []args)
{
	Scanner stdin=new Scanner(System.in);
	String a[]= {"23","12","3.141592"};
	for(int i=0;i<a.length;++i)
	{
		try
		{
			System.out.println(Integer.valueOf(a[i]));
		}
		catch(Exception e)
		{
			System.out.println(a[i]+" cannot be converted to integer.");
		}
	}
}
}