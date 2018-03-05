import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.event.*;
import java.awt.*;
class My
{
	public static Boolean flag=true;
	public static byte dr=0;
}
class Tic extends JFrame implements ActionListener
{
	String user1,user2;
	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,Restart;
	ImageIcon img,img1;
	Tic()
	{
		img=new ImageIcon("z.jpeg");
		img1=new ImageIcon("k.jpeg");
		btn1=new JButton();btn2=new JButton();btn3=new JButton();
		btn4=new JButton();btn5=new JButton();btn6=new JButton();
		btn7=new JButton();btn8=new JButton();btn9=new JButton();
		Restart=new JButton("Restart!!!");Restart.setBackground(new Color(238,130,238));Restart.setForeground(Color.WHITE);
		Restart.setBounds(70,215,100,30);Restart.addActionListener(this);
		btn1.setBounds(0,0,80,70);btn2.setBounds(80,0,80,70);btn3.setBounds(160,0,80,70);
		btn4.setBounds(0,70,80,70);btn5.setBounds(80,70,80,70);btn6.setBounds(160,70,80,70);
		btn7.setBounds(0,140,80,70);btn8.setBounds(80,140,80,70);btn9.setBounds(160,140,80,70);
		btn1.addActionListener(this);btn2.addActionListener(this);btn3.addActionListener(this);
		btn4.addActionListener(this);btn5.addActionListener(this);btn6.addActionListener(this);
		btn7.addActionListener(this);btn8.addActionListener(this);btn9.addActionListener(this);
		add(btn1);add(btn2);add(btn3);add(Restart);
		add(btn4);add(btn5);add(btn6);
		add(btn7);add(btn8);add(btn9);
		setLayout(null);
		setVisible(true);
		setSize(246,280);//264,280
		setLocation(400,200);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		user1=JOptionPane.showInputDialog(this,"Enter Name of 1st Player who want to Choose 0","",JOptionPane.QUESTION_MESSAGE);
		user2=JOptionPane.showInputDialog(this,"Enter Name of 2nd Player Sorry don't have any choice","",JOptionPane.QUESTION_MESSAGE);
	}
	public void actionPerformed(ActionEvent e)
	{
		JButton temp=(JButton)e.getSource();
		//int res=0;
		if(temp==Restart)
		{
			btn1.setIcon(null);btn2.setIcon(null);btn3.setIcon(null);btn4.setIcon(null);btn5.setIcon(null);btn6.setIcon(null);
			btn7.setIcon(null);btn8.setIcon(null);btn9.setIcon(null);
			My.flag=true;My.dr=0;
		}
		if((temp.getIcon()==null)&&(temp==btn1||temp==btn2||temp==btn3||temp==btn4||temp==btn5||temp==btn6||temp==btn7||temp==btn8||temp==btn9)){
		
		if(My.flag==true)
		{
			temp.setIcon(img);
			My.flag=false;
			
		}
		else
		{
			temp.setIcon(img1);
			My.flag=true;
			
		}
		if(((btn1.getIcon()==img &&btn2.getIcon()==img &&btn3.getIcon()==img)||(btn4.getIcon()==img &&btn5.getIcon()==img &&btn6.getIcon()==img)||(btn7.getIcon()==img &&btn8.getIcon()==img &&btn9.getIcon()==img)||(btn1.getIcon()==img &&btn5.getIcon()==img &&btn9.getIcon()==img)||(btn3.getIcon()==img &&btn5.getIcon()==img &&btn7.getIcon()==img)||(btn1.getIcon()==img &&btn4.getIcon()==img &&btn7.getIcon()==img)||(btn2.getIcon()==img &&btn5.getIcon()==img &&btn8.getIcon()==img)||(btn3.getIcon()==img &&btn6.getIcon()==img &&btn9.getIcon()==img))||((btn1.getIcon()==img1 &&btn2.getIcon()==img1 &&btn3.getIcon()==img1)||(btn4.getIcon()==img1 &&btn5.getIcon()==img1 &&btn6.getIcon()==img1)||(btn7.getIcon()==img1 &&btn8.getIcon()==img1 &&btn9.getIcon()==img1)||(btn1.getIcon()==img1 &&btn5.getIcon()==img1 &&btn9.getIcon()==img1)||(btn3.getIcon()==img1 &&btn5.getIcon()==img1 &&btn7.getIcon()==img1)||(btn1.getIcon()==img1 &&btn4.getIcon()==img1 &&btn7.getIcon()==img1)||(btn2.getIcon()==img1 &&btn5.getIcon()==img1 &&btn8.getIcon()==img1)||(btn3.getIcon()==img1 &&btn6.getIcon()==img1 &&btn9.getIcon()==img1)))// btn1 btn2 btn3
		{
			if((btn1.getIcon()==img &&btn2.getIcon()==img &&btn3.getIcon()==img)||(btn4.getIcon()==img &&btn5.getIcon()==img &&btn6.getIcon()==img)||(btn7.getIcon()==img &&btn8.getIcon()==img &&btn9.getIcon()==img)||(btn1.getIcon()==img &&btn5.getIcon()==img &&btn9.getIcon()==img)||(btn3.getIcon()==img &&btn5.getIcon()==img &&btn7.getIcon()==img)||(btn1.getIcon()==img &&btn4.getIcon()==img &&btn7.getIcon()==img)||(btn2.getIcon()==img &&btn5.getIcon()==img &&btn8.getIcon()==img)||(btn3.getIcon()==img &&btn6.getIcon()==img &&btn9.getIcon()==img))
			{
			JOptionPane.showMessageDialog(this,user1+" You have won this Game..");
			}
			if((btn1.getIcon()==img1 &&btn2.getIcon()==img1 &&btn3.getIcon()==img1)||(btn4.getIcon()==img1 &&btn5.getIcon()==img1 &&btn6.getIcon()==img1)||(btn7.getIcon()==img1 &&btn8.getIcon()==img1 &&btn9.getIcon()==img1)||(btn1.getIcon()==img1 &&btn5.getIcon()==img1 &&btn9.getIcon()==img1)||(btn3.getIcon()==img1 &&btn5.getIcon()==img1 &&btn7.getIcon()==img1)||(btn1.getIcon()==img1 &&btn4.getIcon()==img1 &&btn7.getIcon()==img1)||(btn2.getIcon()==img1 &&btn5.getIcon()==img1 &&btn8.getIcon()==img1)||(btn3.getIcon()==img1 &&btn6.getIcon()==img1 &&btn9.getIcon()==img1))
			{
			JOptionPane.showMessageDialog(this,user2+" You have won this Game..");
			}
		}
		else
		{ My.dr++;
			if(My.dr==9){
			JOptionPane.showMessageDialog(this,"Match Draw");
			}
		}

		
	}		
}
	public static void main(String args[])
	{
		new Tic().setTitle("Tic_Tac..Love");
	}
}