package chapter13.backtracing;

public class Queen {

    private int row;
    private int column;

    public Queen(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public boolean attacks(Queen otherQueen){

        return this.row == otherQueen.row
                || this.column == otherQueen.column
                || Math.abs(this.row - otherQueen.row) == Math.abs(this.column - otherQueen.column);

    }

    public String toString(){
        return "" + "abcdefgh".charAt(column) + (row + 1);
    }

}
