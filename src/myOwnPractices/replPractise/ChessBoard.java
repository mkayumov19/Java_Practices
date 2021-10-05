package myOwnPractices.replPractise;

import java.util.Arrays;

public class ChessBoard {
    public static void main(String[] args) {

        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < 8; i++) {
            char firstChar = 'a';
            for (int j = 0; j < 8; j++, firstChar++) {
                chessBoard[i][j] = (i + 1) + "" + firstChar;
            }
        }
        System.out.println(Arrays.deepToString(chessBoard));
    }

}
