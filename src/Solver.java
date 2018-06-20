import java.awt.*;

public class Solver {
  private static int gridArray[][] = new int[9][9];
  public Solver(TextField textFields[]) {
    int currentRow = 0;
    int currentColumn = 0;
    int currentValue = 0;
    for(int i = 0; i < 81; i++) {
      if (textFields[i].getText().equals("")) {
        currentValue = 0;
      }
      else {
        currentValue = Integer.parseInt(textFields[i].getText());
      }
      gridArray[currentRow][currentColumn] = currentValue;
      currentColumn++;
      if ((i+ 1) % 9 == 0) {
        currentRow = (i+1)/9;
        currentColumn = 0;
      }
    }
    solve(gridArray);
  }
  
  private void solve(int gridArray[][]) {
  
  }
  
  public int[][] getArray() {
    return gridArray;
  }
}
