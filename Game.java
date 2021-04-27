
public class Game extends BattleShips {

	protected static void startGame() {

		boolean gameOver = false;
		boolean stateCheckerUser = false;
		boolean stateCheckerComp = false;
		int compShips = 5;
		int userShips = 5;
		int userStrike = 0;
		int compStrike = 0;

		while (!gameOver) {
			while (!stateCheckerUser) {
				if (gameOver && stateCheckerComp) {
					System.out.println("Game Over The Computer Wins");
					stateCheckerUser = true;
				} else {
					userStrike += userGuess();
					map.mapMakerNoShips();
					if (userStrike == compShips) {
						stateCheckerUser = true;
						gameOver = true;
						System.out.println("Game Over, Player 1 Wins");
					} else {
						stateCheckerUser = true;
						stateCheckerComp = false;
					}
				}

			}

			while (!stateCheckerComp) {
				if (gameOver && stateCheckerUser) {
					System.out.println("Game Over" + Player.Name + "Wins :) Congratulations!");
					stateCheckerComp = true;
				} else {
					compStrike += compGuess();
					map.mapMakerNoShips();
					if (compStrike == userShips) {
						stateCheckerComp = true;
						gameOver = true;
						System.out.println("Game Over, The Computer Wins");
					} else {
						stateCheckerComp = true;
						stateCheckerUser = false;
					}
				}

			}
		}
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		startGame();
	}

}
