package 자바연습;
import java.util.Scanner;
import java.io.*;
public class first{
public static void main(String []args) throws Exception
{
	String s="iotest1.text";
	FileOutputStream fos=new FileOutputStream(s);
	fos.write(3);
	fos.close();
}
}