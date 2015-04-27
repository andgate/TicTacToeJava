import java.util.Scanner;

/**
   A human player will ask the human
   on the console for the next move.
   The game will be unable to progress
   until it is given a valid move.
   
   @author Gabriel Anderson
   @since April 27, 2015
   @version 1.0
 */
public class HumanPlayer extends Player
{
   private Scanner in;
   
   /**
      Constructs a human player,
      that asks the human at the console
      to decide moves.
    */
   public HumanPlayer()
   {
      super();
      in = new Scanner(System.in);
   }
   
   /**
      Asks a human to pick a row and column,
      and then marks that with this players mark.
    */
   @Override
   public void playTurn(Board board)
   {
      // Try to play a turn until it is successful.
   }
   
   /**
      Attempts to play the players turn.
      @param board The board to play with.
      @return True if the turn was successful
              and the board was mark,
              false otherwise.
    */
   public boolean tryPlayTurn(Board board)
   {
      // Ask for a move.
      // If the move is valid
      // mark the board and return true.
      // otherwise
      // Tell the player and return false.
      return false;
   }
   
   /**
      Asks the human for a move.
      @return The move to make.
    */
   private Move askMove()
   {
      // Try to ask move.
      // While the move given is null
      // keep trying.
      // Finally, return the move.
      return null;
   }
   
   /**
      Tries to ask the human for a move.
      @return The move to make, maybe null
              if a bad input was given.
    */
   private Move tryAskMove()
   {
      // Use a scanner called in
      // Ask the player for a move.
      // Get two int values from the scanner.
      // If that fails, return null.
      return null;
   }
   
   /**
      Check a move for validity.
      A valid move marks a cell that is empty
      and is on the board.
      @param board The board to check with.
      @param move The move to check.
    */
   private boolean validateMove(Board board, Player.Move move)
   {
      // If the move is out of range,
      // report that and return false.
      // If the board is already marked there,
      // report that and return false.
      
      // Otherwise, return true
      return false;
   }
}