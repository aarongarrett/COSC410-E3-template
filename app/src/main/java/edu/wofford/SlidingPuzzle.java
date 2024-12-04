package edu.wofford;

import java.awt.Point;

public class SlidingPuzzle {
    public enum Direction {N, S, E, W};

    private int[][] tiles;
    private Point blank;

    public SlidingPuzzle() {
        this(new int[][] {{8, 6, 7}, {5, 3, 0}, {1, 2, 4}});
    }
    
    public SlidingPuzzle(int[][] initial) {
        tiles = new int[initial.length][initial[0].length];
        for(int i = 0; i < tiles.length; i++) {
            System.arraycopy(initial[i], 0, tiles[i], 0, initial[i].length);
        }
        blank = findBlankTile();
    }

    public int getTile(int row, int col) {
        return tiles[row][col];
    }



    // Question 1
    // This method returns the location of the "blank" tile
    // (i.e., the one marked as a 0). If there is no blank 
    // tile on the board, it throws a RuntimeException.
    // The point should be (row, column).
    public Point findBlankTile() {
        throw new RuntimeException("puzzle must have 0");
    }

    // Question 2
    // This method returns the point neighboring the
    // given point in the given direction. For instance,
    // getNeighbor(new Point(0, 1), Direction.S) would
    // return the point (1, 1). Likewise,
    // getNeighbor(new Point(0, 1), Direction.E) would
    // return the point (0, 2) and
    // getNeighbor(new Point(0, 1), Direction.N) would
    // return the point (-1, 1).
    // This last point is not actually a valid board
    // position, but this method is not concerned with
    // that. (There's a private method for that issue.)
    public Point getNeighbor(Point p, Direction d) {
        return p;
    }

    // Question 3
    // This method moves the "blank" tile in the given
    // direction, swapping it with whatever is in that
    // location. If there is no tile in that direction
    // (because it's off the board), this function 
    // should not change anything.
    public void slide(Direction d) {

    }

    // Question 4
    // This method returns TRUE if the puzzle is solved,
    // meaning that the numbered tiles are in order
    // (left to right, top to bottom)
    // starting from the upper-left, and the blank tile
    // is in the bottom right position.
    public boolean isSolved() {
        return false;
    }

    // Question 5
    // This method retuns the string representation of the
    // puzzle. The string representation of a solved puzzle
    // would look as follows:
    //
    // +-----+
    // |1|2|3|
    // +-----+
    // |4|5|6|
    // +-----+
    // |7|8| |
    // +-----+
    //
    // The blank tile should simply be a space, while the
    // numbered tiles should show their numbers. There should
    // NOT be a newline at the very end.
    public String toString() {
        return "";
    }



    // These are private convenience functions that
    // you might find useful.
    
    private boolean isValid(Point p) {
        return p.x >= 0 && p.x < tiles.length && 
               p.y >= 0 && p.y < tiles[p.y].length;
    }

    private void slide(Point from, Point to) {
        int temp = tiles[from.x][from.y];
        tiles[from.x][from.y] = tiles[to.x][to.y];
        tiles[to.x][to.y] = temp;
    }
}