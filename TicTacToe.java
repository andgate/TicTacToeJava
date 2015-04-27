/**
   Tic Tac Toe, probably one of the worst games ever made.
   This object allows two players to play that vile game.
   Be them humans or machines, both must suffer for what
   will most likely be a tied game.
   All that this game requires is two players, nothing more.
   A board can be drawn in the sand.
   Let the battles begin.
   

   @author Gabriel Anderson
   @since April 27, 2015
   @version 1.0
 */
public class TicTacToe
{
   private Board board;
   private Player player1;
   private Player player2;
   
   private boolean isGameOver;
   
   /**
      Construct a TicTacToe game.
      @param player1 The first player.
      @param player2 The second player.
    */
   public TicTacToe(Player player1, Player player2)
   {
      board = new Board();
      this.player1 = player1;
      this.player2 = player2;
      isGameOver = false;
   }
   
   /**
      Plays a game of tic tac toe.
      The player who goes first is decided at random.
      
    */
   public void play()
   {
      // Start the game.
      // Play the game.
      // End the game.
   }
   
   /**
     Sets up a game of tictactoe. 
    */
   private void startGame()
   {
      // Call the assign turns method.
   }
   
   /**
      Assign turns and marks to players.
    */
   private void assignTurns()
   {
      // Flip a coin, determine who goes first.
      // First player gets X, second player gets O.
   }
   
   /**
      Plays a game until a win or tie has been acheived.
    */
   private void playGame()
   {
      // While the game is not over
      // tell the next player to play.
      // After each turn, print new board.
   }
   
   /**
      Announce the the current turn to the console.
    */
   private void announceTurn()
   {
      // If it's player1's turn,
      // announce that.
      // If it's player2's turn
      // announce that.
   }
   
   /**
      Check to see if the game is still playable.
      @return True is the game has more moves, false otherwise.
    */
   private boolean checkGameOver()
   {
      // Asks the board
      // if there are any empty tiles
      // and if there are any three-in-a-rows.
      return false;
   }
   
   /**
      Plays one turn of a game.
      Prints the results of the turn to the console.
    */
   private void playTurn()
   {
      // Tell the current player to play their turn
      // with a given board.
      
      // Print the board.
      // If there is a winner or a tie,
      // Then end the game.
   }
   
   /**
      Reports winner to console,
      updats player scores,
      and logs the winner in the game log.
    */
   private void end()
   {
      // Ask the board for the winning mark.
      // If there is no winning mark (Cell.Empty)
      // print that it was a tie.
      // Else if it belongs to player one, report it.
      // Else then player two won, so report that.
   }
}