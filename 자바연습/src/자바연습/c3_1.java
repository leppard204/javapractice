package 자바연습;
import java.io.*;
class arr implements Serializable
{
	public int []a= {1,2,3,4,5};
	public String []b= {"kim","park","jung","lee"};
}
public class c3_1 {
public static void main(String []args) throws Exception
{
	arr myarr=new arr();
	ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("temp.text"));
	oos.writeObject(myarr);
	oos.close();
	
	ObjectInputStream ois=new ObjectInputStream(new FileInputStream("temp.text"));
	arr myarr2=(arr)ois.readObject();
	for(int x:myarr2.a)
		System.out.print(x+" ");
	System.out.println();
	for(String y:myarr2.b)
		System.out.print(y+" ");
}
}
