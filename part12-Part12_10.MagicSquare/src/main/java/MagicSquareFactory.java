
public class MagicSquareFactory {
    private MagicSquare square;
    private int row;
    private int column;
    public MagicSquare createMagicSquare(int size) {

        this.square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        this.row = 0;
        this.column = size/2;
        int val = 1;
        while (true) {
            placeValue(val);
            if (allFilled()) {
                break;
            }
            val+=1;
            this.row = this.moveRow();
            this.column = this.moveColumn();
        }
        return square;
    }
    
    public void placeValue(int val) {
        if (emptyPos(column, row)) {
            this.square.placeValue(column, row, val);
            return;
        }
        
        if (!emptyPos(column, row)) {
            row = row + 2;
            column = column - 1;
            if (row > this.square.getHeight()) {
                row = row - this.square.getHeight();
            }
            if (column < 0) {
                column = this.square.getWidth() + column;
            }
            if (!emptyPos(column, row)) {
                return;
            }
            this.square.placeValue(column, row, val);
        }
    }
    
    public boolean emptyPos(int column, int row) {
        return this.square.readValue(column, row) == 0;
    }
    
    public int moveRow() {
        row = row - 1;
        if (row < 0) {
            row = this.square.getHeight() - 1;
        }
        if (row >= square.getHeight()) {
            row = 0;
        }
        return row;
    }
    
    public int moveColumn() {
        column = column + 1;
        if (column >= this.square.getWidth()) {
            column = 0;
        }
        return column;
    }
    
    public boolean allFilled() {
        return !this.square.giveAllNumbers().contains(0);
    }
    

}
