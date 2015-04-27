/**
   The abstract player class. All players implement these functions.
   All players can have a mark they use to mark the board with.
   Player classes must implement the playTurn method to be valid.
   
   @author Gabriel Anderson
   @since April 27, 2015
   @version 1.0
 */
public abstract class Player
{
   private Board.Cell mark;
   
   /**
      Constructs a player with an empty mark.
    */
   public Player()
   {
      mark = Board.Cell.EMPTY;
   }
   
   /**
      Set the players mark.
      @param mark The mark the player will use from now on.
    */
   public void setMark(Board.Cell mark)
   {
      this.mark = mark;
   }
   
   /**
      Get the players mark.
      @return The players mark.
    */
   public Board.Cell getMark()
   {
      return mark;
   }
   
   /**
      The method a player uses to change the board
      on their turn.
      @param board The board to play on.
    */
   public abstract void playTurn(Board board);
   
   
   /**
      A move a player may make.
    */
   public class Move
   {
      public int row;
      public int column;
      
      /**
         Create an object to store a move.
         @param row The row to mark.
         @param column The column to mark.
       */
      public Move(int row, int column)
      {
         this.row = row;
         this.column = column;
      }
   }
}