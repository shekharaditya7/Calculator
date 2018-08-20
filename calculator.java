import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class calculator extends JFrame implements ActionListener
{
	JButton a,b,c,d,e,f,g,h,i,j,k,l,m,n,p,q,r,s,t,u,v,w,x,y,z,a1,b1,c1,e1,f1,g1,h1,i1;
	JTextField t1;
	JRadioButton o,d1;
	float sum=0;
	int x1=0,operator=0,fi=0,fi1=1;
	float arr[]=new float[100];
	double arr1[]= new double[100];
	int arr2[]=new int[100];
	public calculator()
	{
		
		JFrame obj=new JFrame();
		obj.setResizable(false);
		obj.setTitle("CALCULATOR");
		obj.setVisible(true);
		obj.setSize(800,400);
		obj.setLayout(null);
		
		Font font1 = new Font("SansSerif", Font.BOLD,20);
		t1=new JTextField("");
		t1.setFont(font1);
		obj.add(t1);
	
		f1=new JButton("1");
		l=new JButton("2");
		a1=new JButton("3");
		r=new JButton("4");
		g1=new JButton("5");
		m=new JButton("6");
		d=new JButton("7");
		s=new JButton("8");
		h1=new JButton("9");
		k=new JButton("0");
		z=new JButton(".");

		y=new JButton("(");
		e=new JButton(")");

		i=new JButton("sin");
		w=new JButton("cos");
		b=new JButton("tan");

		u=new JButton("+");
		g=new JButton("-");
		b1=new JButton("*");
		n=new JButton("/");
		t=new JButton("%");
		f=new JButton("=");

		d1=new JRadioButton("Deg");
		o=new JRadioButton("Rad");

		c=new JButton("log");
		x=new JButton("ln");
		v=new JButton("e");
		h=new JButton("pi");

		p=new JButton("EXP");
		q=new JButton("sqrt");
		j=new JButton("x!");
		c1=new JButton("Inv");
		e1=new JButton("x^y");

		a=new JButton("Ans");	
		i1=new JButton("AC");

		ButtonGroup bg= new ButtonGroup();
		bg.add(d1);
		bg.add(o);
		obj.add(a);obj.add(b);obj.add(c);obj.add(d);obj.add(e);obj.add		

(f);obj.add(i1);obj.add(h1);obj.add(g1);obj.add(f1);obj.add(e1);obj.add				

(d1);obj.add(c1);obj.add(b1);obj.add(g);obj.add(h);obj.add(i);obj.add		(j);obj.add

(k);obj.add(l);obj.add(m);obj.add(n);obj.add(o);obj.add(p);obj.add			

(q);obj.add(r);obj.add(s);obj.add(t);obj.add(u);obj.add(a1);obj.add(v);obj.add		

(w);obj.add(x);obj.add(y);obj.add(z);
		
		a.setBounds(20,320,100,40);
		b.setBounds(127,275,100,40);
		c.setBounds(234,230,100,40);
		d.setBounds(341,185,100,40);
		e.setBounds(448,140,100,40);
		f.setBounds(555,320,100,40);
		g.setBounds(662,275,100,40);
		h.setBounds(20,230,100,40);
		i.setBounds(127,185,100,40);
		j.setBounds(234,140,100,40);
		k.setBounds(341,320,100,40);
		l.setBounds(448,275,100,40);
		m.setBounds(555,230,100,40);
		n.setBounds(662,185,100,40);
		o.setBounds(20,140,100,40);
		p.setBounds(127,320,100,40);
		q.setBounds(234,275,100,40);
		r.setBounds(341,230,100,40);
		s.setBounds(448,185,100,40);
		t.setBounds(555,140,100,40);
		u.setBounds(662,320,100,40);
		v.setBounds(20,275,100,40);
		w.setBounds(127,230,100,40);
		x.setBounds(234,185,100,40);
		y.setBounds(341,140,100,40);
		z.setBounds(448,320,100,40);
		a1.setBounds(555,275,100,40);
		b1.setBounds(662,230,100,40);
		c1.setBounds(20,185,100,40);
		d1.setBounds(127,140,100,40);
		e1.setBounds(234,320,100,40);
		f1.setBounds(341,275,100,40);
		g1.setBounds(448,230,100,40);
		h1.setBounds(555,185,100,40);
		i1.setBounds(662,140,100,40);
		
		t1.setBounds(20,40,742,60);
		f.setBackground(Color.BLUE);
		f.setOpaque(true);
		f.setForeground(Color.WHITE);
		i1.setBackground(Color.BLUE);
		i1.setOpaque(false);
		i1.setForeground(Color.BLACK);
		h1.setBackground(Color.WHITE);
		h1.setOpaque(true);
		h1.setForeground(Color.BLACK);
		g1.setBackground(Color.WHITE);
		g1.setOpaque(true);
		g1.setForeground(Color.BLACK);
		a1.setBackground(Color.WHITE);
		a1.setOpaque(true);
		a1.setForeground(Color.BLACK);
		l.setBackground(Color.WHITE);
		l.setOpaque(true);
		l.setForeground(Color.BLACK);
		f1.setBackground(Color.WHITE);
		f1.setOpaque(true);
		f1.setForeground(Color.BLACK);
		k.setBackground(Color.WHITE);
		k.setOpaque(true);
		k.setForeground(Color.BLACK);
		r.setBackground(Color.WHITE);
		r.setOpaque(true);
		r.setForeground(Color.BLACK);
		m.setBackground(Color.WHITE);
		m.setOpaque(true);
		m.setForeground(Color.BLACK);
		d.setBackground(Color.WHITE);
		d.setOpaque(true);
		d.setForeground(Color.BLACK);
		s.setBackground(Color.WHITE);
		s.setOpaque(true);
		s.setForeground(Color.BLACK);
		z.setBackground(Color.WHITE);
		z.setOpaque(true);
		z.setForeground(Color.BLACK);
		i1.setBackground(Color.lightGray);
		i1.setOpaque(true);
		i1.setForeground(Color.BLACK);
		u.setBackground(Color.lightGray);
		u.setOpaque(true);
		u.setForeground(Color.BLACK);
		t.setBackground(Color.lightGray);
		t.setOpaque(true);
		t.setForeground(Color.BLACK);
		w.setBackground(Color.lightGray);
		w.setOpaque(true);
		w.setForeground(Color.BLACK);
		c1.setBackground(Color.lightGray);
		c1.setOpaque(true);
		c1.setForeground(Color.BLACK);
		b1.setBackground(Color.lightGray);
		b1.setOpaque(true);
		b1.setForeground(Color.BLACK);
		e1.setBackground(Color.lightGray);
		e1.setOpaque(true);
		e1.setForeground(Color.BLACK);
		g.setBackground(Color.lightGray);
		g.setOpaque(true);
		g.setForeground(Color.BLACK);
		i.setBackground(Color.lightGray);
		i.setOpaque(true);
		i.setForeground(Color.BLACK);
		h.setBackground(Color.lightGray);
		h.setOpaque(true);
		h.setForeground(Color.BLACK);
		y.setBackground(Color.lightGray);
		y.setOpaque(true);
		y.setForeground(Color.BLACK);
		n.setBackground(Color.lightGray);
		n.setOpaque(true);
		n.setForeground(Color.BLACK);
		c.setBackground(Color.lightGray);
		c.setOpaque(true);
		c.setForeground(Color.BLACK);
		e.setBackground(Color.lightGray);
		e.setOpaque(true);
		e.setForeground(Color.BLACK);
		a.setBackground(Color.lightGray);
		a.setOpaque(true);
		a.setForeground(Color.BLACK);
		b.setBackground(Color.lightGray);
		b.setOpaque(true);
		b.setForeground(Color.BLACK);

		p.setBackground(Color.lightGray);
		p.setOpaque(true);
		p.setForeground(Color.BLACK);
		q.setBackground(Color.lightGray);
		q.setOpaque(true);
		q.setForeground(Color.BLACK);
		j.setBackground(Color.lightGray);
		j.setOpaque(true);
		j.setForeground(Color.BLACK);
		x.setBackground(Color.lightGray);
		x.setOpaque(true);
		x.setForeground(Color.BLACK);
		v.setBackground(Color.lightGray);
		v.setOpaque(true);
		v.setForeground(Color.BLACK);
		
a.addActionListener(this);
b.addActionListener(this);
c.addActionListener(this);
d.addActionListener(this);
e.addActionListener(this);
f.addActionListener(this);
g.addActionListener(this);
h.addActionListener(this);
i.addActionListener(this);
j.addActionListener(this);
k.addActionListener(this);
l.addActionListener(this);
m.addActionListener(this);
n.addActionListener(this);
i1.addActionListener(this);
p.addActionListener(this);
q.addActionListener(this);
r.addActionListener(this);
s.addActionListener(this);
t.addActionListener(this);
u.addActionListener(this);
v.addActionListener(this);
w.addActionListener(this);
x.addActionListener(this);
y.addActionListener(this);
z.addActionListener(this);
a1.addActionListener(this);
b1.addActionListener(this);
c1.addActionListener(this);
h1.addActionListener(this);
e1.addActionListener(this);
f1.addActionListener(this);
g1.addActionListener(this);




	}

	public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==k)
				t1.setText(t1.getText()+"0");

			else if(ae.getSource()==f1)
				t1.setText(t1.getText()+"1");

			else if(ae.getSource()==l)
				t1.setText(t1.getText()+"2");

			else if(ae.getSource()==a1)
				t1.setText(t1.getText()+"3");

			else if(ae.getSource()==r)
				t1.setText(t1.getText()+"4");

			else if(ae.getSource()==g1)
				t1.setText(t1.getText()+"5");

			else if(ae.getSource()==m)
				t1.setText(t1.getText()+"6");

			else if(ae.getSource()==d)
				t1.setText(t1.getText()+"7");

			else if(ae.getSource()==s)
				t1.setText(t1.getText()+"8");

			else if(ae.getSource()==h1)
				t1.setText(t1.getText()+"9");

			else if(ae.getSource()==z)
				t1.setText(t1.getText()+".");

			else if(ae.getSource()==u)
			{
				arr[x1]=Float.parseFloat(t1.getText());
				operator=1;
				x1 ++;
				t1.setText("");
			}
			else if(ae.getSource()==g)
			{
				arr[x1]=Float.parseFloat(t1.getText());
				operator=2;
				x1 ++;
				t1.setText("");
			}

			else if(ae.getSource()==b1)
			{
				arr[x1]=Float.parseFloat(t1.getText());
				operator=3;
				x1 ++;
				t1.setText("");
			}

			else if(ae.getSource()==n)
			{
				arr[x1]=Float.parseFloat(t1.getText());
				operator=4;
				x1 ++;
				t1.setText("");
			}
			else if(ae.getSource()==f)
			{
				arr[x1]=Float.parseFloat(t1.getText());
				x1++;
				if(operator==1)
				{sum=arr[x1-2]+arr[x1-1]; t1.setText(Float.toString(sum));}
				else if(operator==2)
				{ sum=arr[x1-2]-arr[x1-1];t1.setText(Float.toString(sum));}
				else if(operator==3)
				{ sum=arr[x1-2]*arr[x1-1];t1.setText(Float.toString(sum));}
				else if(operator==4)
				{sum=arr[x1-2]/arr[x1-1];t1.setText(Float.toString(sum));}
				else if(operator==5)
				{
				arr1[x1]=Math.pow(arr1[x1-2],arr[x1-1]);
				t1.setText(Double.toString(arr1[x1]));
				}
	
			}
			else if(ae.getSource()==i1)
			{
				x1=0;
				t1.setText("");
			}
			else if(ae.getSource()==t)
			{
				sum=((Float.parseFloat(t1.getText()))/100)*((arr[x1-1]));
				t1.setText(Float.toString(sum));
			}
			else if(ae.getSource()==a)
			{
				t1.setText("Ans="+ t1.getText());
			}
			else if(ae.getSource()==q)
			{
				arr1[x1]=Double.parseDouble(t1.getText());
				x1++;
				arr1[x1]=Math.pow(arr1[x1-1],(.5));
				t1.setText(Double.toString(arr1[x1]));	
			}
			else if(ae.getSource()==e1)
			{
				arr1[x1]=Float.parseFloat(t1.getText());
				operator=5;
				x1 ++;
				t1.setText("");
			}
			else if(ae.getSource()==j)
			{
				
				arr2[x1]=Integer.parseInt(t1.getText());
				x1++;
				for(fi=1;fi<=arr2[x1-1];fi++)
					{
						fi1=(fi)*(fi1);
					}
				t1.setText(Integer.toString(fi1));
				fi1=1;
			}
			else if(ae.getSource()==h)
			{
				t1.setText("3.142857");
			}
			else if(ae.getSource()==v)
			{
				t1.setText("2.71828");
			}
			else if(ae.getSource()==p)
			{
				arr2[x1]=Integer.parseInt(t1.getText());
				x1++;
				arr1[x1]=Math.pow(2.71828,arr2[x1-1]);
				t1.setText(Double.toString(arr1[x1]));
			}

			
		}
	public static void main(String[] args)
	{
		calculator obj1 = new calculator();
	}
}
