package DesRochers.Ryan.Chapter7.Java.Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

	private JFrame frame;
	private JTextField denField;
	private JTextField numField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		denField = new JTextField();
		denField.setBounds(219, 11, 96, 20);
		frame.getContentPane().add(denField);
		denField.setColumns(10);
		
		JLabel numLabel = new JLabel("     Numerator");
		numLabel.setBounds(83, 36, 95, 14);
		frame.getContentPane().add(numLabel);
		
		numField = new JTextField();
		numField.setBounds(83, 11, 96, 20);
		frame.getContentPane().add(numField);
		numField.setColumns(10);
		
		JLabel denLabel = new JLabel("   Denominator");
		denLabel.setBounds(219, 36, 96, 14);
		frame.getContentPane().add(denLabel);
		
		JLabel result = new JLabel("(Result)");
		result.setBounds(208, 78, 207, 14);
		frame.getContentPane().add(result);
		
		JButton calcButton = new JButton("Calculate:");
		
		calcButton.setBounds(96, 74, 95, 23);
		frame.getContentPane().add(calcButton);
		
		calcButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				double numerator = Double.parseDouble(numField.getText());
				double denominator = Double.parseDouble(denField.getText());
				SimpleMath math = new SimpleMath();
				try {
					double answer = math.divide(numerator, denominator);
					result.setText(""+answer);
				}
				catch(ArithmeticException x) {
					result.setText("Cannot divide by 0");
				}
				
			}
		});
	}
}
