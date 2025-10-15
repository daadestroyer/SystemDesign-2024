package LLD_Question.TicTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    Deque<Player> playerList;
    Board gameBoard;

    public void initializeGame() {
        // create two players
        playerList = new LinkedList<>();
        Player player1 = new Player("Player 1", new PlayingPieceO()); // O
        Player player2 = new Player("Player 2", new PlayingPieceX()); // X

        playerList.add(player1);
        playerList.add(player2);

        // initialize board
        this.gameBoard = new Board(3); // 3 X 3 Board
    }

    public String startGame() {
        boolean isThereAWinner = false;
        while (isThereAWinner == false) {
            // take out one player
            Player playerTurn = playerList.removeFirst();

            // print the board
            System.out.println();
            System.out.println();
            gameBoard.printPath();
            List<KeyPair<Integer, Integer>> freeCells = gameBoard.getFreeCells();

            // if no free cells left, declare a tie
            if (freeCells.isEmpty()) {
                isThereAWinner = true;
                continue;
            }

            // Read the user input
            Scanner sc = new Scanner(System.in);
            System.out.println("Player : " + playerTurn.name + " Enter Row Number : ");
            int inputRow = sc.nextInt();
            System.out.println("Player : " + playerTurn.name + " Enter Col Number : ");
            int inputCol = sc.nextInt();

            // place the piece
            boolean isPieceAdded = gameBoard.addPiece(inputRow, inputCol, playerTurn.playingPiece);

            if (!isPieceAdded) {
                //player cannot insert the piece into this cell, player has to choose another cell
                System.out.println("Incorrect position chosen, try again");
                playerList.addFirst(playerTurn);
                continue;
            }
            playerList.addLast(playerTurn);

            Boolean winner = isThereAWinner(inputRow, inputCol, playerTurn.playingPiece.pieceType);
            if (winner) {
                return playerTurn.name;
            }
        }
        return "tie";
    }

    private Boolean isThereAWinner(int inputRow, int inputCol, PieceType pieceType) {
        boolean rowMatch = true;
        boolean colMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        // row check
        for (int i = 0; i < gameBoard.size; i++) {
            if (gameBoard.board[inputRow][i] == null || gameBoard.board[inputRow][i].pieceType != pieceType) {
                rowMatch = false;
            }
        }
        // col check
        for (int i = 0; i < gameBoard.size; i++) {
            if (gameBoard.board[i][inputCol] == null || gameBoard.board[i][inputCol].pieceType != pieceType) {
                colMatch = false;
            }
        }
        // diagonal match
        for (int i = 0, j = 0; i < gameBoard.size; i++, j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                diagonalMatch = false;
            }
        }
        // anti diagonal match
        for (int i = 0, j = gameBoard.size - 1; i < gameBoard.size; i++, j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
            }
        }
        return rowMatch || colMatch || diagonalMatch || antiDiagonalMatch;
    }
}
