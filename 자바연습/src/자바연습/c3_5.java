package 자바연습;
import java.io.*;
import java.util.*;
public class c3_5 {
	public static void main(String []args) throws Exception
	{
		Scanner stdin=new Scanner(System.in);
		FileReader fis=new FileReader("words.txt");
		int i;
		String []vector=new String[1000000];
		String s;
		int x=0;
		String o=new String();
		System.out.println("words.txt has been found");
		while((i=fis.read())!=-1)
		{
			char a=(char)i;
			o=String.valueOf(a);
			System.out.println(o);
		}

		System.out.println(o.trim());
		for(int z=0;z<vector.length;z++)
		{
			vector[z]=o;
			//System.out.print(vector[x]);
		}
		for(int q=1;q<2;)
		{
			//System.out.println(vector[3]);
			System.out.print("words : ");
			s=stdin.next();
			if(s.equals("Exit"))
			{
				System.out.println("Bye!");
				break;
			}
			else
			{
				for(int j=0;j<vector.length;++j)
				{
					if(vector[j].startsWith(s))
					{
						System.out.println(vector[j]);
					}
				}
			}
		}
		fis.close();
	}
}
