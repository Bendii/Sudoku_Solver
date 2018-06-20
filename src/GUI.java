import java.awt.*;
import java.awt.event.*;
public class GUI extends Frame {
  private TextField[] textFields = new TextField[81];
  private Button btnSolve;
  
  public GUI() {
    this.setLayout(new BorderLayout());
    Panel topPanel = new Panel();
    Panel bottomPanel = new Panel();
    bottomPanel.setLayout(new GridLayout(9,9));
    
    for (int i = 0; i < 81; i++) {
      textFields[i] = new TextField(2);
      bottomPanel.add(textFields[i]);
    }
    
    btnSolve = new Button("Solve");
    topPanel.add(btnSolve);
    btnSolve.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        Solver solver = new Solver(textFields);
      }
    });
    
    
    this.add(topPanel, BorderLayout.NORTH);
    this.add(bottomPanel, BorderLayout.CENTER);
    
    addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent evt) {
        System.exit(0);  // Terminate the program
      }
    });
    
    setTitle("The best sudoku solver...");
    setSize(250, 300);
    this.setVisible(true);
  }
  
  public static void main(String[] args) {
    new GUI();
  }
}
