/**
   A TicTacToe board. Aggregates a 3x3 array of cells.
   Has utility functions for reading and marking the board.
   
   @author Gabriel Anderson
   @since April 27, 2015
   @version 1.0
 */
public class Board
{
   /**
      The Cell that makes up a board.
      Can either be EMPTY or marked with
      either a CIRCLE or a CROSS.
    */
   enum Cell {
     CROSS("X"),
     CIRCLE("O"),
     EMPTY("");
   
     // Member to hold the name
      private String string;
   
      // constructor to set the string
      private Cell(String name) { string = name; }
   
      // the toString just returns the given name
      public String toString() {
          return string;
      }
   }
   
   private Cell[][] cells;
   
   private static final int ROWS = 3;
   private static final int COLUMNS = 3;
   
   /**
      Constructs a board where the cells
      are all empty.
    */
   public Board()
   {
      cells = new Cell[ROWS][COLUMNS];
      // Clear the board.
      clear();
   }
   
   /**
      Set all the cells to empty.
    */
   public void clear()
   {
      // Loop through the rows
      // and the columns of the cells
      // and set each cell to Cell.EMPTY.
   }
   
   /**
      A helper function, to allow players to look
      at the board state.
      @return A 3x3 array of cells that make up the board.
    */
   public Cell[][] getCells()
   {
      return cells;
   }
   
   /**
      Mark a specific cell on the board.
      @param row The row of the cell to mark.
      @param column The column of the cell to mark.
      @param cell The cell to mark it as.
    */
   public void mark(int row, int column, Cell cell)
   {
      // Set the cell at the given row and column
      // to the value of the cell provided.
   }
   
   /**
      Checks if a specific cell is empty.
      @param row The row of the cell.
      @param column The column of the cell.
      @return True is the cell is empty, false if not.
    */
   public boolean isCellEmpty(int row, int column)
   {
      // Compare the given cell to the empty cell.
      // If this cell is empty, return true.
      // otherwise, return false.
      return false;
   }
   
   /**
      Checks if the board has an empty cell.
      @return True if there is an empty cell,
              false if the board is full.
    */
   public boolean hasEmptyCell()
   {
      // Loop through all the cells
      // if an empty tile is found, return true.
      // After the loop, return false.
      return false;
   }
}
