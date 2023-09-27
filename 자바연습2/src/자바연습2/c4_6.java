package 자바연습2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

class rjl extends JFrame
{
	Random r=new Random();
	JLabel jl;
	
	rjl()
	{
		setTitle("연습문제 6");
		Container ct=getContentPane();
		ct.setLayout(null);
		for(int i=0;i<20;++i)
		{
			int x=r.nextInt(250);
			int y=r.nextInt(250);
			System.out.println(x+" "+y);
			jl=new JLabel(Integer.toString(i));
			jl.setOpaque(true);
			jl.setBackground(Color.BLUE);
			jl.setLocation(x, y);
			jl.setSize(10,10);
			ct.add(jl);
		}
		
		setVisible(true);
		setSize(300,300);
	}
}
public class c4_6 {
public static void main(String []args)
{
	new rjl();
}
}
