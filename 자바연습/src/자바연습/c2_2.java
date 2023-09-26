package 자바연습;
import java.util.Scanner;
public class c2_2 {
public static void main(String args[])
{
	int a[]=new int[3];
	Scanner stdin=new Scanner(System.in);
	try
	{
		for(int i=0;i<a.length+1;++i)
		{
			System.out.print("intArray["+i+"]=");
			a[i]=stdin.nextInt();
		}
	}
	catch(Exception e)
	{
		System.out.println("Array index is out of bounds");
	}
}
}
