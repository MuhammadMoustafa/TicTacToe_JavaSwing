package tictaktoe;

import java.awt.EventQueue;

public class App {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Board board = new Board();
					new Game(board);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
