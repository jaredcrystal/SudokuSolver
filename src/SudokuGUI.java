import java.awt.EventQueue;

public class SudokuGUI {
	
	public static void main(String[] args){
		
		EventQueue.invokeLater(new Runnable() {		
			public void run() {
				SudokuWindow sudokuWindow = new SudokuWindow();	
				sudokuWindow.setVisible(true);
			}
		});
	}
}
