package LLD_Question.TicTacToe;

public class App {
    public static void main(String[] args) {
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        ticTacToeGame.initializeGame();
        System.out.println("Game winner is "+ticTacToeGame.startGame());
    }
}
