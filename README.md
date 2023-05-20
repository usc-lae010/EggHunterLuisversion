# EggHunterLuisversion
EggHunt is a 2D game in a 10 x 10 grid maze map. The goal is to move the player around in the map to collect all Easter eggs and leave the map at the exit door within the time limit.  
To simplify the design, we assume each movement, or a step, of the play equals to one time unit. The maze map consists of the following items: 
1.An entrance to the maze, which is located at the bottom left cell. 
2.An exit of the maze, which is located at the top right cell. 
3.A player, who is placed at the entrance at the beginning of a game. 
4. 5 Eater eggs, each of which is placed at a random cell. 
6. keys, each of which is placed at a random cell. 
7.Some locks, each of which is placed at a random cell. The player cannot move to a cell with a lock unless the player has a key. 

 

The followings are its key features and settings. 

To start a new game:  

The player inputs an integer d in a text field to set up the difficulty level of the game. d should be in the range of 0 – 10, and it has the default value of 5. 

The player clicks a “Run” button to start the game, which triggers the random generation of the map. 

 

Random generation of the map: 

*An entrance cell is placed at the bottom left cell. 
*An exit cell is placed at the top right cell. 
*A time limit, which is initially set up as 100 steps. 
*The player will appear in the entrance cell with the step counter as “0”. 

*5 eggs are placed randomly in the map. 

* 'd' locks are placed randomly in the map. 

*5 keys are placed randomly in the map. 

* The entrance, exit, eggs, locks, and keys should not overlap. 

 
To play a game: 

The player can move in 4 directions: left, right, up, and down inside the map. Each movement is considered as 1 step. 
Visiting an egg collects 1 egg. The egg is picked up, and the cell becomes empty. 
Visiting a key collects 1 key. The key is picked up, and the cell becomes empty. The number of keys that the player has increases by 1. 
The player can only move into a lock when the play has one or more keys. 
Once moving into a lock, one key is consumed. As a result, the number of keys that the player has decreases by 1 and the lock in the cell disappears (empty cell).  

The game finishes when  

(Win) The player collects all 5 eggs and is at the exit cell. The score is: (time limit – steps of the player). 
(Lose) The time limit has reached. The score is -1. 
The score is shown at the end of a game. 
players quits

 

Other requirements: 

*The game can be played in the text UI in which the interaction is enabled by typing keywords, e.g. “u” for up and “d” for down. 
In the GUI,  
*Different types of items should be displayed with different icons/symbols. 
*Time limit of the map is displayed and updated during the play. 
*Total number of steps of the player is displayed and updated during the play. 
*The number of collected eggs is displayed and updated during the play. 
*The number of keys that the player has is displayed and updated during the play. 
*A player can play by clicking 4 control buttons. 
*A “Help” button to get instructions on the game play. 
*A “Save” button to save the game play into a file. 
*A “Load” button to load a saved game. 

 
It is recommended that you implement the 'engine' of the game first. 

Then you can use JavaFX to add a graphical user interface (GUI) to your game, which displays the 2D board and allows the user to play the game.  
You MUST use JavaFX, not any other Java GUI libraries. 
