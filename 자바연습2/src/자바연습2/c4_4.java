package 자바연습2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Calcurator extends JFrame //3 4 8 9 13 14 18 19 23 24
{
	JButton jb[]=new JButton[25];
	JLabel jl;
	
	Calcurator()
	{
		Container ct=getContentPane();
		JPanel jp1=new JPanel();
		JPanel jp2=new JPanel();
		ct.setLayout(new BorderLayout(0,0));
	    jp1.setLayout(new GridLayout(5,5,4,4));
	    jl=new JLabel("0");
	  
	    jb[0]=new JButton("Backspace");	
	    jb[1]=new JButton("");
	    jb[2]=new JButton("");	
	    jb[3]=new JButton("CE");
	    jb[4]=new JButton("C");	
	    
	    jb[5]=new JButton("7");	
	    jb[6]=new JButton("8");
	    jb[7]=new JButton("9");	
	    jb[8]=new JButton("/");
	    jb[9]=new JButton("sqrt");	
	    
	    jb[10]=new JButton("4");	
	    jb[11]=new JButton("5");
	    jb[12]=new JButton("6");	
	    jb[13]=new JButton("x");
	    jb[14]=new JButton("%");	
	    
	    jb[15]=new JButton("1");	
	    jb[16]=new JButton("2");
	    jb[17]=new JButton("3");	
	    jb[18]=new JButton("-");
	    jb[19]=new JButton("1/x");
	    
	    jb[20]=new JButton("0");	
	    jb[21]=new JButton("+/-");
	    jb[22]=new JButton(".");	
	    jb[23]=new JButton("+");
	    jb[24]=new JButton("=");
	    
	    for(int i=0;i<25;++i)
	    {
	    	
	    	if(i==3||i==4||i==8||i==9||i==13||i==14||i==18||i==19||i==23||i==24)
	    	{
	    		jb[i].setForeground(Color.RED);
	    	}
	    	jb[i].setBackground(new Color(255,255,0));
	    	jp1.add(jb[i]);
	    }
	    jp2.add(jl);
	    ct.add(jp1,BorderLayout.SOUTH);
	    ct.add(jp2,BorderLayout.WEST);
	    setTitle("연습문제 4");
	    setSize(500,210);
	    setVisible(true);
	    setResizable(false);
	}
}

public class c4_4 {
public static void main(String []args)
{
	new Calcurator();
}
}
