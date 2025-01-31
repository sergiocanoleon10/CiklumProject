/*All javascript functiones needed to update the counters, the data-table and keep info in localStorage & sessionStorage`*/

function count(){
   		
		let countPlayer = sessionStorage.getItem("countPlayer")==null?0:sessionStorage.getItem("countPlayer");
		let countGame = localStorage.getItem("countGame")==null?0:localStorage.getItem("countGame");
    	let roundMsg = "Rounds Played: ";
		let gameMsg = "Total Rounds Played: ";
    	
		document.getElementById('counter').innerHTML = roundMsg + countPlayer;
		document.getElementById('summary').innerHTML = gameMsg + countGame;
	}
	
	function showTable(playerOne,playerTwo,winner){
		
		/*Table Update*/
		var tableHTML = '<table class ="center"><tr><th>1st Player Choice</th><th>2nd Player Choice</th><th>And the winner is...</th></tr>';
		
		if ((playerOne && playerTwo && winner) || (sessionStorage.getItem("countPlayer")!=0 )){
			
			var tableHTML = '<table class ="center"><tr><th>1st Player Choice</th><th>2nd Player Choice</th><th>And the winner is...</th></tr>';
			let dataHTML  = '';
			
			if (sessionStorage.getItem("tableStorage")!=null && localStorage.getItem("tableStorage")!=''){
				dataHTML = sessionStorage.getItem("tableStorage");
			}
			
        	if (playerOne && playerTwo && winner) {
        		dataHTML += "<tr><td>"+ playerOne + "</td><td>"+ playerTwo + "</td><td>"+ winner + "</td></tr>";
        	}

        	tableHTML += dataHTML;
        	sessionStorage.setItem("tableStorage", dataHTML);
        }

        tableHTML += "</table>";
        document.getElementById("dataTable").innerHTML = tableHTML;

		/*LocalStorage Counters Update*/
		let countWin1 = localStorage.getItem("countWin1")==null?0:localStorage.getItem("countWin1");
		let countWin2 = localStorage.getItem("countWin2")==null?0:localStorage.getItem("countWin2");
		let countTies = localStorage.getItem("countTies")==null?0:localStorage.getItem("countTies");
		let winner1Msg = "Total Rounds won by Player1: ";
		let winner2Msg = "Total Rounds won by Player2: ";
		let tiesMsg = "Total Rounds Tied: ";
		
		if (playerOne && playerTwo && winner){
			
			switch (winner) {
				
  				case "Player 1 Wins!":
					countWin1 = Number(countWin1)+1;
					break;
				
				case "Player 2 Wins!":
					countWin2 = Number(countWin2)+1;
					break;
				
				case "Tie!":
					countTies = Number(countTies)+1;
					break;
			
			}
		}
		
		document.getElementById('player1wins').innerHTML = winner1Msg + countWin1;
		document.getElementById('player2wins').innerHTML = winner2Msg + countWin2;
		document.getElementById('ties').innerHTML = tiesMsg + countTies;
		localStorage.setItem("countWin1", countWin1);
		localStorage.setItem("countWin2", countWin2);
		localStorage.setItem("countTies", countTies);
	}
	
	function addOne(){
		
		let countPlayer = sessionStorage.getItem("countPlayer")==null?0:sessionStorage.getItem("countPlayer");
		let countGame = localStorage.getItem("countGame")==null?0:localStorage.getItem("countGame");
    	countPlayer=Number(countPlayer)+1;
		countGame=Number(countGame)+1;
    	sessionStorage.setItem("countPlayer", countPlayer);
		localStorage.setItem("countGame", countGame);
		
	}
	
	function deleteData(){
		
    	sessionStorage.setItem("countPlayer", "0");
    	sessionStorage.setItem("tableStorage", "");
	}
	
	