package LLD_Question.SnakerNLadder;


import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Board board;
    Dice dice;
    Deque<Player> playerList = new LinkedList<>();
    Player winner;

    public Game() {
        initializeGame();
    }

    private void initializeGame() {
        board = new Board(10, 4, 4);
        dice = new Dice(1);
        winner = null;
        addPlayer();
    }

    private void addPlayer() {
        Player p1 = new Player("p1", 0);
        Player p2 = new Player("p1", 0);
        playerList.add(p1);
        playerList.add(p2);
    }

    public void startGame() {
        while (winner == null) {
            // get the current player
            Player playerTurn = playerList.removeFirst();
            playerList.addLast(playerTurn);
            System.out.println(playerTurn.id + " this is your turn , current position is " + playerTurn.currPos);

            // roll the dice
            int diceNumbers = dice.rollDice();

            // move the player to new position
            int playerNewPosition = playerTurn.currPos + diceNumbers;
            playerNewPosition = jumpCheck(playerNewPosition);
            playerTurn.currPos = playerNewPosition;

            System.out.println(playerTurn.id + " this " + playerNewPosition + " is your new position is ");

            // check for winning condition
            if (playerNewPosition >= board.cells.length * board.cells.length - 1) {
                winner = playerTurn;
            }
        }
        System.out.println("WINNER IS : " + winner.id);
    }

    private int jumpCheck(int playerNewPosition) {
        if (playerNewPosition > board.cells.length * board.cells.length - 1) {
            return playerNewPosition;
        }
        Cell cell = board.getCell(playerNewPosition);
        // here we are checking the new position where player is, is there any ladder or snake
        if (cell.jump != null && cell.jump.start == playerNewPosition) {
            // check if it is ladder or snake
            String jumpBy = cell.jump.start < cell.jump.end ? "ladder" : "snake";
            System.out.println("Jump done by " + jumpBy);
            return cell.jump.end;
        }
        return playerNewPosition;
    }
}
