import java.io.IOException;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.Group;
import javafx.scene.Parent;

public class Tsuro1 extends Application {
  
  // grid of tiles for Tsuro board
  private TsuroButton[][] grid;
  GridPane gridPane;
  private TsuroButton firstPlayer;
  private TsuroButton secondPlayer;
  
  /**
   * setting up the GUI
   * @param board generates the game board to be played
   */
  public void start(Stage board) throws IOException {
    
    // the main layout for the GUI
    GridPane gridPane = new GridPane();
    int count = 0;
    for(int a = 0; a < 6; a++) {
      for(int b = 0; b < 6; b++) {
        count++;
        TsuroButton[][] grid = new TsuroButton[a][b];
        Button button = new Button();
        gridPane.add(button, a, b);
        button.setPrefWidth(90.0);
        button.setPrefHeight(90.0);
      }
    }
    
    // creating the reudimentary components for player 1's tiles
    Stage player1 = new Stage();
    GridPane p1 = new GridPane();
    TsuroButton[] firstPlayer = new TsuroButton[3];
    
    // generating the first player's tile grid
    for(int i = 0; i < 3; i++) {
      
      TsuroButton button = new TsuroButton(1, 1);
      firstPlayer[i] = button;
      p1.add(button, i, 0);
      p1Button.setPrefWidth(75.0);
      p1Button.setPrefHeight(75.0);
      //firstPlayer.makeRandomConnectionArray();
    }
    
    // creating the reudimentary components for player 2's tiles
    Stage player2 = new Stage();
    GridPane p2 = new GridPane();
    int p2Count = 0;
    
    // generating the second player's tile grid
    for(int i = 0; i < 3; i++) {
      p2Count++;
      TsuroButton[] secondPlayer = new TsuroButton[i];
      Button p2Button = new Button();
      p2.add(p2Button, i, 0);
      p2Button.setPrefWidth(75.0);
      p2Button.setPrefHeight(75.0);
      //secondPlayer.makeRandomConnectionArray();
    }
    
    // creating scenes for the board components
    Scene scene = new Scene(gridPane);
    Scene scene2 = new Scene(p1);
    Scene scene3 = new Scene(p2);
    
    // setting up the generated scenes for the board components
    board.setScene(scene);
    player1.setScene(scene2);
    player2.setScene(scene3);
    
    // setting the board components as visible
    board.show();
    player1.show();
    player2.show();
    
  }
  
  /*
   * launch the Tsuro board
   * @param args the command line arguments are ignored
   */
  public static void main(String[] args) {
    Application.launch(args);
  }
  
  
}