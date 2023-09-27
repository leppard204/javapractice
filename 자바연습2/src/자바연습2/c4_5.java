package 자바연습2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class paneltest extends JFrame
{
	JPanel jp1,jp2,jp3,jp4;
	JButton jb1,jb2;
	JCheckBox red,green,blue;
	JRadioButton jr1,jr2,jr3;
	JTextArea ta;
	JComboBox jcb;
	paneltest()
	{
		Container ct=getContentPane();
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		jp4=new JPanel();
		ct.setLayout(new BorderLayout(100,10));
		jp1.setLayout(new GridLayout(3,1,4,4));
		jp2.setLayout(new GridLayout(3,1,4,4));
		jp3.setLayout(new FlowLayout());
		jp4.setLayout(new FlowLayout());
     	jb1=new JButton("선택");
		jb2=new JButton("취소");
		red=new JCheckBox("Red",true);
		green=new JCheckBox("Green",true);
		blue=new JCheckBox("Blue",true);
		jr1=new JRadioButton("A형");
		jr2=new JRadioButton("B형");
		jr3=new JRadioButton("C형");
		ta=new JTextArea("자료입력공간",5,30);
		jcb=new JComboBox();
		jcb.addItem("1구간 지역");
		jcb.addItem("2구간 지역");
		jp1.add(red);
		jp1.add(green);
		jp1.add(blue);
		jp2.add(jr1);
		jp2.add(jr2);
		jp2.add(jr3);
		jp3.add(jb1);
		jp3.add(jb2);
		jp4.add(ta);
		jp4.add(jcb);
		
		ct.add(jp1,BorderLayout.WEST);
		ct.add(jp2,BorderLayout.CENTER);
		ct.add(jp3,BorderLayout.EAST);
		ct.add(jp4,BorderLayout.SOUTH);
		
		setSize(500,400);
		setVisible(true);
	}
}
public class c4_5 {
public static void main(String []args)
{
	new paneltest();
}
}