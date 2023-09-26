package 자바연습;
import java.util.Scanner;
public class c2_3 {
public static void main(String args[])
{
	Scanner stdin=new Scanner(System.in);
	int []a= {0,0,0};
	int cnt=0;
	int i;
	System.out.println("please enter three integer valuse");
	try
	{
		for(i=0;i<3;++i)
		{
			System.out.print(i+">>");
			a[i]=stdin.nextInt();
			cnt+=a[i];
		}
	}
	catch(Exception e)
	{
		System.out.println("Not a integer. please try again");
		for(int j=0;j<3;++j)
		{
			System.out.print(j+">>");
			a[j]=stdin.nextInt();
			cnt+=a[j];
		}
	}
	finally
	{
		System.out.println("Result: "+cnt);
	}
}
}
