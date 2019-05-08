# Tennis

The scoring system is rather simple:

1. Each player can have either of these points in one game 0 15 30 40

2. If you have 40 and you win the ball you win the game, however there are special rules.

3. If both have 40 the players are deuce. a. If the game is in deuce, the winner of a ball will have advantage and game ball. b. If the player with advantage wins the ball he wins the game c. If the player without advantage wins they are back at deuce.

Below are the possible scenarios considered when we translate the above rules for this KATA.

	Player1	Player2	  score	              Winner
	0	        0	       0/0	
	0	        1	       0/15	
	0 	      	2	       0/30	
	0	        3	       0/40	
	0	        4		                        player2

	1	        0	      15/0	
	2	        0	      30/0	
	3	        0	      40/0	
	4	        0		                        Player 1
	
	1	        0	      15/0	
	1	        1	      15/15	
	2	        1	      30/15	
	2	        2	      30/30	
	3	        2	      40/30	
	3	        3	      deuce	
	3	        3+1	   advantage	
	
option1

  	3	      3+1+1		                       Player 2
	
option2	

 	3+1	    3+1	       	      deuce	
	3+1+1 	    3+1			                       Player1
				
				

