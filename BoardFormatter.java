/**
   A class that turns a board into a string.
   This string is formatted for the command line.
   
   @author Gabriel Anderson
   @since April 27, 2015
   @version 1.0
 */
public class BoardFormatter
{
   // This requires 9 different strings
   // when formatted.
   private static final String BOARD_STRING
      = BOARD_ROW
      + ROW_SEPERATOR
      + BOARD_ROW
      + ROW_SEPERATOR
      + BOARD_ROW;
      
   private static final String ROW_SEPERATOR
      = "-----------\n";
      
   private static final String BOARD_ROW
      = " %s | %s | %s \n";
   
   /**
      Represent a board as a string to be displayed
      to a human.
      @param board The board to represent.
      @return The string representation of a board.
    */
   public static String format(Board board)
   {
      // Get the cells from the board.
      // Use the cells to format a provided board string.
      // Return the result.
   }
}