/**
 * 
 */
package seon6011.gui;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Herve
 *
 */
public class GUI implements ActionListener {
	
	private JButton buttonEps = new JButton("Set number of Taylor series expansions");
	private JButton buttonA = new JButton("Set Value a");
	private JButton buttonB = new JButton("Set Value b");
	private JButton buttonX = new JButton("Set Value x");
	private JButton buttonCalc = new JButton("Calculate");
	private JButton buttonReset = new JButton("Reset");
	private JButton buttonEpsilon = new JButton("Set Value of Eps");
	private JLabel label = new JLabel("Welcome to the calculator app for y=ab^x. Please enter values below");
	private JTextArea txtFieldRes = new JTextArea("Resullt");
	private	JFrame frame = new JFrame();
	private double valueA = 0.0;
	private double valueB = 0.0;
	private double valueX = 0.0;
	
	/**
	 * Default constructor
	 */
	public GUI() {
		
		JPanel panel = new JPanel();
		
		txtFieldRes.setEditable(false);
		//txtFieldRes.setSize(200, 200);
		txtFieldRes.setText("Result\nValue of a = " + valueA + "\nValue of b = " + valueB + "\nValue of x = " + valueX + 
				"\nNumber of Expansions = " + seon6011.main.main.EXPANSION + "\nValue of Epsilon = "
				+ seon6011.main.main.EPSILON);
		
		buttonEps.addActionListener(this);
		buttonEpsilon.addActionListener(this);
		buttonA.addActionListener(this);
		buttonB.addActionListener(this);
		buttonReset.addActionListener(this);
		buttonX.addActionListener(this);
		buttonCalc.addActionListener(this);
		
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		panel.setLayout(new GridLayout(0,1));
		panel.add(label);
		panel.add(buttonEps);
		panel.add(buttonEpsilon);
		panel.add(buttonA);
		panel.add(buttonB);
		panel.add(buttonX);
		panel.add(buttonCalc);

		panel.add(buttonReset);
		
		frame.setLayout(new GridLayout(0,1));
		frame.add(panel, BorderLayout.NORTH);
		frame.add(txtFieldRes, BorderLayout.SOUTH);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Calculator App");
		frame.pack();
		frame.setSize(500, 500);
		frame.setVisible(true);
		
	}

	/*
	 * Action listener for buttons
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==buttonEpsilon) {
			try {
				Object result = JOptionPane.showInputDialog(frame, "Enter the value of Eps");
				seon6011.main.main.EPSILON = Double.parseDouble(result.toString());
			
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "Please enter a real value", "Error Message", JOptionPane.ERROR_MESSAGE);
			}
		}
		if(e.getSource()==buttonEps) {
			try {
				Object result = JOptionPane.showInputDialog(frame, "Enter the value of Eps");
				seon6011.main.main.EXPANSION = Integer.parseInt(result.toString());

			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "Please enter a real value", "Error Message", JOptionPane.ERROR_MESSAGE);
			}
		}
		if(e.getSource()==buttonA) {
			
			try {
				Object result = JOptionPane.showInputDialog(frame, "Enter the value of a");
				valueA = Double.parseDouble(result.toString());
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "Please enter a real value", "Error Message", JOptionPane.ERROR_MESSAGE);
			}
			
		}
		if(e.getSource()==buttonB) {
			try {
				Object result = JOptionPane.showInputDialog(frame, "Enter the value of b");
				valueB = Double.parseDouble(result.toString());
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "Please enter a real value", "Error Message", JOptionPane.ERROR_MESSAGE);
			}
		}
		
		if(e.getSource()==buttonX) {
			try {
				Object result = JOptionPane.showInputDialog(frame, "Enter the value of x");
				valueX = Double.parseDouble(result.toString());
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "Please enter a real value", "Error Message", JOptionPane.ERROR_MESSAGE);
			}		
		}
		
		if(e.getSource()==buttonReset) {
			valueA = 0.0;
			valueB = 0.0;
			valueX = 0.0;
			seon6011.main.main.EXPANSION = 60;
			seon6011.main.main.EPSILON = 0.0000001;
		}
		txtFieldRes.setText("Result\nValue of a = " + valueA + "\nValue of b = " + valueB + "\nValue of x = " + valueX + 
								"\nNumber of Expansions = " + seon6011.main.main.EXPANSION + "\nValue of Epsilon = "
								+ seon6011.main.main.EPSILON);
		if(e.getSource()==buttonCalc) {
			double ans = 0.0;
			try {
				ans = seon6011.main.main.calculate(valueA, valueB, valueX);
				txtFieldRes.setText("Result\nValue of a = " + valueA + "\nValue of b = " + valueB + "\nValue of x = " + valueX + 
						"\nNumber of Expansions = " + seon6011.main.main.EXPANSION + "\nValue of Epsilon = "
						+ seon6011.main.main.EPSILON + "\n\n\n The Answer is " + ans);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				txtFieldRes.setText("Result\nValue of a = " + valueA + "\nValue of b = " + valueB + "\nValue of x = " + valueX + 
						"\nNumber of Expansions = " + seon6011.main.main.EXPANSION + "\nValue of Epsilon = "
						+ seon6011.main.main.EPSILON + "\n\n\n Answer: There was an error in the calculation " + e1.getMessage());
			}
			
		}
		
	}
	
	/**
	 * @param args the command line argument (no Arguments required)
	 * Initializing the gui
	 */
	public static void main(String[] args) {
		new GUI();
	}
}
