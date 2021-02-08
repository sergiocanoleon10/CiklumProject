package com.game.rockpaperscissors;
/********************************************************************
* 	Enum with the options in the game: Rock, Paper or Scissors      *
*       															* 
********************************************************************/

public enum HandOptions {
		//Options from which to choose - index with numbers
		ROCK(0),
		PAPER(1),
		SCISSORS(2);
		
		public int option;
		//Methods that let number enum option (better usability)
		private HandOptions(int option) {
			this.option = option;
		}

		public int getOption() {
			return option;
		}
}
