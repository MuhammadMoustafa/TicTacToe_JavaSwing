package tictaktoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListner implements ActionListener {

	MyCustomButton btn;
	
	MyActionListner(MyCustomButton btn){
		this.btn = btn;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(this.btn.isClicked) return;
		
		Game.boardLetter[this.btn.getNumber()] = Game.currentPlayer.getLetter();
		this.btn.setIcon(Game.currentPlayer.getIcon());
		if(Game.isOver() || Game.isFinished()) {
			if(Game.isOver()) {
//				System.out.println("Game Over");
//				System.out.print("Winner is ");
//				System.out.println(Game.currentPlayer);
				Game.currentPlayer.numberOfWins++;
				Game.board.setStatusText("Game Over " + "Winner is " + Game.currentPlayer);
				Game.board.setXscoreText(Integer.toString(Game.player1.numberOfWins));
				Game.board.setOscoreText(Integer.toString(Game.player2.numberOfWins));
//				System.out.println(Game.player1 + " " + Game.player1.numberOfWins);
//				System.out.println(Game.player1 + " " + Game.player2.numberOfWins);
			} else {
				Game.board.setStatusText("Game Over " + " Draw");
//				System.out.println("Game Over");
//				System.out.println("Draw");
			}
			Game.reset();
		} else {
			this.btn.isClicked = true;
//			this.btn.setEnabled(false);
			Game.togglePlayer();
		}
	}
	
}
