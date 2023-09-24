package 복학연습;
import java.io.*;
public class 파일입출력2 {
public static void main(String []args) throws Exception
{
	int []arr1= {1,2,3,4,5};
	String []arr2= {"Kim","Park","Jung","Lee"};
	ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("arr.txt"));
	oos.writeObject(arr1);
	oos.writeObject(arr2);
	oos.close();
	
	ObjectInputStream ois=new ObjectInputStream(new FileInputStream("arr.txt"));
	int []arr3=(int [])ois.readObject();
	String []arr4=(String [])ois.readObject();
    for(int i=0;i<arr3.length;++i)
    {
    	System.out.print(arr3[i]+" ");
    }
    System.out.println();
    for(int i=0;i<arr4.length;++i)
    {
    	System.out.print(arr4[i]+" ");
    }
	ois.close();
}
}
