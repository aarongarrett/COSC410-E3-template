package edu.wofford;

import java.io.*;
import java.util.*;
 
public class Sudoku {
    /**
     * This is the size of the sudoku subsquare
     * (which also determines the size of the full board).
     */
    public static final int SIZE = 2;
    
    /**
     * This is the actual sudoku board, where 0s represent
     * locations that have not been filled yet.
     */
    private int[][] board;


    /**
     * Thse are convenience methods that you may use if you
     * choose. They each get the actual non-zero values 
     * from the specified row, column, or subsquare and
     * return those values as sets.
     */
    private Set<Integer> getRowValues(int row) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < board[row].length; i++) {
            if(board[row][i] > 0) set.add(board[row][i]);
        }
        return set;
    }

    private Set<Integer> getColValues(int col) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < board.length; i++) {
            if(board[i][col] > 0) set.add(board[i][col]);
        }
        return set;
    }

    private Set<Integer> getSubsquareValues(int subrow, int subcol) {
        Set<Integer> set = new HashSet<>();
        int[][] subsquare = getSubsquare(subrow, subcol);
        for(int i = 0; i < subsquare.length; i++) {
            for(int j = 0; j < subsquare[i].length; j++) {
                if(subsquare[i][j] > 0) set.add(subsquare[i][j]);
            }
        }
        return set;
    }

    /**
     * DO NOT MODIFY THIS CONSTRUCTOR.
     * IT IS FOR THE UNIT TESTS.
     */
    public Sudoku(int[][] board) {
        this.board = board;
    }
    public void setNumber(int row, int col, int val) {
        board[row][col] = val;
    }


    /**
     * This constructor should read from the file specified
     * by "filename". That file would look similar to the
     * following:
     * 
     *    3**2
     *    *4**
     *    **3*
     *    *32*
     * 
     * The asterisks represent unknown locations (and should
     * be stored as 0 values in the board).
     */
    public Sudoku(String filename) {
        // Question 1 (a)
        // TODO
        
    }
    
    /**
     * This function should return the number on the board
     * at the given (row, col) location.
     */
    public int getNumber(int row, int col) {
        // Question 1 (b)
        // TODO
        
        return 0;
    }
    
    /**
     * This function should return the two-dimensional array
     * representing the specified subsquare. This array should
     * always be SIZE x SIZE.
     * 
     *    3**2
     *    *4**
     *    **3*
     *    *32*
     * 
     * For the above board, there are 4 subsquares:
     *    3*|*2
     *    *4|**
     *    -----
     *    **|3*
     *    *3|2*
     * 
     * (0, 0) ==> 3*
     *            *4
     * 
     * (0, 1) ==> *2
     *            **
     * 
     * (1, 0) ==> **
     *            *3
     * 
     * (1, 1) ==> 3*
     *            2*
     * 
     * Remember that asterisks represent 0 values.
     */
    public int[][] getSubsquare(int subrow, int subcol) {
        // Question 2
        // TODO
        
        int[][] subsquare = new int[SIZE][SIZE];
        return subsquare;
    }
    
    /**
     * This function should return the sum of the given row.
     */
    public int getRowSum(int row) {
        // Question 3
        // TODO
        
        int sum = 0;
        return sum;
    }
    
    /**
     * This function should return the sum of the given column.
     */
    public int getColSum(int col) {
        // Question 4
        // TODO
        
        int sum = 0;
        return sum;
    }
    
    /**
     * This function should return true if the given val
     * is a legal value for the (row, col) location.
     * A value is legal in a location if the location does
     * not already have a value (i.e., is 0) and if the value
     * does not already exist in that row, column, or subsquare.
     * 
     * The function should return false, otherwise.
     */
    public boolean isLegal(int row, int col, int val) {
        // Question 5
        // TODO
        
        return false;
    }
}