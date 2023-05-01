package tictaktoe;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MyCustomButton extends JButton {

	static int counter = 0;
	static MyCustomButton[] buttonList = new MyCustomButton[9];
	private int number;
	public boolean isClicked;

	MyCustomButton(){
		super("");
		if (counter < 9) {
			this.number = MyCustomButton.counter;
			buttonList[counter] = this;
			MyCustomButton.counter +=1;
			isClicked = false;
			this.addActionListener(new MyActionListner(this));
		}
	}
	
	public int getNumber() {
		return number;
	}	
}
