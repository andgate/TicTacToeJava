import java.util.Random;

/**
   A smart computer.
      - Makes random moves.
      - Tries to win.
      - Tries to stop you from winning.
   Now sold in stores.
   
   @author Gabriel Anderson
   @since April 27, 2015
   @version 1.0
 */
public class SmartComputerPlayer extends RandomComputerPlayer
{
   private Random random;
   
   /**
      Create a smart computer player.
    */
   public SmartComputerPlayer()
   {
      super();
      random = new Random();
   }
   
   /**
      Plays a turn intelligently.
      @param board The 
    */
   @Override
   public void playTurn(Board board)
   {
      // Try playing intelligently.
      // If that fails, play like RandomComputerPlayer.
   }
   
   /**
      Tries to win, and block opponents win.
      @param board The board to play on.
      @return True if successful, false otherwise.
    */
   public boolean tryPlaySmartTurn(Board board)
   {
      // Get a winning move.
      // If there is one,
      // do it and return true.
      // Otherwise, return false.
   }
   
   /**
      Gets a winning move, if any.
      @param board The board to look at.
      @return The winning move.
    */
   private Move getWinningMove(Board board)
   {
      // Get the cells from the board.
      // Check to see if there are any two
      // in a row, column, or diagonal.
      // Return the remaining cell,
      // if there is.
      // Check for both Cell.CROSS and
      // Cell.CIRCLE. Going for a winning
      // move will either block the opponent
      // or win the game.
      return null;
   }
}