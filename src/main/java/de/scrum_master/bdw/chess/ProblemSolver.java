package de.scrum_master.bdw.chess;

/**
 * Created by mas on 13.12.13.
 */
public class ProblemSolver {
    public static int bestStepCount=64;
    public static final int numberOfRowsAndCols = 4;
    public static int [] startPos = {1,2};
    public int [] currPos = new int[2];

    public boolean [][] square = new boolean[numberOfRowsAndCols][numberOfRowsAndCols];




    public static void main(String[] args) {

        ProblemSolver ps = new ProblemSolver();
        // Startposition setzen
        ps.square[startPos[0]][startPos[1]]=true;
        ps.currPos=startPos;

    }


    public boolean moveToNextField(Heading h) {


        int new_x = currPos[0];
        int new_y = currPos[1];

        switch (h) {
          case NORTH: new_y=currPos[1]+1;
            break;

          case SOUTH: new_y=currPos[1]-1;
            break;

          case EAST: new_x=currPos[0]-1;
             break;

          case WEST: new_x=currPos[0]+1;
              break;
        }

        // Überprüfen, ob Feld bereits besucht
        if (square[new_x][new_y]) return false;

        // Überprüfen, ob berechnet Feld noch im Spielfeld liegt
        if (new_x>=numberOfRowsAndCols || new_x<0
                || new_y>=numberOfRowsAndCols || new_y<0) return false;


        currPos[0]=new_x;
        currPos[1]=new_y;

        square[new_x][new_y]=true;

        return true;
    }



}
