package de.scrum_master.bdw.chess;

/**
 * Created by mas on 13.12.13.
 */
public class MyChessBoard implements ChessBoard {

    public static final int numberOfRowsAndCols = 4;

    public boolean [][] square = new boolean[numberOfRowsAndCols][numberOfRowsAndCols];

    MyChessBoard() {
/*
        Initialisierung des Spielfeld
        for (int i=0; i<numberOfRowsAndCols; i++){

            for (int j=0; j<numberOfRowsAndCols; j++) {
                square[i][j]=false;
            }
        }
*/
    }

    @Override
    public void displayPath() {

    }

    @Override
    public void setPath(int[][] path) {

    }

    @Override
    public int[][] getPath() {
        return new int[0][];
    }
}
