package 복학연습;
import java.io.*;
import java.util.*;

class fe
{
	Scanner stdin=new Scanner(System.in);
	private File f=new File("C:/");
	private File []sf=null;
	String s;
	
	fe()
	{
		System.out.println("***** 파일 탐색기입니다. *****");
		showf();
	}
	
	private void showf()
	{
		System.out.println("\t "+f.getPath()+" \t");
		sf=f.listFiles();
		for(int i=0;i<sf.length;++i)
		{
			System.out.print(sf[i].isDirectory()?"dir \t":"file \t");
			System.out.print(sf[i].length()+"바이트 \t");
			System.out.print(sf[i].getName());
			System.out.println();
		}
	}
	
	public void mainf()
	{
		while(true)
		{
			System.out.print(">>");
			s=stdin.nextLine();
			if(s.equals("Exit"))
			{
				System.out.println("종료");
				break;
			}
			else if(s.equals("..."))
			{
				if(f.getParent()==null)
				{
					System.out.println("parent dir이 없습니다.");
					continue;
				}
				else
				{
					f=new File(f.getParent());
					showf();
				}
			}
			else
			{
				f=new File(f,s);
				showf();
			}
		}
	}
}
public class 파일입출력 {
public static void main(String []args) throws Exception
{
	fe a=new fe();
	a.mainf();
}
}
