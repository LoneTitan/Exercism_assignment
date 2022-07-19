public class Queen {
    int row;
    int column;
    Queen(int row, int column){
        this.row = row;
        this.column = column;

        if( column > 7 ||  column > 7){
            throw new IllegalArgumentException("Queen position must have column <= 7.");
        }
        if( row > 7 ||  row > 7){
            throw new IllegalArgumentException("Queen position must have row <= 7.");
        }
        if( column < 0 ||  column < 0){
            throw new IllegalArgumentException("Queen position must have positive column.");
        }
        if( row < 0 ||  row < 0){
            throw new IllegalArgumentException("Queen position must have positive row.");
        }

    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}
