package 자바연습2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class event2 extends JFrame
{
	event2()
	{
		Container ct=getContentPane();
		ct.setLayout(new GridLayout(4,3,10,10));
		for(int i=1;i<=10;++i)
		{
			ct.add(new JButton("버튼"+i));
		}
		setTitle("연습문제 2");
		setSize(300,150);
		setVisible(true);
	}
}
public class c4_2 {
public static void main(String []args)
{
	new event2();
}
}
