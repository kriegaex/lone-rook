package de.scrum_master.bdw.chess;

public interface Path extends Cloneable {
	Path clone() throws CloneNotSupportedException;
	void push(int x, int y);
	int[] pop();
	int[] peek();
	int getSteps();
	int getMoves();
	int[][] toOptimisedArray();
}
