import java.util.Random;

public class Player extends BattleShips {
	
	
	protected static void userDeployment() {
		/////////////////////////////////////////////
		// Get User input Start
		/////////////////////////////////////////////
		boolean checkerX = false;
		boolean checkerY = false;
		int checkerXVal = 0;
		int checkerYval = 0;
		int count = 0;
		int userValX;
		int userValY;
		String Name;
		
		System.out.print("Enter Your Name: ");
		Name = userInput.next();
		System.out.println();
		System.out.println("Where do you want to deploy your ships " + Name + "?");
		System.out.println();
		
		
		
		while (count < 5) {
			while (!checkerX) {
				
				System.out.print("Please enter your X Co-Ordinate (a number between 0 and 9): ");
				userValX = userInput.nextInt();
					if (userValX <= 9 && userValX >= 0) {
						checkerX = true;
						checkerXVal = userValX;
					}
					
					
					else {
						System.out.println(errorResponseLetter);
					}				
				
		} 	
		
			

			while (!checkerY) {
				System.out.print("Please enter your Y Co-Ordinate (a letter between A and J): ");
				String userLtrValy = userInput.next();
				userValY = convertLetterToInt(userLtrValy);
				if (userValY <= 9 && userValY >= 0) {
					checkerY = true;
					checkerYval = userValY;
				} else {
					System.out.println(errorResponse);
				}
			}
			if (map.oceanMap[checkerXVal][checkerYval] != null) {
				System.out.println("This position has already been taken, please choose another place for your ship");
				count--;
			} else {
				map.oceanMap[checkerXVal][checkerYval] = "@";
			}
			checkerX = false;
			checkerY = false;
			count++;
			System.out.println("number of ships used = " + count);
		}
		map.mapMaker();
	}
	
	protected static void compDeployment() {
		/////////////////////////////////////////////
		// Get Computer input Start
		/////////////////////////////////////////////

		boolean checkerXComp = false;
		boolean checkerYComp = false;
		int checkerXValComp = 0;
		int checkerYvalComp = 0;
		int countComp = 0;
		Random compNumber = new Random();

		System.out.println("The computer is deploy ships");
		while (countComp < 5) {
			while (!checkerXComp) {
				int compValX = (compNumber.nextInt(9));
				// System.out.println(compValX);
				if (compValX <= 9 && compValX >= 0) {
					checkerXComp = true;
					checkerXValComp = compValX;
				} else {
					System.out.println(errorResponse);
				}
			}

			while (!checkerYComp) {
				int compValY = (compNumber.nextInt(9));
				// System.out.println(compValY);
				if (compValY <= 9 && compValY >= 0) {
					checkerYComp = true;
					checkerYvalComp = compValY;
				} else {
					System.out.println(errorResponse);
				}
			}
			if (map.oceanMap[checkerXValComp][checkerYvalComp] != null) {
				System.out.println("This position has already been taken, please choose another place for your ship");
				countComp--;
			} else {
				map.oceanMap[checkerXValComp][checkerYvalComp] = "#";
			}
			checkerXComp = false;
			checkerYComp = false;
			countComp++;
			System.out.println(countComp + ". ship Deployed");
			System.out.println();
		}
		/////////////////////////////////////////////
		// Get Computer input End
		/////////////////////////////////////////////

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
