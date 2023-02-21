package com.masai;


import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RegistrationForm {

	public static void main(String[] args) {

		MyFrame frame  = new MyFrame();

	}

}

class MyFrame extends JFrame implements ActionListener{
	
	JLabel title,lable1,label2,label3,label4;
	JTextField t1,t2,t3;	
	JComboBox date,month,year;	
	JButton next;	
	Container c ; 
	
	private String dates[]
			= { "1", "2", "3", "4", "5",
				"6", "7", "8", "9", "10",
				"11", "12", "13", "14", "15",
				"16", "17", "18", "19", "20",
				"21", "22", "23", "24", "25",
				"26", "27", "28", "29", "30",
				"31" };
		private String months[]
			= { "Jan", "feb", "Mar", "Apr",
				"May", "Jun", "July", "Aug",
				"Sup", "Oct", "Nov", "Dec" };
		private String years[]
			= { "1995", "1996", "1997", "1998",
				"1999", "2000", "2001", "2002",
				"2003", "2004", "2005", "2006",
				"2007", "2008", "2009", "2010",
				"2011", "2012", "2013", "2014",
				"2015", "2016", "2017", "2018",
				"2019" };
	
	
	MyFrame(){
		
		setTitle("Rental Form");
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		c = getContentPane();
		c.setLayout(null);
		
		title = new JLabel("Order  Summary");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(300, 30);
		title.setLocation(300, 30);
		c.add(title);
		
		lable1 = new JLabel("Product Name");
		lable1.setBounds(260,100,100,20);
		c.add(lable1);
		
		t1 = new JTextField();
		t1.setBounds(390,100,150,20);
		c.add(t1);
		
		label2 =  new JLabel("Price");
		label2.setBounds(260,150,100,20);		
		c.add(label2);
		
		t2 = new JTextField();
		t2.setBounds(390,150,150,20);
		c.add(t2);
		
		label3 = new JLabel("Order ID");
		label3.setBounds(260,200,100,20);
		c.add(label3);
		
		t3 = new JTextField();
		t3.setBounds(390,200,150,20);
		c.add(t3);
		
		label4 = new JLabel("Date");
		label4.setBounds(260,250,100,20);
		c.add(label4);
		
		date = new JComboBox<>(dates);		
		date.setBounds(380,250,40,20);
		c.add(date);
		
		month = new JComboBox<>(months);
		month.setBounds(430,250,50,20);
		c.add(month);
		
		year = new JComboBox<>(years);
		year.setBounds(490,250,70,20);
		c.add(year);
		
		next = new JButton("Next");
		next.setBounds(390,400,100,30);
		next.addActionListener(this);
		c.add(next);
		
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		MyFrame2 frame2 =  new MyFrame2();
		
	}
}

class MyFrame2 extends JFrame implements ActionListener{
	
	JLabel title,lable1,label2,label3,label4,label5;
	JTextField t1,t2,t3;
	JRadioButton male,female;
	JComboBox day,month,year;
	JTextArea ta1;
	JCheckBox terms;
	JButton next;
	JLabel msg;
	Container c ; 
	MyFrame2(){
		
		setTitle("Customer section");
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		c = getContentPane();
		c.setLayout(null);
		
		title = new JLabel("Customer Details");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(300, 30);
		title.setLocation(300, 30);
		c.add(title);
		
		lable1 = new JLabel("Name");
		lable1.setBounds(280,100,100,20);
		c.add(lable1);
		
		t1 = new JTextField();
		t1.setBounds(390,100,100,20);
		c.add(t1);
		
		label2 = new JLabel("Number");
		label2.setBounds(280,150,100,20);
		c.add(label2);
		
		t2 = new JTextField();
		t2.setBounds(390,150,100,20);
		c.add(t2);
		
		label3 = new JLabel("Email");
		label3.setBounds(280,200,100,20);
		c.add(label3);
		
		t3 = new JTextField();
		t3.setBounds(390,200,100,20);
		c.add(t3);
		
		label4 = new JLabel("Address");
		label4.setBounds(280,250,100,20);
		c.add(label4);
		
		ta1 = new JTextArea();
		ta1.setBounds(390,250,100,50);
		c.add(ta1);
		
		terms = new JCheckBox("Please accept terms and conditions");
		terms.setBounds(280,350,300,20);
		c.add(terms);
		
		msg = new JLabel("");
		msg.setFont(new Font("Arial", Font.PLAIN, 20));
		msg.setSize(500, 25);
		msg.setLocation(250, 500);
		c.add(msg);
		
		next = new JButton("Next");
		next.setBounds(390,400,100,30);
		next.addActionListener(this);
		c.add(next);
		
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(terms.isSelected()) {
			
			MyFrame3 frame3 =  new MyFrame3();
		}else {
			
			msg.setText("Please accept the terms and conditions... ");
		}
		
		
		
	}
	
}


class MyFrame3 extends JFrame implements ActionListener {
	
	JLabel title,lable1;
	JTextField t1,t2,t3;	
	JComboBox mode;	
	JButton submit;
	JLabel msg;
	Container c ; 
	
	String [] payMode = {"COD","Online"};
	
	MyFrame3(){
		
		setTitle("Payment section");
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		c = getContentPane();
		c.setLayout(null);
		
		title = new JLabel("Payment");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(300, 30);
		title.setLocation(400, 30);
		c.add(title);
		
		lable1 = new JLabel("Payment Mode");
		lable1.setBounds(290,200,100,20);
		c.add(lable1);
		
		mode = new JComboBox(payMode);
		mode.setBounds(420,200,100,20);
		c.add(mode);
		
		msg = new JLabel("");
		msg.setBounds(300,300,300,20);
		c.add(msg);
		
		submit = new JButton("Submit");
		submit.setBounds(390,400,100,30);
		submit.addActionListener(this);
		c.add(submit);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	 String modString = (String) mode.getSelectedItem();
		msg.setText("Payment Success with "+modString+" mode");
		
	}
	
	
}
