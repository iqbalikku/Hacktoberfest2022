//package experiments;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class lights extends JPanel implements ActionListener
{
	String msg="";
	JLabel l;
	//JTextField t;
      //Graphics g;
	//JFrame c;
	ButtonGroup bg;
	JRadioButton r1,r2,r3;
	Color red,yellow,green;
	lights()
	{
		setBounds(500,500,500,480);
		//setLayout(new FlowLayout());
		//c=new JFrame();
		l=new JLabel("TRAFFIC LIGHTS");
		//t=new JTextField(20);
		r1=new JRadioButton("RED");
		r2=new JRadioButton("YELLOW");
		r3= new JRadioButton("GREEN");
		red=getBackground();
		yellow=getBackground();
		green=getBackground();
		bg= new ButtonGroup();
		add(l);
		add(r1);
		add(r2);
		add(r3);
		//g.drawOval(200, 300, 50, 50);
		//g.drawOval(200, 400, 50, 50);
		//g.drawOval(200, 500, 50, 50);
		//c.add(t);
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
		//setSize(500,500);
		//setVisible(true);
		//setBackground(Color.black);


	}
	public void paintComponent(Graphics g)
	{
		g.drawOval(300, 50, 50, 50);
		g.drawOval(300, 150, 50, 50);
		g.drawOval(300, 250, 50, 50);
		g.setColor(red);
		g.fillOval(300,50 , 50, 50);
		g.setColor(yellow);
		g.fillOval(300,150, 50, 50);
		g.setColor(green);
		g.fillOval(300,250 , 50, 50);


	}
	public void actionPerformed(ActionEvent ie)
	{
		msg=ie.getActionCommand();

		if(msg.equals("RED"))
		{
			red=Color.red;
			yellow=getBackground();
			green=getBackground();

			}
		else if(msg.equals("YELLOW"))
		{
			red=getBackground();
			yellow=Color.yellow;
			green=getBackground();
		}
		else if(msg.equals("GREEN"))
		{
			red=getBackground();
			yellow=getBackground();
			green=Color.green;
		}
		repaint();
	}
}


public class light {

	public static void main(String[] args) {
		lights a= new lights();
		JFrame c=new JFrame("TRAFFIC LIGHT");
		c.setVisible(true);
		c.setSize(640,480);
		c.setLayout(null);

		c.setBackground(Color.black);
       lights lm=new lights();
        c.add(lm);
       //lm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
