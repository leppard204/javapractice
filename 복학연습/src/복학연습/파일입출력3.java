package 복학연습;  //배껴씀
import java.io.*;
public class 파일입출력3 {
public static void main(String []args) throws Exception
{
	File f1=new File("a.jpg");
	File f2=new File("b.jpg");
	BufferedInputStream bis1=new BufferedInputStream(new FileInputStream(f1));
	BufferedOutputStream bis2=new BufferedOutputStream(new FileOutputStream(f2));
	
	long tenpercent=f1.length()/10;
	long progress=0;
	
	System.out.println("Copy "+f1.getName()+" as "+f2.getName());
	byte []buf=new byte[1024]; //한번읽는단위
	int numread=0;//읽은 바이트 수
	while(true)
	{
		numread=bis1.read(buf,0,buf.length);
		if(numread==-1)//파일끝에도달
		{
			if(progress>0)
			{
				System.out.print("*");
			}
			break;
		}
		if(numread>0)
		{
			bis2.write(buf,0,numread);
		}
		progress+=numread;//파일 크디10%될때까지 읽은 누적 바이트 수
		if(progress>=tenpercent)
		{
			System.out.print("*");
			progress=0;//*출력하고 progress 0으로 초기화
		}
	}
	bis1.close();
	bis2.close();
}
}
