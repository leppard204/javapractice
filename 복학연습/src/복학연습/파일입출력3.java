package 복학연습;  //�貸��
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
	byte []buf=new byte[1024]; //�ѹ��д´���
	int numread=0;//���� ����Ʈ ��
	while(true)
	{
		numread=bis1.read(buf,0,buf.length);
		if(numread==-1)//���ϳ�������
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
		progress+=numread;//���� ũ��10%�ɶ����� ���� ���� ����Ʈ ��
		if(progress>=tenpercent)
		{
			System.out.print("*");
			progress=0;//*����ϰ� progress 0���� �ʱ�ȭ
		}
	}
	bis1.close();
	bis2.close();
}
}
