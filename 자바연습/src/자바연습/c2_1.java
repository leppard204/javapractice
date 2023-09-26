package 자바연습;
import java.util.Scanner;
public class c2_1 {
public static void main(String[]args) {
	Scanner stdin=new Scanner(System.in);
	System.out.print("Numerator :");
	int Numerator=stdin.nextInt();
	System.out.print("Denominator : ");
	int Denominator=stdin.nextInt();
	int result=0;
	try
	{
		result=Numerator/Denominator;
	}
	catch(Exception e)
	{
		System.out.println("You cannot divide by zero. please enter a valid input");
		System.out.print("Numerator : ");
		Numerator=stdin.nextInt();
		System.out.print("Denominator : ");
		Denominator=stdin.nextInt();
		System.out.println("Ceil("+Numerator+"/"+Denominator+") ="+Numerator/Denominator);
	}
}
}
