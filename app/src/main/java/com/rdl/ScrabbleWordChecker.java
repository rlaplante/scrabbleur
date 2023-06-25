package com.rdl;

public class ScrabbleWordChecker {
    private static final int BOARD_SIZE = 15;
    private static final char BLANK_TILE = '_'; // Placeholder for a blank tile
    
    private char[][] board = new char[BOARD_SIZE][BOARD_SIZE];
    
    public boolean canFormWord(String word) {
        char[] letters = word.toCharArray();
        
        // Check if the word length is 7
        if (letters.length != 7) {
            return false;
        }
        
        // Check if the word can be formed using the available letters on the board
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                // Check if the board cell is empty or contains a blank tile
                if (board[row][col] == '\u0000' || board[row][col] == BLANK_TILE) {
                    // Check if the word can be placed horizontally at this position
                    if (canPlaceWordHorizontally(row, col, letters)) {
                        return true;
                    }
                    
                    // Check if the word can be placed vertically at this position
                    if (canPlaceWordVertically(row, col, letters)) {
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
    
    private boolean canPlaceWordHorizontally(int row, int col, char[] word) {
        // Check if the word can be placed horizontally at the given position
        if (col + word.length <= BOARD_SIZE) {
            for (int i = 0; i < word.length; i++) {
                char boardTile = board[row][col + i];
                if (boardTile != '\u0000' && boardTile != word[i]) {
                    return false;
                }
            }
            
            return true;
        }
        
        return false;
    }
    
    private boolean canPlaceWordVertically(int row, int col, char[] word) {
        // Check if the word can be placed vertically at the given position
        if (row + word.length <= BOARD_SIZE) {
            for (int i = 0; i < word.length; i++) {
                char boardTile = board[row + i][col];
                if (boardTile != '\u0000' && boardTile != word[i]) {
                    return false;
                }
            }
            
            return true;
        }
        
        return false;
    }
    
    // Other methods for setting up the board and placing tiles omitted for brevity
    
    public static void main(String[] args) {
        // Create an instance of ScrabbleWordChecker
        ScrabbleWordChecker wordChecker = new ScrabbleWordChecker();
        
        // Set up the Scrabble board and place existing tiles
        
        // Check if a word can be formed with 7 letters
        String word = "example";
        boolean canFormWord = wordChecker.canFormWord(word);
        System.out.println("Can form word '" + word + "': " + canFormWord);
    }
}