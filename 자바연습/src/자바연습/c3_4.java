package 자바연습;
import java.io.*;
import java.util.*;
class fileexplorer
{
	Scanner stdin=new Scanner(System.in);
	private File f=new File("C:/");
	private File []sf=null;
	
	public fileexplorer()
	{
		System.out.println("*****파일 탐색기입니다.*****");
		getf();
	}
	
	private void getf()
	{
		System.out.println("\t ["+f.getPath()+"] \t");
		sf=f.listFiles();
		for(File x:sf)
		{
			System.out.print(x.isFile()?"file \t":"dir \t");
			System.out.print(x.length()+"바이트 \t");
			System.out.print(x.getName());
			System.out.println();
		}
	}
	
	public void a()
	{
		for(;;)
		{
			System.out.print(">>");
			String s=stdin.next();
			if(s.equals("..."))
			{
				if(f.getParent()==null)
				{
					System.out.println("부모 dir이 없음. 최상위 dir");
					continue;
				}
				else
				{
					f=new File(f.getParent());
					getf();
				}
			}
			else if(s.equals("Exit"))
			{
				System.out.println("종료");
				break;
			}
			else
			{
			    f=new File("C:/"+s);
			    getf();
			}
		}
	}
}
public class c3_4 {
public static void main(String []args)
{
	fileexplorer fe=new fileexplorer();
	fe.a();
	/*Scanner stdin=new Scanner(System.in);
	File f=new File("C:/");
	File sf[]=null;
	System.out.println("*****파일 탐색기입니다.*****");
	System.out.println("\t [c]:\\");
	String inp;
	sf=f.listFiles();
	for(int i=0;i<sf.length;++i)
	{
	    System.out.print(f.isDirectory()? "dir \t":"file \t");
	    System.out.print(sf[i].length()+"바이트 \t");
		System.out.print(sf[i].getName());
		System.out.println();
	}
	for(;;)
	{
	System.out.print(">>");
	inp=stdin.next();
	if(inp.equals("..."))
	{
		for(int i=0;i<sf.length;++i)
		{
		    if(f.isDirectory())
		    {
		    	System.out.print("dir \t");
		    }
		    else
		    {
		    	System.out.println("file \t");
		    }
		    System.out.print(sf[i].length()+"바이트 \t");
			System.out.print(sf[i].getName());
			System.out.println();
		}
	}
	else if(inp.equals("exit"))
		break;
	else
	{
		File f2=new File("C:/"+inp);
		File sf2[]=f2.listFiles();
		for(int i=0;i<sf2.length;++i)
		{
		    if(f2.isDirectory())
		    {
		    	System.out.print("dir \t");
		    }
		    else
		    {
		    	System.out.println("file \t");
		    }
		    System.out.print(sf2[i].length()+"바이트 \t");
			System.out.print(sf2[i].getName());
			System.out.println();
		}
	}
	}*/
}
}
