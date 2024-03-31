package Games;

import java.util.Scanner;
import java.util.Random;

public class PyatnashkiGame {
    private static final int SIZE = 4;
    private static final int[][] board = new int[SIZE][SIZE];
    private static final int EMPTY_SPACE = 0;
    private static int emptyI, emptyJ;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initializeBoard();
        shuffleBoard();
        printBoard();

        while (!isSolved()) {
            System.out.println("Введите 'w', 's', 'a' или 'd' для перемещения пустой ячейки вверх, вниз, влево или вправо соответственно:");
            String move = scanner.nextLine();
            if (isValidMove(move)) {
                makeMove(move);
                printBoard();
            } else {
                System.out.println("Невозможный ход. Попробуйте снова.");
            }
        }

        System.out.println("Поздравляем! Вы решили головоломку!");
        scanner.close();
    }

    private static void initializeBoard() {
        int num = 1;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = num++;
            }
        }
        emptyI = SIZE - 1;
        emptyJ = SIZE - 1;
        board[emptyI][emptyJ] = EMPTY_SPACE;
    }

    private static void shuffleBoard() {
        Random random = new Random();
        for (int i = 0; i < SIZE * SIZE; i++) {
            int x1 = random.nextInt(SIZE);
            int y1 = random.nextInt(SIZE);
            int x2 = random.nextInt(SIZE);
            int y2 = random.nextInt(SIZE);

            int temp = board[x1][y1];
            board[x1][y1] = board[x2][y2];
            board[x2][y2] = temp;
        }
// Ensure the empty space is not in the solved position
        if (isSolved()) {
            int temp = board[0][0];
            board[0][0] = board[SIZE - 1][SIZE - 1];
            board[SIZE - 1][SIZE - 1] = temp;
        }
    }

    private static boolean isSolved() {
        int num = 1;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] != num && (i != SIZE - 1 || j != SIZE - 1)) {
                    return false;
                }
                num++;
            }
        }
        return true;
    }

    private static void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == EMPTY_SPACE) {
                    System.out.print("   ");
                } else {
                    System.out.printf("%2d ", board[i][j]);
                }
            }
            System.out.println();
        }
    }

    private static boolean isValidMove(String move) {
        switch (move) {
            case "w": return emptyI < SIZE - 1;
            case "s": return emptyI > 0;
            case "a": return emptyJ < SIZE - 1;
            case "d": return emptyJ > 0;
            default: return false;
        }
    }

    private static void makeMove(String move) {
        int newI = emptyI, newJ = emptyJ;
        switch (move) {
            case "w": newI++; break;
            case "s": newI--; break;
            case "a": newJ++; break;
            case "d": newJ--; break;
        }
        board[emptyI][emptyJ] = board[newI][newJ];
        board[newI][newJ] = EMPTY_SPACE;
        emptyI = newI;
        emptyJ = newJ;
    }
}