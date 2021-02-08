<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<script>
	window.onload = function() {
		let playerOne = '${player1}';
		let playerTwo = '${player2}';
		let winner    = '${winner}';
		count();
		showTable(playerOne,playerTwo,winner);
	}
	</script>
	
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Rock-Paper-Scissors</title>
		<script src="js/mainFuncRPS.js" type="text/javascript"></script>
		<link href="css/styles.css" type="text/css" rel="stylesheet" />
	</head>
	
	<body>
	
		<!-- Header Logo INI-->
		<div class="imgWrapper">
			<div class="logoImg">
				<img alt="Rock" src="img/rock.png">
			</div>
			<div class="logoImg">
				<img alt="Paper" src="img/paper.png">
			</div>
			<div class="logoImg">
				<img alt="Scissors" src="img/scissors.png">
			</div>
		</div>
		
		<div class="logoImgDown">
			<img alt="Hands" src="img/hands.png">
			<p  id="counter">Rounds Played: 0</p>
		</div>
		<!-- Header Logo END-->
		
		<!-- Counters INI -->
		<p  id="summary">Total Rounds Played: 0</p>
		<p  id="player1wins">Total Rounds won by Player1: 0</p>
		<p  id="player2wins">Total Rounds won by Player2: 0</p>
		<p  id="ties">Total Rounds Tied: 0</p>
		<!-- Counters END -->
		
		<!-- Buttons and Form INI -->
		<form action="${pageContext.request.contextPath}/playservlet" method="post">
			<div class="btnWrapper">
				<button type="submit" name="button" value="btnPlay" class="buttonPlay" onclick="addOne();">
					<img src="img/playBtn.png"/>Play Round!
				</button>
			</div>
			
			<div class="btnWrapper">
				<button type="submit" name="button" value="btnReset" class="buttonRestart" onclick="deleteData();">
					<img src="img/restart.png"/>Restart Game!
				</button>
			</div>
		</form>
		<!-- Buttons and Form END -->
		
		<!-- Table INI -->
		<div>
			 <jsp:include page="/WEB-INF/table.jsp"/> 
 		</div>
		<!-- Table END -->
		
	</body>
</html>