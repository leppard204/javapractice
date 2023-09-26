package 자바연습;
import java.io.*;
import java.util.*;
public class c3_2_1 {
public static void main(String []args) throws Exception
{
	Scanner stdin=new Scanner(System.in);
	System.out.print("Source file : ");
	String s1=stdin.next();
	FileInputStream fis1=new FileInputStream(s1);
	System.out.print("Target file : ");
	String s2=stdin.next();
	FileOutputStream fos2=new FileOutputStream(s2);
	FileInputStream fis2=new FileInputStream(s2);
	fis2=fis1;
	System.out.println(fis2.read());
	System.out.println("Copy has been completed.");
	fis1.close();
	fos2.close();
	fis2.close();
}
}
