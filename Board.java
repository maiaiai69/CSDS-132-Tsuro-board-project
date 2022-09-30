import edu.macalester.graphics.GraphicsGroup;

/**
 * The GraphicsGroup object Board, which is the interface which players place their stones.
 */
public class Board extends GraphicsGroup {

static final int NUM_COL = 15;
static final int NUM_ROW = 15;

public Square[][] squares = new Square[NUM_ROW][NUM_COL];
    
public Board () {
    double xPos =0;
    double yPos = 0;

    for (int i = 0 ; i < NUM_ROW ; i++){
        for (int j =0; j < NUM_COL; j++){
        Square square = new Square(xPos, yPos, Square.WIDTH, Square.HEIGHT);
        squares [i][j] = square;
        this.add(square);
        xPos += Square.WIDTH;
        }
        xPos = 0;
        yPos += Square.HEIGHT;
    }
}
}
