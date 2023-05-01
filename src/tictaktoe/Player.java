package tictaktoe;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Player {
	static private String xImage = "resources/x.png";
	static private String oImage = "resources/o.png";

	private String letter;	
	public int numberOfWins;
	private ImageIcon icon;
	
	Player(String letter){
		this.letter = letter;
		this.numberOfWins = 0;
		this.setImageIcon(this.letter);		
	}
	
	public void setImageIcon(String letter) {
		String imagePath = letter.equals("x") ? xImage : oImage;
		try {
			Image image = ImageIO.read(new File(imagePath));
			this.icon = new ImageIcon(image);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Image Not Found");
		}
		
	}

	public Icon getIcon() {
		return this.icon;
	}
	
	public String getLetter() {
		return this.letter;
	}
	
	
	@Override
	public String toString() {
		return "player " + this.letter;
	}
}
