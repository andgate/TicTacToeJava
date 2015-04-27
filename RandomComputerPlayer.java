import java.util.Random;

/**
   A simple computer player that will just randomly
   marks an empty cell every turn. Does not even try to win.
   
   @author Gabriel Anderson
   @since April 27, 2015
   @version 1.0
 */
public class RandomComputerPlayer extends Player
{
   private Random random;
   
   /**
      Constructs a computer player
      that marks empty tiles at random.
    */
   public RandomComputerPlayer()
   {
      random = new Random();
   }
   
   /**
      Constructs a computer player
      that marks empty tiles in a
      seeded random fashion.
      @param seed The seed for the random set of picks.
    */
   public RandomComputerPlayer(long seed)
   {
      random = new Random(seed);
   }

   /**
      Marks a random tile.
    */
   @Override
   public void playTurn(Board board)
   {
      // Mark a random cell on the board
   }
   
   /**
      Marks a random empty cell on the give board.
      @param board The board to mark.
    */
   private void markRandom(Board board)
   {
      // Try to mark a random, empty cell,
      // until one is marked.
      // Use a while loop to accomplish this.
   }
   
   /**
      Attempts to mark a random cell on the
      given board.
      @param board The board to try and mark.
      @return True on success, false on failure.
    */
   private boolean tryMarkRandom(Board board)
   {
      // Generate two values, between 0 and 3.
      // These will be the row and column to mark.
      // Check the row and column, on the board.
      // If it is empty, mark it with this players mark,
      // and return true.
      // If it is not empty, return false.
   }
}