package 자바연습2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class event1 extends JFrame
{
	JButton jb1,jb2,jb3;
	event1()
	{
		Container ct=getContentPane();
		ct.setLayout(new BorderLayout(0,10));
		jb1=new JButton("버튼 1");
		jb2=new JButton("버튼 2");
		jb3=new JButton("버튼 3");
		ct.add(jb1,BorderLayout.NORTH);
		ct.add(jb2,BorderLayout.CENTER);
		ct.add(jb3,BorderLayout.SOUTH);
		setTitle("연습문제 1");
		setSize(300,140);
		setVisible(true);
	}
}
public class c4_1 {
public static void main(String []args)
{
	new event1();
}
}
