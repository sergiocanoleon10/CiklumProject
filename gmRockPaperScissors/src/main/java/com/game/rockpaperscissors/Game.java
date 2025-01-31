package com.game.rockpaperscissors;
/********************************************************************
* 	Main Class. It lets to play a round and return the variables    *
*       		needed in the front.								* 
********************************************************************/
import java.util.Random;

public class Game {
	public String[] gamePlay() {
		
	    /*VARIABLES DECLARATION INI*/
			
		//Players' Choices	
		HandOptions firstPlayer = getRandomOption();
		HandOptions secondPlayer = HandOptions.ROCK;
		
		//Variables needed for the logic process
		int winner;
		int playerOne;
		int playerTwo;
		
		//Array to set info needed by JSP 
		String[] result = new String[3]; 
		
		/*VARIABLES DECLARATION END*/
	 
		try {
		    
			//Let's play
			RoundGame round = new RoundGame();
			playerOne = firstPlayer.getOption();
			playerTwo = secondPlayer.getOption();
			winner = round.winner(firstPlayer);
			
			//Player One Choice in result array
			switch (playerOne) {
				case 0:
					result[0] = "Rock"; //Gamer 1 Rock
					break;
				
				case 1:
					result[0] = "Paper"; //Gamer 1 Paper
					break;
					
				case 2:
					result[0] = "Scissors"; //Gamer 1 Scissors
					break;
			}
	
			//Player Two Choice in result array
			switch (playerTwo) {
		
				case 0:
					result[1] = "Rock"; //Gamer 2 Rock
					break;
				
				case 1:
					result[1] = "Paper"; //Gamer 2 Paper
					break;
					
				case 2:
					result[1] = "Scissors"; //Gamer 2 Scissors
					break;
			}
			
			//Winner result in result array
			switch (winner) {
				case -1:
					result[2] = "Player 2 Wins!"; //Gamer 2 win
					break;
				
				case 0:
					result[2] = "Tie!"; //Tie
					break;
					
				case 1:
					result[2] = "Player 1 Wins!"; //Gamer 1 win
					break;
			}
			
		 }catch (Exception badGame) {
			result[2] = "ERROR";
			System.out.println("Something was wrong. Try to contact with the admin of this app A.K.A. Sergio");
		}
	  return result;
	}
	
	//Method used for obtaining the random choice (Player One)
	public HandOptions getRandomOption() {
		HandOptions[] values = HandOptions.values();
		int length = values.length;
		return values[new Random().nextInt(length)];
	}
	
}
