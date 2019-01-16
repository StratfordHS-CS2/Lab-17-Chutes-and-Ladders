[![Build Status](https://travis-ci.com/StratfordHS-CS2/lab-17-chutes-and-ladders-username.svg)](https://travis-ci.com/StratfordHS-CS2/lab-17-chutes-and-ladders-username)

# Lab 17 - Chutes and Ladders Analyzer

## Lab Goal
You will simulate games of Chutes and Ladders and report on the minimum, maximum, and average number of turns it takes to finish a game.

## Instructions
* Complete the method `runGame`. This is where a complete game of Chutes and Ladders is simulated.  This returns the number of turns it took to finish the game.  I would suggest using a `switch` statement to check to if the player landed on a chute or a ladder and their location accordingly.
* Complete the method `main`. This method already prompts the user for the number of players and the number of games.  You need to add a loop that will repeatedly call `runGame` and update the results accordingly.  After all of the games have been simulated output the results.
* Complete all javadoc comment with the proper tags.
* There are no tests to be run on this.  I will have to grade it manually.

## Rules of Chutes and Ladders
* All players start at location 0 (not on the board yet) and spin a spinner with the numbers 1-6 on it. The player moves the appropriate number of spaces.
* If a player lands on the base of the ladder, the player climbs to the top of the ladder to complete their turn.
* If a player lands on the top of a slide, the player slides to the bottom of the slide to complete their turn.
* To end the game, a player must land exactly on square 100.  If a spin takes them past square 100 they don't move and it is the next player's turn.
* See the included game_board.gif to see what the game board looks like.

![game-board](game_board.gif)

## Sample Output
```
How many players (1-4)? 4
How many simulations should be run? 100

Chutes and Ladders Simulator
Number of Players = 4
Number of Games = 100
Average game length = 71 turns
Minimum game length = 26 turns
Maximum game length = 171 turns
```

## Notes
* The Checkstyle config url is http://www.daveavis.com/cs/checkstyle_SHS.xml
* Make sure you modify the link at the top of your **Readme.md** to reflect your username if you want the badge at the top to represent the status of your code.

## Grading
* 90 - Works Completely
* 10 - style

Note that these are potential maximums; the computer can only check so much.  If your code passes Checkstyle, but I see non-descriptive variable names, then your style grade will go down.  If your code passes all tests, but I see code that was copied off of the internet or from another student your grade will go *way* down.
