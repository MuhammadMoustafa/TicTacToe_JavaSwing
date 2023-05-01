package tictaktoe;

public class Game {

	static Board board;
	static Player player1;
	static Player player2;
	static Player currentPlayer;
	
	static String[] boardLetter = new String[9];
	
	Game(Board board){
		Game.board = board;
		Game.player1 = new Player("x");
		Game.player2 = new Player("o");
		Game.reset();
	}
		
	static void togglePlayer() {
		currentPlayer = currentPlayer.equals(player1) ? player2 : player1;
		System.out.println(currentPlayer);
	}

	public static boolean isOver() {
		return ( boardLetter[0].equals(boardLetter[1]) && boardLetter[1].equals(boardLetter[2]) && boardLetter[0] != "")
			|| ( boardLetter[3].equals(boardLetter[4]) && boardLetter[4].equals(boardLetter[5]) && boardLetter[3] != "")
			|| ( boardLetter[6].equals(boardLetter[7]) && boardLetter[7].equals(boardLetter[8]) && boardLetter[6] != "")
			|| ( boardLetter[0].equals(boardLetter[3]) && boardLetter[3].equals(boardLetter[6]) && boardLetter[0] != "")
			|| ( boardLetter[1].equals(boardLetter[4]) && boardLetter[4].equals(boardLetter[7]) && boardLetter[1] != "")
			|| ( boardLetter[2].equals(boardLetter[5]) && boardLetter[5].equals(boardLetter[8]) && boardLetter[2] != "")
			|| ( boardLetter[0].equals(boardLetter[4]) && boardLetter[4].equals(boardLetter[8]) && boardLetter[0] != "")
			|| ( boardLetter[2].equals(boardLetter[4]) && boardLetter[4].equals(boardLetter[6]) && boardLetter[2] != "");
	}
	
	static void reset() {
		for(int i = 0; i < boardLetter.length; i++) {
			boardLetter[i] = "";
		}
		
		for(MyCustomButton btn: MyCustomButton.buttonList) {
			btn.setIcon(null);
			btn.isClicked = false;
//			btn.setEnabled(true);
		}
		currentPlayer = player1;
		
	}

	public static boolean isFinished() {
		for(int i = 0; i < boardLetter.length; i++) {
			if(boardLetter[i] == "") {
				return false;
			}
		}
		return true;
	}
}
