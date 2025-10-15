package LLD_Question.TicTacToe;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

record KeyPair<K, V>(Integer K, Integer V) {
}

public class Board {
    int size;
    PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    public List<KeyPair<Integer, Integer>> getFreeCells() {
        List<KeyPair<Integer, Integer>> freeCells = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    freeCells.add(new KeyPair<>(i, j));
                }
            }
        }
        return freeCells;
    }

    public void printPath() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Print cell content or blank space
                String value = (board[i][j] != null) ? board[i][j].pieceType.name() : " ";

                // Each cell is printed in a fixed width (3 chars here)
                System.out.printf(" %s ", value);

                if (j < size - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();

            // Print separator line except after the last row
            if (i < size - 1) {
                System.out.println("---+---+---");
            }
        }
    }

    public boolean addPiece(int inputRow, int inputCol, PlayingPiece playingPiece) {
        if (board[inputRow][inputCol] != null) {
            return false;
        }
        board[inputRow][inputCol] = playingPiece;
        return true;
    }
}
