package tictaktoe;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class Board {

	private JFrame frame;
	private JLabel lbl_xscore;
	private JLabel lbl_oscore;
	private JLabel lbl_status;
	
	public void setXscoreText(String text) {
		lbl_xscore.setText(text);
	}

	public void setOscoreText(String text) {
		lbl_oscore.setText(text);
	}

	public void setStatusText(String text) {
		lbl_status.setText(text);
	}

	
	

	/**
	 * Create the application.
	 */
	public Board() {
		initialize();
		this.frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 903, 638);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 3, 2, 2));
		
		JLabel lblNewLabel_1 = new JLabel("Player X");
		lblNewLabel_1.setForeground(Color.ORANGE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Player O");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_2);
		
		lbl_xscore = new JLabel("0");
		lbl_xscore.setFont(new Font("Tahoma", Font.BOLD, 23));
		lbl_xscore.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lbl_xscore);
		
		JSeparator separator_1 = new JSeparator();
		frame.getContentPane().add(separator_1);
		
		lbl_oscore = new JLabel("0");
		lbl_oscore.setFont(new Font("Tahoma", Font.BOLD, 23));
		lbl_oscore.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lbl_oscore);
		
		MyCustomButton myCustomButton_3 = new MyCustomButton();
		frame.getContentPane().add(myCustomButton_3);
		
		MyCustomButton myCustomButton = new MyCustomButton();
		frame.getContentPane().add(myCustomButton);
		
		MyCustomButton myCustomButton_2 = new MyCustomButton();
		frame.getContentPane().add(myCustomButton_2);
		
		MyCustomButton myCustomButton_1 = new MyCustomButton();
		frame.getContentPane().add(myCustomButton_1);
		
		MyCustomButton myCustomButton_6 = new MyCustomButton();
		frame.getContentPane().add(myCustomButton_6);
		
		MyCustomButton myCustomButton_4 = new MyCustomButton();
		frame.getContentPane().add(myCustomButton_4);
		
		MyCustomButton myCustomButton_5 = new MyCustomButton();
		frame.getContentPane().add(myCustomButton_5);
		
		MyCustomButton myCustomButton_7 = new MyCustomButton();
		frame.getContentPane().add(myCustomButton_7);
		
		MyCustomButton myCustomButton_8 = new MyCustomButton();
		frame.getContentPane().add(myCustomButton_8);
		
		lbl_status = new JLabel("New label");
		frame.getContentPane().add(lbl_status);
	}
}
