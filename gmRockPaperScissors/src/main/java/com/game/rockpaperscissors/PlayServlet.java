package com.game.rockpaperscissors;
/********************************************************************
* 	Servlet used for connect front end and back end. It listens to  *
*       		front (POST) queries								* 
********************************************************************/
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/playservlet")
public class PlayServlet extends HttpServlet{
	
	 
	private static final long serialVersionUID = 1L;

		@Override
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 	
			Game gameRound = new Game();
		 	String button = request.getParameter("button");
		 	String[] playRound= new String[3];
		 	
	        //Only you are going to play if the button pushed is the Play Button
		 	if ("btnPlay".equals(button)) {
		 		playRound= gameRound.gamePlay();
	        	
	        } 
		 	
		 	//Setters needed in front
	        request.setAttribute("player1", playRound[0]);
	        request.setAttribute("player2", playRound[1]);
	        request.setAttribute("winner", playRound[2]);
	        request.getRequestDispatcher("/WEB-INF/gameRPS.jsp").forward(request, response);
	    }
}


