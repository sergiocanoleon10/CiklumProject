package com.game.rockpaperscissors;
/********************************************************************
* 	Choices and winner generator									* 
********************************************************************/
public class RoundGame {
	private int []solutions; 
	public int result;
	
	public RoundGame() {
		this.boardSolutions();
	}
	
	private void boardSolutions(){
		int [] board = {0,1,-1};
		this.solutions = board;
	}
	
	public int winner (HandOptions firstPlayer) {
		return this.solutions[firstPlayer.getOption()];			
	}
}
