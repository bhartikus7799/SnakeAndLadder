import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo extends JFrame
{
	JPDemo jp1;
	FDemo()
	{
		super.setTitle("Snake & ladder");
		jp1=new JPDemo();
		add(jp1);
	}
}
class JPDemo extends JPanel implements ActionListener
{
	ImageIcon img1,img2,img3, img4;
	ImageIcon img5, img6,img7;
	ImageIcon img8, img9;
	ImageIcon img10,img11,img13;
	Image swt,board,s1,start;
	Image player1,player2;
	Image player11,player12;
	Image dice,dice1;
	Image winner;
	
	int px1=40;
	int py1=620;
	
	int px2=120;
	int py2=620;
	int nu=0,nu1=0;
	int c=0;
	String input1,input2;
	boolean d=false,s=false;
	
	JButton b1, b2,b3,b4;
	JTextField tx1,tx2,tx3;
	JPDemo()
	{
		setBackground(Color.black);
		
		img1=new ImageIcon("swt.jpg");
		swt=img1.getImage();
		img2=new ImageIcon("board.jpg");
		board=img2.getImage();
		img3=new ImageIcon("s1.png");
		s1=img3.getImage();
		img4=new ImageIcon("start.png");
		start=img4.getImage();
		
		img5=new ImageIcon("about.gif");
		img6=new ImageIcon("reset.png");
		img7=new ImageIcon("start.gif");
		
		img8=new ImageIcon("player1.png");
		player1=img8.getImage();
		img9=new ImageIcon("player2.png");
		player2=img9.getImage();
		
		player11=img8.getImage();
		player12=img9.getImage();
		
		img13=new ImageIcon("winner.gif");
	    winner=img13.getImage();
		img10=new ImageIcon("dice(1).gif");
		dice=img10.getImage();
		img11=new ImageIcon("dice.png");
		dice1=img11.getImage();
		
		setLayout(null);
		b1=new JButton(img5);
		b1.setBounds(50,120,100,30);
		add(b1);
		b1.setBackground(new Color(4,129,255));
		
		b2=new JButton(img6);
		b2.setBounds(50,180,100,30);
		add(b2);
		b1.setBackground(new Color(4,129,255));
		
		Font f=new Font("Bauhaus 93",Font.ITALIC,20);
		
		tx1=new JTextField("Start Game");
		tx1.setBounds(50,230,150,35);
		add(tx1);
		tx1.setBackground(Color.black);
		tx1.setForeground(Color.green);
		tx1.setFont(f);
		
		tx2=new JTextField("Player 1 Name");
		tx2.setBounds(50,290,150,35);
		add(tx2);
		tx2.setBackground(Color.black);
		tx2.setForeground(Color.green);
		tx2.setFont(f);

        tx3=new JTextField("Player 2 Name");
		tx3.setBounds(50,375,150,35);
		add(tx3);
		tx3.setBackground(Color.black);
		tx3.setForeground(Color.green);
		tx3.setFont(f);
		
		b3=new JButton("Roll");
		b3.setBounds(50,500,100,30);
		add(b3);
		b3.setFont(f);
		b3.setForeground(Color.red);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		b4=new JButton(img7);
		b4.setBounds(25,560,150,60);
		add(b4);
		b4.setFont(f);
		b4.setForeground(Color.red);
		b4.addActionListener(this);
		}

public void paintComponent(Graphics g)
{
	super.paintComponent(g);
	g.setColor(new Color(4,129,255));
	g.fillRect(0,0,200,735);
	
	g.drawImage(swt,0,0,this);
	g.drawImage(board,200,0,this);
	g.drawImage(s1,920,0,this);
	g.drawImage(start,20,550,this);
	
	g.drawImage(player1,px1,py1,this);
	g.drawImage(player2,px2,py2,this);
	g.drawImage(player11,10,360,this);
	g.drawImage(player12,10,280,this);
	
	g.drawImage(dice,10,420,this);
	g.drawImage(dice1,110,420,this);
	if(d)
	{
		g.drawImage(winner,230,70,this);
	}
}	
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==b2)
	{
		px1=40;
		py1=620;
		px2=120;
		py2=620;
        repaint();
	}
	if(e.getSource()==b4)
	{
		d=false;
		String input1String=JOptionPane.showInputDialog(null,"Enter first player name","Name of players",
JOptionPane.QUESTION_MESSAGE);

input1=input1String;                                                                      

String input2String=JOptionPane.showInputDialog(null,"Enter second player name","Name of players",
JOptionPane.QUESTION_MESSAGE);

input2=input2String;
tx2.setText(input1);
tx3.setText(input2);
		
		s=true;
		nu=0;
		nu1=0;
		
	}
	if(s)
	{	
	if(c%2==0)
	{
 if(e.getSource()==b3)
 { 
		
		int random=(int)Math.round(Math.random()*5+1);
		if(nu==95&&random==6)
		{
			nu=89;
		}
		if(nu==96&&random>4)
		{
			if(random==5)
			{
				nu=91;
			}
			if(random==6)
			{
				nu=90;
			}
		}
		if(nu==97&&random>3)
		{
			if(random==4)
			{
				nu=93;
			}
			if(random==5)
			{
				nu=92;
			}
			if(random==6)
			{
				nu=91;
			}
		}
		if(nu==98&&random>2)
		{
			if(random==3)
			{
				nu=95;
			}
			if(random==4)
			{
				nu=94;
			}
			if(random==5)
			{
				nu=93;
			}
			if(random==6)
			{
				nu=92;
			}
		}
		if(nu==99&&random>1)
		{
			if(random==2)
			{
				nu=97;
			}
			if(random==3)
			{
				nu=96;
			}
			if(random==4)
			{
				nu=95;
			}
			if(random==5)
			{
				nu=96;
			}
			if(random==6)
			{
				nu=97;
			}
		}
		
		px1=225;
		py1=645;
		 int k=1;
		int count=random;	
		nu+=count;
		int count1=0;
		
	    M:
		for(int i=1;i<=	10;i++)
		{
			
			if(k==11)
			{
				px1-=70;
				k--;
			}
			if(k==0)
			{
				px1+=70;
				k++;
			}
			for(int j=1;j<=10;j++)
			{
				count1++;
				
				
            if(nu==4)
			{
				nu=25;
			}
			if(nu==13)
			{
				nu=46;
			}
			if(nu==33)
			{
				nu=49;
			}
			if(nu==42)
			{
				nu=63;
			}
			if(nu==50)
			{
				nu=69;
			}
			if(nu==62)
			{
				nu=81;
			}
			if(nu==74)
			{
				nu=92;
			}
			if(nu==27)
			{
				nu=5;
			}
			if(nu==40)
			{
				nu=3;
			}
			if(nu==43)
			{
				nu=18;
			}
			if(nu==54)
			{
				nu=31;
			}
			if(nu==66)
			{
				nu=45;
			}
			if(nu==76)
			{
				nu=58;
			}
			if(nu==89)
			{
				nu=53;
			}
			if(nu==99)
			{
				nu=41;
			}
			if(count1==100)
			{
				d=true;
				JOptionPane.showMessageDialog(null,"player 2 is winner","Display Message", JOptionPane.
INFORMATION_MESSAGE);
				px1=40;
				py1=620;
				px2=120;
				py2=620;
				s=false;
				repaint();
			}
			else
			{
				d=false;
			}
			
		switch(random)
		{
			case 1:
			img11=new ImageIcon("dice1.png");		
			break;
			case 2:
			img11=new ImageIcon("dice2.png");
			break;
			case 3:
			img11=new ImageIcon("dice3.png");
			break;
			case 4:
			img11=new ImageIcon("dice4.png");
			break;
			case 5:
			img11=new ImageIcon("dice5.png");
			break;
			case 6:
			img11=new ImageIcon("dice6.png");
			break;		
		}
		
		dice1=img11.getImage();
		repaint();
		
		if(count1==nu)break M;
		if(i%2==1)
			{
				px1+=70;
				k++;
				}
	     if(i%2==0)
			{
				px1-=70;
				k--;
			}
		
			}
	py1-=70;
		}
	}
	}
	else
	{ 
       if(e.getSource()==b3)
        {
		int random=(int)Math.round(Math.random()*5+1); 
		if(nu==95&&random==6)
		{
			nu=89;
		}
		if(nu1==96&&random>4)
		{
			if(random==5)
			{
				nu1=91;
			}
			if(random==6)
			{
				nu1=90;
			}
		}
		if(nu1==97&&random>3)
		{
			if(random==4)
			{
				nu1=93;
			}
			if(random==5)
			{
				nu1=92;
			}
			if(random==6)
			{
				nu1=91;
			}
		}
		if(nu1==98&&random>2)
		{
			if(random==3)
			{
				nu1=95;
			}
			if(random==4)
			{
				nu1=94;
			}
			if(random==5)
			{
				nu1=93;
			}
			if(random==6)
			{
				nu1=92;
			}
		}
		if(nu1==99&&random>1)
		{
			if(random==2)
			{
				nu1=97;
			}
			if(random==3)
			{
				nu1=96;
			}
			if(random==4)
			{
				nu1=95;
			}
			if(random==5)
			{
				nu1=96;
			}
			if(random==6)
			{
				nu1=97;
			}
		}
		px2=210;
		py2=645;
		int k=1;
		int count=random;
		nu1+=count;
		int count1=0;
		 
	    M:
		for(int i=1;i<=	10;i++)
		{
			if(k==11)
			{
				px2-=70;
				k--;
			}
			if(k==0)
			{
				px2+=70;
				k++;
			}
			for(int j=1;j<=10;j++)
			{
				count1++;
            if(nu1==4)
			{
				nu1=25;
			}
			if(nu1==13)
			{
				nu1=46;
			}
			if(nu1==33)
			{
				nu1=49;
			}
			if(nu1==42)
			{
				nu1=63;
			}
			if(nu1==50)
			{
				nu1=69;
			}
			if(nu1==62)
			{
				nu1=81;
			}
			if(nu1==74)
			{
				nu1=92;
			}
			if(nu1==27)
			{
				nu1=5;
			}
			if(nu1==40)
			{
				nu1=3;
			}
			if(nu1==43)
			{
				nu1=18;
			}
			if(nu1==54)
			{
				nu1=31;
			}
			if(nu1==66)
			{
				nu1=45;
			}
			if(nu1==76)
			{
				nu1=58;
			}
			if(nu1==89)
			{
				nu1=53;
			}
			if(nu1==99)
			{
				nu1=41;
			}
			
			if(count1==100)
			{
				d=true;
				JOptionPane.showMessageDialog(null,"player 1 is winner","Display Message", JOptionPane.
INFORMATION_MESSAGE);
				px1=40;
				py1=620;
				px2=120;
				py2=620;
				s=false;
				repaint();
			}
			else
			{
				d=false;
			}
		switch(random)
		{
			case 1:
			img11=new ImageIcon("dice1.png");		
			break;
			case 2:
			img11=new ImageIcon("dice2.png");
			break;
			case 3:
			img11=new ImageIcon("dice3.png");
			break;
			case 4:
			img11=new ImageIcon("dice4.png");
			break;
			case 5:
			img11=new ImageIcon("dice5.png");
			break;
			case 6:
			img11=new ImageIcon("dice6.png");
			break;	
		}
	
		dice1=img11.getImage();
		repaint();
		
		if(count1==nu1)break M;
		if(i%2==1)
			{
				px2+=70;
				k++;
				}
	     if(i%2==0)
			{
				px2-=70;
				k--;
			}
			
			}
	py2-=70;
	
		}
		}
	}
	c++;
	}
}
}
class SnakeAndLadder
{
public static void main(String ar[])
{
	FDemo f=new FDemo();
	f.setVisible(true);
	Toolkit t = Toolkit.getDefaultToolkit();
	Dimension d = t.getScreenSize();
	int w=990;
	int h=735;
	int x=(d.width-w)/2;
	int y=(d.height-h)/2;
	f.setBounds(x,y,w,h);
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
}
}
 