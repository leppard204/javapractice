package 자바연습;
import java.util.Random;
interface istack
{
	public void push(int item);
	public int pop();
}
class fixedstack implements istack
{
	private int stack[];
	private int tos;
	fixedstack(int size)
	{
		stack=new int[size];
		tos=-1;
	}
	public void push(int item)
	{
		if(tos==stack.length-1)
			System.out.println("스택이 꽉 찼음");
		else
			stack[++tos]=item;
	}
	public int pop()
	{
		if(tos<0)
		{
			System.out.println("스택이 비었음");
			return 0;
		}
		else return stack[tos--];
	}
}
public class second {
public static void main(String []args)
{
	Random r=new Random();
	fixedstack a=new fixedstack(10);
	for(int i=0;i<10;++i)
		a.push(r.nextInt(10));
	System.out.println("스택 : a");
	for(int i=0;i<10;++i)
	{
		System.out.println(a.pop()+" ");
	}
}
}
