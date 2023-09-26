package 자바연습2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class event3 extends JFrame 
{
    JLabel jl1;
    JButton jb1,jb2,jb3,jb4;
    public event3()
    {
    	Container ct=getContentPane();
    	ct.setLayout(new FlowLayout());
    	jb1=new JButton("1학년");
    	jb2=new JButton("2학년");
    	jb3=new JButton("3학년");
    	jb4=new JButton("4학년");
    	jl1=new JLabel("");
    	jb1.addActionListener(new eventprocess(jl1));
    	jb2.addActionListener(new eventprocess(jl1));
    	jb3.addActionListener(new eventprocess(jl1));
    	jb4.addActionListener(new eventprocess(jl1));
    	ct.add(jb1);
    	ct.add(jb2);
    	ct.add(jb3);
    	ct.add(jb4);
    	ct.add(jl1);
    	setTitle("Evnnt Test1");
    	setSize(300,150);
    	setVisible(true);
    }
	 
}
class eventprocess implements ActionListener
{
	JLabel jl1;
	eventprocess(JLabel jl1)
	{
		this.jl1=jl1;
	}
	public void actionPerformed(ActionEvent e)
	{
		jl1.setText(e.getActionCommand());
	}

}
public class c4_3 {
public static void main(String []args)
{
	new event3();
}
}
