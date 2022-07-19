public class QueenAttackCalculator {
    private final Queen queenA;
    private final Queen queenB;
    public QueenAttackCalculator(Queen queenA, Queen queenB) {
        if (queenA == null || queenB == null) {
            throw new IllegalArgumentException("You must supply valid positions for both Queens.");
        }
        if (queenA.getRow() == queenB.getRow() && queenA.getColumn() == queenB.getColumn()) {
            throw new IllegalArgumentException("Queens cannot occupy the same position.");
        }
        if( queenA.getColumn() > 7 ||  queenB.getColumn() > 7){
            throw new IllegalArgumentException("Queen position must have column <= 7.");
        }
        if( queenA.getRow() > 7 ||  queenB.getRow() > 7){
            throw new IllegalArgumentException("Queen position must have row <= 7.");
        }
        if( queenA.getColumn() < 0 ||  queenB.getColumn() < 0){
            throw new IllegalArgumentException("Queen position must have positive column.");
        }
        if( queenA.getRow() < 0 ||  queenB.getRow() < 0){
            throw new IllegalArgumentException("Queen position must have positive row.");
        }
        this.queenA = queenA;
        this.queenB = queenB;
    }
    public boolean canQueensAttackOneAnother() {
        boolean result = queenA.getRow() == queenB.getRow();
        // same row
        // same column
        if (queenA.getColumn() == queenB.getColumn()) {
            result = true;
        }
        // same diagonal
        int x = Math.abs(queenA.getRow() - queenB.getRow());
        int y = Math.abs(queenA.getColumn() - queenB.getColumn());
        if (x == y) {
            result = true;
        }
        return result;
    }
}