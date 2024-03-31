package Games;
import java.util.Scanner;

public class TicTacToe {
    private static final char EMPTY = ' ';
    private static final char CROSS = 'X';
    private static final char NOUGHT = 'O';
    private char[][] board;
    private char currentPlayerMark;

    public TicTacToe() {
        board = new char[3][3];
        currentPlayerMark = CROSS;
        initializeBoard();
    }

    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    public void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkForWin() {
        return (checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin());
    }

    private boolean checkRowsForWin() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[i][0], board[i][1], board[i][2])) {
                return true;
            }
        }
        return false;
    }

    private boolean checkColumnsForWin() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[0][i], board[1][i], board[2][i])) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonalsForWin() {
        return ((checkRowCol(board[0][0], board[1][1], board[2][2])) || (checkRowCol(board[0][2], board[1][1], board[2][0])));
    }

    private boolean checkRowCol(char c1, char c2, char c3) {
        return ((c1 != EMPTY) && (c1 == c2) && (c2 == c3));
    }

    public void changePlayer() {
        currentPlayerMark = (currentPlayerMark == CROSS) ? NOUGHT : CROSS;
    }

    public boolean placeMark(int row, int col) {
        if ((row >= 0) && (row < 3)) {
            if ((col >= 0) && (col < 3)) {
                if (board[row][col] == EMPTY) {
                    board[row][col] = currentPlayerMark;
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        int row, col;
        do {
            System.out.println("Текущая доска:");
            game.printBoard();
            int player = (game.currentPlayerMark == CROSS) ? 1 : 2;
            System.out.println("Игрок " + player + ", введите строку и столбец (0, 1 или 2) для вашего хода:");
            row = scan.nextInt();
            col = scan.nextInt();
            while (!game.placeMark(row, col)) {
                System.out.println("Эта позиция уже занята или вне диапазона. Попробуйте еще раз:");
                row = scan.nextInt();
                col = scan.nextInt();
            }
            game.changePlayer();
        } while (!game.checkForWin() && !game.isBoardFull());
        game.printBoard();
        if (game.isBoardFull() && !game.checkForWin()) {
            System.out.println("Игра закончилась вничью!");
        } else {
            game.changePlayer();
            int player = (game.currentPlayerMark == CROSS) ? 1 : 2;
            System.out.println("Поздравляем, игрок " + player + " выиграл!");
        }
        scan.close();
    }
}