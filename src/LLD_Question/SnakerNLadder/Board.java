package LLD_Question.SnakerNLadder;

import java.util.Random;

public class Board {
    Cell[][] cells;

    public Board(int boardSize, int noOfSnake, int noOfLader) {
        initializeBoard(boardSize);
        addSnakeAndLadders(noOfSnake, noOfSnake);
    }

    private void initializeBoard(int boardSize) {
        cells = new Cell[boardSize][boardSize];
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                Cell cell = new Cell();
                cells[i][j] = cell;
            }
        }
    }

    private void addSnakeAndLadders(int noOfSnake, int noOfLader) {
        int totalCells = cells.length * cells.length;
        while (noOfSnake > 0) {
            int snakeHead = new Random().nextInt(totalCells);
            int snakeTail = new Random().nextInt(totalCells - snakeHead);

            if (snakeTail >= snakeHead) {
                continue;
            }
            // created the Jump object
            Jump snakeObj = new Jump();
            snakeObj.start = snakeHead;
            snakeObj.end = snakeTail;

            // Get the particular cell from board based on snakeHead and snakeTail
            Cell cell = getCell(snakeHead);
            cell.jump = snakeObj;
            noOfSnake--;
        }

        while (noOfLader > 0) {
            int ladderEnd = new Random().nextInt(totalCells);
            int ladderStart = new Random().nextInt(totalCells - ladderEnd);

            if (ladderStart >= ladderEnd) {
                continue;
            }
            // create the Jump object
            Jump laderObj = new Jump();
            laderObj.start = ladderStart;
            laderObj.end = ladderEnd;

            // Get the particular cell from board based on laderStart and laderEnd
            Cell cell = getCell(ladderStart);
            cell.jump = laderObj;
            noOfLader--;

        }
    }

    public Cell getCell(int pos) {
        int boardRow = pos / cells.length;
        int boardCol = pos % cells.length;
        return cells[boardRow][boardCol];

    }
}
