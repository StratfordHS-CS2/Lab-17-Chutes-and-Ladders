import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author (your name)
 * @version (date)
 */
public class CandLAnalyzer
{
    public static int[] playersLocations;  // keeps track of the current location of each player
    public static int totalTurns;  // the total number of turns taken in all games
    public static int minTurns;    // the minimum number of turns taken in all games
    public static int maxTurns;    // the maximum number of turns taken in all games

    /**
     *
     */
    public static int runGame( int numPlayers )
    {
        // the parameter 'numPlayers' is an integer containing the number of players in this game

        // Variables you might want:
        // keep track of whether or not the game is won
        // keep track of the number of turns taken in this game
        // initialize a new array of int as playerLocations

        // You'll likely use a while loop to keep the game going after each round,
        // and a for loop to cycle through the turns.

        // to get a random integer from 1-6 (including 6)
        // int spin = ThreadLocalRandom.current().nextInt(1,6+1);

        // I recommend a switch statement to adjust the location for ladders or slides before ending the turn

        // Recall: the 'break;' command will end a loop (either for or while) immediately.

        int turns = 0;


        return turns;
    }

    /**
     *
     * @param args not used
     */
    public static void main( String[] args )
    {
        Scanner kb = new Scanner( System.in );
        System.out.print("How many players (1-4)? ");
        int numPlayers = kb.nextInt();
        kb.nextLine();
        System.out.print("How many games should be run? ");
        int numGames = kb.nextInt();
        kb.nextLine();

        // you will need a loop to run all of the simulated games
        // and update the results.
        

        // After the loop, output the results.
    }
}
