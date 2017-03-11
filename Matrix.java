package GUICanvas;


import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;


public class Matrix extends JFrame implements ActionListener
{
	
	JFrame Matrix = new JFrame();
	GridBagConstraints c = new GridBagConstraints();
	
	//declaring labels
	JLabel group1 = new JLabel("Matrix 1");
	JLabel group2 = new JLabel("Matrix 2");
	JLabel group3 = new JLabel("Determinant 1");
	JLabel group4 = new JLabel("Determinant 2");
	JLabel answer = new JLabel("Matrix3");
	
	//declaring buttons
	JButton addition = new JButton("     ADD      ");
	JButton subtract = new JButton("   SUBTRACT   ");
	JButton multipy = new JButton ("Multiplication");
	JButton determinant = new JButton ("Determinant of Matrix 1");
	JButton determinant2 = new JButton ("Determinant of Matrix 2");
	
	//declaring textfields
	JTextField answer1 = new JTextField(3);
	JTextField answer2 = new JTextField(3);
	JTextField answer3 = new JTextField(3);
	JTextField answer4 = new JTextField(3);
	JTextField detA = new JTextField(3);
	JTextField detB = new JTextField(3);
	JTextField num1 = new JTextField(3);
	JTextField num2 = new JTextField(3);
	JTextField num3 = new JTextField(3);
	JTextField num4 = new JTextField(3);
	JTextField num5 = new JTextField(3);
	JTextField num6 = new JTextField(3);
	JTextField num7 = new JTextField(3);
	JTextField num8 = new JTextField(3);
	
	//private variables
	private int[][] Matrix1 = new int[2][2];
	private int[][] Matrix2 = new int[2][2];
	private int[][] Matrix3 = new int[2][2];
	
	
	
	public Matrix()
	{
		super("Matrix Calculator");
		
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		setLayout(new GridBagLayout());
		
		//don't let the user edit the Textfields
		answer1.setEditable(false);
		answer2.setEditable(false);
		answer3.setEditable(false);
		answer4.setEditable(false);
		detA.setEditable(false);
		detB.setEditable(false);
	
		
		//putting all the Gui components on the frame
		
		//group 1
		c.gridx = 2;
		c.gridy = 0;
		add(group1,c);
		
		//num1
		c.gridx = 2;
		c.gridy = 1;
		add(num1,c);
		
		//num2
		c.gridx = 3;
		c.gridy = 1;
		add(num2,c);
		
		//num3
		c.gridx = 2;
		c.gridy = 2;
		add(num3,c);
		
		
		//num4
		c.gridx = 3;
		c.gridy = 2;
		add(num4,c);
		
		//button1
		c.gridx = 0;
		c.gridy = 3;
		c.gridwidth = 2;
		add(addition,c);
		addition.addActionListener(this);
		
		c.gridwidth = 1;
		
		//group 2
		c.gridx = 4;
		c.gridy = 0;
		add(group2,c);
		
		//num5
	
		c.gridx = 4;
		c.gridy = 1;
		add(num5,c);
		
		//num7
		c.gridx = 4;
		c.gridy = 2;
		add(num7,c);
		
		
		//num6
		c.gridx = 5;
		c.gridy = 1;
		add(num6,c);
		
		//num 8
		c.gridx = 5;
		c.gridy = 2;
		add(num8,c);
		
		c.gridwidth = 2;
		
		//button2
		c.gridx = 2;
		c.gridy = 3;
		add(subtract,c);
		subtract.addActionListener(this);
		
		//button3
		c.gridx = 4;
		c.gridy = 3;
		add(multipy,c);
		multipy.addActionListener(this);

		//button4
		c.gridx = 6;
		c.gridy = 3;
		add(determinant,c);
		determinant.addActionListener(this);
		
		//button5
		c.gridx = 8;
		c.gridy = 3;
		add(determinant2,c);
		determinant2.addActionListener(this);
		
		//label answer
		c.gridx = 2;
		c.gridy = 4;
		add(answer,c);
		
		c.gridwidth = 1;
		
		//answer1
		c.gridx = 2;
		c.gridy = 5;
		add(answer1,c);
		
		//answer2
		c.gridx = 3;
		c.gridy = 5;
		add(answer2,c);
		
		//answer3
		c.gridx = 2;
		c.gridy = 6;
		add(answer3,c);

		//answer4
		c.gridx = 3;
		c.gridy = 6;
		add(answer4,c);
		
		
		//group3
		c.gridwidth = 2;
		c.gridx = 4;
		c.gridy = 4;
		add(group3,c);
		
		//detA
		c.gridx = 4;
		c.gridy = 5;
		add(detA,c);
		c.gridwidth = 1;
		
		
		c.gridwidth = 2;
		//group4
		c.gridx = 6;
		c.gridy = 4;
		add(group4,c);
		
		//detA
		c.gridx = 6;
		c.gridy = 5;
		add(detB,c);
		c.gridwidth = 1;
	

	
		
		
		this.pack();
		

		setVisible(true);
		
		
	}

	
	public void actionPerformed(ActionEvent evt) 
	{
		if(evt.getSource() == determinant)
		{
			try
			{
				Matrix1[0][0] = Integer.parseInt(num1.getText());
				Matrix1[0][1] = Integer.parseInt(num2.getText());
				Matrix1[1][0] = Integer.parseInt(num3.getText());
				Matrix1[1][1] = Integer.parseInt(num4.getText());
				
				int ad = Matrix1[0][0] * Matrix1[1][1];
				int bc = Matrix1[0][1] * Matrix1[1][0];
				
				int determinantA = ad - bc;
				
				detA.setText(Integer.toString(determinantA));
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(Matrix, "Please enter an integer number to the two matrixes");
			}
		
			
			
		}
		
		if(evt.getSource() == determinant2)
		{
			try
			{
				Matrix2[0][0] = Integer.parseInt(num5.getText());
				Matrix2[0][1] = Integer.parseInt(num6.getText());
				Matrix2[1][0] = Integer.parseInt(num7.getText());
				Matrix2[1][1] = Integer.parseInt(num8.getText());
				
				int ad = Matrix2[0][0] * Matrix2[1][1];
				int bc = Matrix2[0][1] * Matrix2[1][0];
				
				int determinantB = ad - bc;
				
				detB.setText(Integer.toString(determinantB));
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(Matrix, "Please enter an integer in the matrix");
			}
			
			
			
		}
		if (evt.getSource() == multipy)
		{
			try
			{
				Matrix1[0][0] = Integer.parseInt(num1.getText());
				Matrix1[0][1] = Integer.parseInt(num2.getText());
				Matrix1[1][0] = Integer.parseInt(num3.getText());
				Matrix1[1][1] = Integer.parseInt(num4.getText());
				
				Matrix2[0][0] = Integer.parseInt(num5.getText());
				Matrix2[0][1] = Integer.parseInt(num6.getText());
				Matrix2[1][0] = Integer.parseInt(num7.getText());
				Matrix2[1][1] = Integer.parseInt(num8.getText());
				
			
				int num1 = Matrix1[0][0] * Matrix2[0][0];
				int num2 = Matrix1[0][1] * Matrix2[1][0];
						
				Matrix3[0][0] = num1 + num2;
				
				num1 = Matrix1[0][0] * Matrix2[0][1];
				num2 = Matrix1[0][1] * Matrix2[1][1];
				
				Matrix3[0][1] = num1 + num2;
				
				
				num1 = Matrix1[1][0] * Matrix2[0][0];
				num2 = Matrix1[1][1] * Matrix2[1][0];
			
				Matrix3[1][0] = num1 + num2;
				
				num1 = Matrix1[1][0] * Matrix2[0][1];
				num2 = Matrix1[1][1] * Matrix2[1][1];
				
				Matrix3[1][1] = num1 + num2;
				
				answer1.setText(Integer.toString(Matrix3[0][0]));
				answer2.setText(Integer.toString(Matrix3[0][1]));
				answer3.setText(Integer.toString(Matrix3[1][0]));
				answer4.setText(Integer.toString(Matrix3[1][1]));
				
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(Matrix, "Please enter an integer number to the two matrixes");
			}
			
		}
		
		if (evt.getSource() == addition)
		{
			try
			{
				Matrix1[0][0] = Integer.parseInt(num1.getText());
				Matrix1[0][1] = Integer.parseInt(num2.getText());
				Matrix1[1][0] = Integer.parseInt(num3.getText());
				Matrix1[1][1] = Integer.parseInt(num4.getText());
				
				Matrix2[0][0] = Integer.parseInt(num5.getText());
				Matrix2[0][1] = Integer.parseInt(num6.getText());
				Matrix2[1][0] = Integer.parseInt(num7.getText());
				Matrix2[1][1] = Integer.parseInt(num8.getText());
				
			
				
						
				Matrix3[0][0] = Matrix1[0][0] + Matrix2[0][0];
				
				
				Matrix3[0][1] = Matrix1[0][1] + Matrix2[0][1];
			
				Matrix3[1][0] = Matrix1[1][0] + Matrix2[1][0];
				
				
				Matrix3[1][1] = Matrix1[1][1] + Matrix2[1][1];
				
				answer1.setText(Integer.toString(Matrix3[0][0]));
				answer2.setText(Integer.toString(Matrix3[0][1]));
				answer3.setText(Integer.toString(Matrix3[1][0]));
				answer4.setText(Integer.toString(Matrix3[1][1]));
				
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(Matrix, "Please enter an integer number to the two matrixes");
			}
			
		}
		
		if (evt.getSource() == subtract)
		{
			try
			{
				Matrix1[0][0] = Integer.parseInt(num1.getText());
				Matrix1[0][1] = Integer.parseInt(num2.getText());
				Matrix1[1][0] = Integer.parseInt(num3.getText());
				Matrix1[1][1] = Integer.parseInt(num4.getText());
				
				Matrix2[0][0] = Integer.parseInt(num5.getText());
				Matrix2[0][1] = Integer.parseInt(num6.getText());
				Matrix2[1][0] = Integer.parseInt(num7.getText());
				Matrix2[1][1] = Integer.parseInt(num8.getText());
				
			
				
						
				Matrix3[0][0] = Matrix1[0][0] - Matrix2[0][0];
				
				
				Matrix3[0][1] = Matrix1[0][1] - Matrix2[0][1];
			
				Matrix3[1][0] = Matrix1[1][0] - Matrix2[1][0];
				
				
				Matrix3[1][1] = Matrix1[1][1] - Matrix2[1][1];
				
				answer1.setText(Integer.toString(Matrix3[0][0]));
				answer2.setText(Integer.toString(Matrix3[0][1]));
				answer3.setText(Integer.toString(Matrix3[1][0]));
				answer4.setText(Integer.toString(Matrix3[1][1]));
				
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(Matrix, "Please enter an integer number to the two matrixes");
			}
			
		}
	}
}
