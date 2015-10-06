import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class SudokuWindow extends JFrame{
	
	Puzzle puzzle = new Puzzle();
	
//*****************HARD************************
//
//	JTextField a1 = new JTextField(1);
//	JTextField a2 = new JTextField("1",1);
//	JTextField a3 = new JTextField(1);
//	JTextField a4 = new JTextField("6",1);
//	JTextField a5 = new JTextField(1);
//	JTextField a6 = new JTextField(1);
//	JTextField a7 = new JTextField("3",1);
//	JTextField a8 = new JTextField(1);
//	JTextField a9 = new JTextField(1);
//	
//	JTextField b1 = new JTextField("5",1);
//	JTextField b2 = new JTextField(1);
//	JTextField b3 = new JTextField(1);
//	JTextField b4 = new JTextField(1);
//	JTextField b5 = new JTextField("3",1);
//	JTextField b6 = new JTextField(1);
//	JTextField b7 = new JTextField(1);
//	JTextField b8 = new JTextField("1",1);
//	JTextField b9 = new JTextField("8",1);
//	
//	JTextField c1 = new JTextField(1);
//	JTextField c2 = new JTextField("2",1);
//	JTextField c3 = new JTextField(1);
//	JTextField c4 = new JTextField("5",1);
//	JTextField c5 = new JTextField(1);
//	JTextField c6 = new JTextField(1);
//	JTextField c7 = new JTextField(1);
//	JTextField c8 = new JTextField(1);
//	JTextField c9 = new JTextField(1);
//	
//	JTextField d1 = new JTextField("3",1);
//	JTextField d2 = new JTextField(1);
//	JTextField d3 = new JTextField(1);
//	JTextField d4 = new JTextField(1);
//	JTextField d5 = new JTextField(1);
//	JTextField d6 = new JTextField(1);
//	JTextField d7 = new JTextField(1);
//	JTextField d8 = new JTextField("2",1);
//	JTextField d9 = new JTextField(1);
//	
//	JTextField e1 = new JTextField(1);
//	JTextField e2 = new JTextField(1);
//	JTextField e3 = new JTextField(1);
//	JTextField e4 = new JTextField("7",1);
//	JTextField e5 = new JTextField(1);
//	JTextField e6 = new JTextField("4",1);
//	JTextField e7 = new JTextField(1);
//	JTextField e8 = new JTextField(1);
//	JTextField e9 = new JTextField(1);
//	
//	JTextField f1 = new JTextField(1);
//	JTextField f2 = new JTextField("9",1);
//	JTextField f3 = new JTextField(1);
//	JTextField f4 = new JTextField(1);
//	JTextField f5 = new JTextField(1);
//	JTextField f6 = new JTextField(1);
//	JTextField f7 = new JTextField(1);
//	JTextField f8 = new JTextField(1);
//	JTextField f9 = new JTextField("7",1);
//	
//	JTextField g1 = new JTextField(1);
//	JTextField g2 = new JTextField(1);
//	JTextField g3 = new JTextField(1);
//	JTextField g4 = new JTextField(1);
//	JTextField g5 = new JTextField(1);
//	JTextField g6 = new JTextField("6",1);
//	JTextField g7 = new JTextField(1);
//	JTextField g8 = new JTextField("7",1);
//	JTextField g9 = new JTextField(1);
//	
//	JTextField h1 = new JTextField("1",1);
//	JTextField h2 = new JTextField("5",1);
//	JTextField h3 = new JTextField(1);
//	JTextField h4 = new JTextField(1);
//	JTextField h5 = new JTextField("9",1);
//	JTextField h6 = new JTextField(1);
//	JTextField h7 = new JTextField(1);
//	JTextField h8 = new JTextField(1);
//	JTextField h9 = new JTextField("2",1);
//	
//	JTextField i1 = new JTextField(1);
//	JTextField i2 = new JTextField(1);
//	JTextField i3 = new JTextField("6",1);
//	JTextField i4 = new JTextField(1);
//	JTextField i5 = new JTextField(1);
//	JTextField i6 = new JTextField("3",1);
//	JTextField i7 = new JTextField(1);
//	JTextField i8 = new JTextField("5",1);
//	JTextField i9 = new JTextField(1);
	
//****************** HARD 2 *******************
	
//	JTextField a1 = new JTextField(1);
//	JTextField a2 = new JTextField(1);
//	JTextField a3 = new JTextField(1);
//	JTextField a4 = new JTextField("8",1);
//	JTextField a5 = new JTextField("4",1);
//	JTextField a6 = new JTextField(1);
//	JTextField a7 = new JTextField(1);
//	JTextField a8 = new JTextField(1);
//	JTextField a9 = new JTextField("9",1);
//	
//	JTextField b1 = new JTextField(1);
//	JTextField b2 = new JTextField(1);
//	JTextField b3 = new JTextField("1",1);
//	JTextField b4 = new JTextField(1);
//	JTextField b5 = new JTextField(1);
//	JTextField b6 = new JTextField(1);
//	JTextField b7 = new JTextField(1);
//	JTextField b8 = new JTextField(1);
//	JTextField b9 = new JTextField("5",1);
//	
//	JTextField c1 = new JTextField("8",1);
//	JTextField c2 = new JTextField(1);
//	JTextField c3 = new JTextField(1);
//	JTextField c4 = new JTextField(1);
//	JTextField c5 = new JTextField("2",1);
//	JTextField c6 = new JTextField("1",1);
//	JTextField c7 = new JTextField("4",1);
//	JTextField c8 = new JTextField("6",1);
//	JTextField c9 = new JTextField(1);
//	
//	JTextField d1 = new JTextField("7",1);
//	JTextField d2 = new JTextField(1);
//	JTextField d3 = new JTextField("8",1);
//	JTextField d4 = new JTextField(1);
//	JTextField d5 = new JTextField(1);
//	JTextField d6 = new JTextField(1);
//	JTextField d7 = new JTextField(1);
//	JTextField d8 = new JTextField("9",1);
//	JTextField d9 = new JTextField(1);
//	
//	JTextField e1 = new JTextField(1);
//	JTextField e2 = new JTextField(1);
//	JTextField e3 = new JTextField(1);
//	JTextField e4 = new JTextField(1);
//	JTextField e5 = new JTextField(1);
//	JTextField e6 = new JTextField(1);
//	JTextField e7 = new JTextField(1);
//	JTextField e8 = new JTextField(1);
//	JTextField e9 = new JTextField(1);
//	
//	JTextField f1 = new JTextField(1);
//	JTextField f2 = new JTextField("5",1);
//	JTextField f3 = new JTextField(1);
//	JTextField f4 = new JTextField(1);
//	JTextField f5 = new JTextField(1);
//	JTextField f6 = new JTextField(1);
//	JTextField f7 = new JTextField("3",1);
//	JTextField f8 = new JTextField(1);
//	JTextField f9 = new JTextField("1",1);
//	
//	JTextField g1 = new JTextField(1);
//	JTextField g2 = new JTextField("2",1);
//	JTextField g3 = new JTextField("4",1);
//	JTextField g4 = new JTextField("9",1);
//	JTextField g5 = new JTextField("1",1);
//	JTextField g6 = new JTextField(1);
//	JTextField g7 = new JTextField(1);
//	JTextField g8 = new JTextField(1);
//	JTextField g9 = new JTextField("7",1);
//	
//	JTextField h1 = new JTextField("9",1);
//	JTextField h2 = new JTextField(1);
//	JTextField h3 = new JTextField(1);
//	JTextField h4 = new JTextField(1);
//	JTextField h5 = new JTextField(1);
//	JTextField h6 = new JTextField(1);
//	JTextField h7 = new JTextField("5",1);
//	JTextField h8 = new JTextField(1);
//	JTextField h9 = new JTextField(1);
//	
//	JTextField i1 = new JTextField("3",1);
//	JTextField i2 = new JTextField(1);
//	JTextField i3 = new JTextField(1);
//	JTextField i4 = new JTextField(1);
//	JTextField i5 = new JTextField("8",1);
//	JTextField i6 = new JTextField("4",1);
//	JTextField i7 = new JTextField(1);
//	JTextField i8 = new JTextField(1);
//	JTextField i9 = new JTextField(1);
	
	
//******************EASY***********************
	
//	JTextField a1 = new JTextField(1);
//	JTextField a2 = new JTextField("2",1);
//	JTextField a3 = new JTextField(1);
//	JTextField a4 = new JTextField("1",1);
//	JTextField a5 = new JTextField("7",1);
//	JTextField a6 = new JTextField("8",1);
//	JTextField a7 = new JTextField(1);
//	JTextField a8 = new JTextField("3",1);
//	JTextField a9 = new JTextField(1);
//	
//	JTextField b1 = new JTextField(1);
//	JTextField b2 = new JTextField("4",1);
//	JTextField b3 = new JTextField(1);
//	JTextField b4 = new JTextField("3",1);
//	JTextField b5 = new JTextField(1);
//	JTextField b6 = new JTextField("2",1);
//	JTextField b7 = new JTextField(1);
//	JTextField b8 = new JTextField("9",1);
//	JTextField b9 = new JTextField(1);
//	
//	JTextField c1 = new JTextField("1",1);
//	JTextField c2 = new JTextField(1);
//	JTextField c3 = new JTextField(1);
//	JTextField c4 = new JTextField(1);
//	JTextField c5 = new JTextField(1);
//	JTextField c6 = new JTextField(1);
//	JTextField c7 = new JTextField(1);
//	JTextField c8 = new JTextField(1);
//	JTextField c9 = new JTextField("6",1);
//	
//	JTextField d1 = new JTextField(1);
//	JTextField d2 = new JTextField(1);
//	JTextField d3 = new JTextField("8",1);
//	JTextField d4 = new JTextField("6",1);
//	JTextField d5 = new JTextField(1);
//	JTextField d6 = new JTextField("3",1);
//	JTextField d7 = new JTextField("5",1);
//	JTextField d8 = new JTextField(1);
//	JTextField d9 = new JTextField(1);
//	
//	JTextField e1 = new JTextField("3",1);
//	JTextField e2 = new JTextField(1);
//	JTextField e3 = new JTextField(1);
//	JTextField e4 = new JTextField(1);
//	JTextField e5 = new JTextField(1);
//	JTextField e6 = new JTextField(1);
//	JTextField e7 = new JTextField(1);
//	JTextField e8 = new JTextField(1);
//	JTextField e9 = new JTextField("4",1);
//	
//	JTextField f1 = new JTextField(1);
//	JTextField f2 = new JTextField(1);
//	JTextField f3 = new JTextField("6",1);
//	JTextField f4 = new JTextField("7",1);
//	JTextField f5 = new JTextField(1);
//	JTextField f6 = new JTextField("9",1);
//	JTextField f7 = new JTextField("2",1);
//	JTextField f8 = new JTextField(1);
//	JTextField f9 = new JTextField(1);
//	
//	JTextField g1 = new JTextField("9",1);
//	JTextField g2 = new JTextField(1);
//	JTextField g3 = new JTextField(1);
//	JTextField g4 = new JTextField(1);
//	JTextField g5 = new JTextField(1);
//	JTextField g6 = new JTextField(1);
//	JTextField g7 = new JTextField(1);
//	JTextField g8 = new JTextField(1);
//	JTextField g9 = new JTextField("2",1);
//	
//	JTextField h1 = new JTextField(1);
//	JTextField h2 = new JTextField("8",1);
//	JTextField h3 = new JTextField(1);
//	JTextField h4 = new JTextField("9",1);
//	JTextField h5 = new JTextField(1);
//	JTextField h6 = new JTextField("1",1);
//	JTextField h7 = new JTextField(1);
//	JTextField h8 = new JTextField("6",1);
//	JTextField h9 = new JTextField(1);
//	
//	JTextField i1 = new JTextField(1);
//	JTextField i2 = new JTextField("1",1);
//	JTextField i3 = new JTextField(1);
//	JTextField i4 = new JTextField("4",1);
//	JTextField i5 = new JTextField("3",1);
//	JTextField i6 = new JTextField("6",1);
//	JTextField i7 = new JTextField(1);
//	JTextField i8 = new JTextField("5",1);
//	JTextField i9 = new JTextField(1);
	
//****************BLANK********************
	
	JTextField a1 = new JTextField(1);
	JTextField a2 = new JTextField(1);
	JTextField a3 = new JTextField(1);
	JTextField a4 = new JTextField(1);
	JTextField a5 = new JTextField(1);
	JTextField a6 = new JTextField(1);
	JTextField a7 = new JTextField(1);
	JTextField a8 = new JTextField(1);
	JTextField a9 = new JTextField(1);
	
	JTextField b1 = new JTextField(1);
	JTextField b2 = new JTextField(1);
	JTextField b3 = new JTextField(1);
	JTextField b4 = new JTextField(1);
	JTextField b5 = new JTextField(1);
	JTextField b6 = new JTextField(1);
	JTextField b7 = new JTextField(1);
	JTextField b8 = new JTextField(1);
	JTextField b9 = new JTextField(1);
	
	JTextField c1 = new JTextField(1);
	JTextField c2 = new JTextField(1);
	JTextField c3 = new JTextField(1);
	JTextField c4 = new JTextField(1);
	JTextField c5 = new JTextField(1);
	JTextField c6 = new JTextField(1);
	JTextField c7 = new JTextField(1);
	JTextField c8 = new JTextField(1);
	JTextField c9 = new JTextField(1);
	
	JTextField d1 = new JTextField(1);
	JTextField d2 = new JTextField(1);
	JTextField d3 = new JTextField(1);
	JTextField d4 = new JTextField(1);
	JTextField d5 = new JTextField(1);
	JTextField d6 = new JTextField(1);
	JTextField d7 = new JTextField(1);
	JTextField d8 = new JTextField(1);
	JTextField d9 = new JTextField(1);
	
	JTextField e1 = new JTextField(1);
	JTextField e2 = new JTextField(1);
	JTextField e3 = new JTextField(1);
	JTextField e4 = new JTextField(1);
	JTextField e5 = new JTextField(1);
	JTextField e6 = new JTextField(1);
	JTextField e7 = new JTextField(1);
	JTextField e8 = new JTextField(1);
	JTextField e9 = new JTextField(1);
	
	JTextField f1 = new JTextField(1);
	JTextField f2 = new JTextField(1);
	JTextField f3 = new JTextField(1);
	JTextField f4 = new JTextField(1);
	JTextField f5 = new JTextField(1);
	JTextField f6 = new JTextField(1);
	JTextField f7 = new JTextField(1);
	JTextField f8 = new JTextField(1);
	JTextField f9 = new JTextField(1);
	
	JTextField g1 = new JTextField(1);
	JTextField g2 = new JTextField(1);
	JTextField g3 = new JTextField(1);
	JTextField g4 = new JTextField(1);
	JTextField g5 = new JTextField(1);
	JTextField g6 = new JTextField(1);
	JTextField g7 = new JTextField(1);
	JTextField g8 = new JTextField(1);
	JTextField g9 = new JTextField(1);
	
	JTextField h1 = new JTextField(1);
	JTextField h2 = new JTextField(1);
	JTextField h3 = new JTextField(1);
	JTextField h4 = new JTextField(1);
	JTextField h5 = new JTextField(1);
	JTextField h6 = new JTextField(1);
	JTextField h7 = new JTextField(1);
	JTextField h8 = new JTextField(1);
	JTextField h9 = new JTextField(1);
	
	JTextField i1 = new JTextField(1);
	JTextField i2 = new JTextField(1);
	JTextField i3 = new JTextField(1);
	JTextField i4 = new JTextField(1);
	JTextField i5 = new JTextField(1);
	JTextField i6 = new JTextField(1);
	JTextField i7 = new JTextField(1);
	JTextField i8 = new JTextField(1);
	JTextField i9 = new JTextField(1);
	
	
	
	JPanel mainPanel = new JPanel();

	public SudokuWindow(){
		
		this.setTitle("Sudoku Solver");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
	//	JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		Border emptyBorder = BorderFactory.createEmptyBorder(10,10,10,10);
		
		mainPanel.setBorder(emptyBorder);
		
		JPanel aPanel = new JPanel();
		aPanel.setLayout(new BoxLayout(aPanel, BoxLayout.X_AXIS));
		aPanel.add(a1);
		aPanel.add(a2);
		aPanel.add(a3);
		aPanel.add(Box.createRigidArea(new Dimension(3,0)));
		aPanel.add(a4);
		aPanel.add(a5);
		aPanel.add(a6);
		aPanel.add(Box.createRigidArea(new Dimension(3,0)));
		aPanel.add(a7);
		aPanel.add(a8);
		aPanel.add(a9);
		
		JPanel bPanel = new JPanel();
		bPanel.setLayout(new BoxLayout(bPanel, BoxLayout.X_AXIS));
		bPanel.add(b1);
		bPanel.add(b2);
		bPanel.add(b3);
		bPanel.add(Box.createRigidArea(new Dimension(3,0)));
		bPanel.add(b4);
		bPanel.add(b5);
		bPanel.add(b6);
		bPanel.add(Box.createRigidArea(new Dimension(3,0)));
		bPanel.add(b7);
		bPanel.add(b8);
		bPanel.add(b9);
		
		JPanel cPanel = new JPanel();
		cPanel.setLayout(new BoxLayout(cPanel, BoxLayout.X_AXIS));
		cPanel.add(c1);
		cPanel.add(c2);
		cPanel.add(c3);
		cPanel.add(Box.createRigidArea(new Dimension(3,0)));
		cPanel.add(c4);
		cPanel.add(c5);
		cPanel.add(c6);
		cPanel.add(Box.createRigidArea(new Dimension(3,0)));
		cPanel.add(c7);
		cPanel.add(c8);
		cPanel.add(c9);
		
		JPanel dPanel = new JPanel();
		dPanel.setLayout(new BoxLayout(dPanel, BoxLayout.X_AXIS));
		dPanel.add(d1);
		dPanel.add(d2);
		dPanel.add(d3);
		dPanel.add(Box.createRigidArea(new Dimension(3,0)));
		dPanel.add(d4);
		dPanel.add(d5);
		dPanel.add(d6);
		dPanel.add(Box.createRigidArea(new Dimension(3,0)));
		dPanel.add(d7);
		dPanel.add(d8);
		dPanel.add(d9);
		
		JPanel ePanel = new JPanel();
		ePanel.setLayout(new BoxLayout(ePanel, BoxLayout.X_AXIS));
		ePanel.add(e1);
		ePanel.add(e2);
		ePanel.add(e3);
		ePanel.add(Box.createRigidArea(new Dimension(3,0)));
		ePanel.add(e4);
		ePanel.add(e5);
		ePanel.add(e6);
		ePanel.add(Box.createRigidArea(new Dimension(3,0)));
		ePanel.add(e7);
		ePanel.add(e8);
		ePanel.add(e9);
		
		JPanel fPanel = new JPanel();
		fPanel.setLayout(new BoxLayout(fPanel, BoxLayout.X_AXIS));
		fPanel.add(f1);
		fPanel.add(f2);
		fPanel.add(f3);
		fPanel.add(Box.createRigidArea(new Dimension(3,0)));
		fPanel.add(f4);
		fPanel.add(f5);
		fPanel.add(f6);
		fPanel.add(Box.createRigidArea(new Dimension(3,0)));
		fPanel.add(f7);
		fPanel.add(f8);
		fPanel.add(f9);
		
		JPanel gPanel = new JPanel();
		gPanel.setLayout(new BoxLayout(gPanel, BoxLayout.X_AXIS));
		gPanel.add(g1);
		gPanel.add(g2);
		gPanel.add(g3);
		gPanel.add(Box.createRigidArea(new Dimension(3,0)));
		gPanel.add(g4);
		gPanel.add(g5);
		gPanel.add(g6);
		gPanel.add(Box.createRigidArea(new Dimension(3,0)));
		gPanel.add(g7);
		gPanel.add(g8);
		gPanel.add(g9);
		
		JPanel hPanel = new JPanel();
		hPanel.setLayout(new BoxLayout(hPanel, BoxLayout.X_AXIS));
		hPanel.add(h1);
		hPanel.add(h2);
		hPanel.add(h3);
		hPanel.add(Box.createRigidArea(new Dimension(3,0)));
		hPanel.add(h4);
		hPanel.add(h5);
		hPanel.add(h6);
		hPanel.add(Box.createRigidArea(new Dimension(3,0)));
		hPanel.add(h7);
		hPanel.add(h8);
		hPanel.add(h9);
	
		JPanel iPanel = new JPanel();
		iPanel.setLayout(new BoxLayout(iPanel, BoxLayout.X_AXIS));
		iPanel.add(i1);
		iPanel.add(i2);
		iPanel.add(i3);
		iPanel.add(Box.createRigidArea(new Dimension(3,0)));
		iPanel.add(i4);
		iPanel.add(i5);
		iPanel.add(i6);
		iPanel.add(Box.createRigidArea(new Dimension(3,0)));
		iPanel.add(i7);
		iPanel.add(i8);
		iPanel.add(i9);
		
		JButton solveButton = new JButton("Solve");
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
		buttonPanel.add(solveButton);
		SolveAction solveAction = new SolveAction();
		
		solveButton.addActionListener(solveAction);
			
		JPanel labelPanel = new JPanel();
		labelPanel.add(new JLabel("Fill in known values and press solve."));
		
		mainPanel.add(labelPanel);
		mainPanel.add(aPanel);
		mainPanel.add(bPanel);
		mainPanel.add(cPanel);
		mainPanel.add(Box.createRigidArea(new Dimension(0, 5)));
		mainPanel.add(dPanel);
		mainPanel.add(ePanel);
		mainPanel.add(fPanel);
		mainPanel.add(Box.createRigidArea(new Dimension(0, 5)));
		mainPanel.add(gPanel);
		mainPanel.add(hPanel);
		mainPanel.add(iPanel);
		mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
		mainPanel.add(buttonPanel);
		
		add(mainPanel);
	}
	
	private class SolveAction implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			//load database with given numbers
			loadValues();
			//solve algorithm
			ArrayList<String> solvedValues = puzzle.solve();
			
			//print the puzzle with the initial values loaded and according eliminations made
			//ArrayList<String> solvedValues = puzzle.print();
			
			//load GUI
			loadGUI(solvedValues);
			mainPanel.repaint();
			//"Done" message (Success/Failure)
		}
	}
	
	private void loadValues(){
		try {
			puzzle.add(a1.getText(), 0);
			puzzle.add(a2.getText(), 1);
			puzzle.add(a3.getText(), 2);
			puzzle.add(a4.getText(), 3);
			puzzle.add(a5.getText(), 4);
			puzzle.add(a6.getText(), 5);
			puzzle.add(a7.getText(), 6);
			puzzle.add(a8.getText(), 7);
			puzzle.add(a9.getText(), 8);
			
			puzzle.add(b1.getText(), 9);
			puzzle.add(b2.getText(), 10);
			puzzle.add(b3.getText(), 11);
			puzzle.add(b4.getText(), 12);
			puzzle.add(b5.getText(), 13);
			puzzle.add(b6.getText(), 14);
			puzzle.add(b7.getText(), 15);
			puzzle.add(b8.getText(), 16);
			puzzle.add(b9.getText(), 17);
			
			puzzle.add(c1.getText(), 18);
			puzzle.add(c2.getText(), 19);
			puzzle.add(c3.getText(), 20);
			puzzle.add(c4.getText(), 21);
			puzzle.add(c5.getText(), 22);
			puzzle.add(c6.getText(), 23);
			puzzle.add(c7.getText(), 24);
			puzzle.add(c8.getText(), 25);
			puzzle.add(c9.getText(), 26);
			
			puzzle.add(d1.getText(), 27);
			puzzle.add(d2.getText(), 28);
			puzzle.add(d3.getText(), 29);
			puzzle.add(d4.getText(), 30);
			puzzle.add(d5.getText(), 31);
			puzzle.add(d6.getText(), 32);
			puzzle.add(d7.getText(), 33);
			puzzle.add(d8.getText(), 34);
			puzzle.add(d9.getText(), 35);
			
			puzzle.add(e1.getText(), 36);
			puzzle.add(e2.getText(), 37);
			puzzle.add(e3.getText(), 38);
			puzzle.add(e4.getText(), 39);
			puzzle.add(e5.getText(), 40);
			puzzle.add(e6.getText(), 41);
			puzzle.add(e7.getText(), 42);
			puzzle.add(e8.getText(), 43);
			puzzle.add(e9.getText(), 44);
			
			puzzle.add(f1.getText(), 45);
			puzzle.add(f2.getText(), 46);
			puzzle.add(f3.getText(), 47);
			puzzle.add(f4.getText(), 48);
			puzzle.add(f5.getText(), 49);
			puzzle.add(f6.getText(), 50);
			puzzle.add(f7.getText(), 51);
			puzzle.add(f8.getText(), 52);
			puzzle.add(f9.getText(), 53);
			
			puzzle.add(g1.getText(), 54);
			puzzle.add(g2.getText(), 55);
			puzzle.add(g3.getText(), 56);
			puzzle.add(g4.getText(), 57);
			puzzle.add(g5.getText(), 58);
			puzzle.add(g6.getText(), 59);
			puzzle.add(g7.getText(), 60);
			puzzle.add(g8.getText(), 61);
			puzzle.add(g9.getText(), 62);
			
			puzzle.add(h1.getText(), 63);
			puzzle.add(h2.getText(), 64);
			puzzle.add(h3.getText(), 65);
			puzzle.add(h4.getText(), 66);
			puzzle.add(h5.getText(), 67);
			puzzle.add(h6.getText(), 68);
			puzzle.add(h7.getText(), 69);
			puzzle.add(h8.getText(), 70);
			puzzle.add(h9.getText(), 71);
			
			puzzle.add(i1.getText(), 72);
			puzzle.add(i2.getText(), 73);
			puzzle.add(i3.getText(), 74);
			puzzle.add(i4.getText(), 75);
			puzzle.add(i5.getText(), 76);
			puzzle.add(i6.getText(), 77);
			puzzle.add(i7.getText(), 78);
			puzzle.add(i8.getText(), 79);
			puzzle.add(i9.getText(), 80);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	private void loadGUI(ArrayList<String> solvedValues){
		a1.setText(solvedValues.get(0));
		a2.setText(solvedValues.get(1));
		a3.setText(solvedValues.get(2));
		a4.setText(solvedValues.get(3));
		a5.setText(solvedValues.get(4));
		a6.setText(solvedValues.get(5));
		a7.setText(solvedValues.get(6));
		a8.setText(solvedValues.get(7));
		a9.setText(solvedValues.get(8));
		
		b1.setText(solvedValues.get(9));
		b2.setText(solvedValues.get(10));
		b3.setText(solvedValues.get(11));
		b4.setText(solvedValues.get(12));
		b5.setText(solvedValues.get(13));
		b6.setText(solvedValues.get(14));
		b7.setText(solvedValues.get(15));
		b8.setText(solvedValues.get(16));
		b9.setText(solvedValues.get(17));
		
		c1.setText(solvedValues.get(18));
		c2.setText(solvedValues.get(19));
		c3.setText(solvedValues.get(20));
		c4.setText(solvedValues.get(21));
		c5.setText(solvedValues.get(22));
		c6.setText(solvedValues.get(23));
		c7.setText(solvedValues.get(24));
		c8.setText(solvedValues.get(25));
		c9.setText(solvedValues.get(26));
		
		d1.setText(solvedValues.get(27));
		d2.setText(solvedValues.get(28));
		d3.setText(solvedValues.get(29));
		d4.setText(solvedValues.get(30));
		d5.setText(solvedValues.get(31));
		d6.setText(solvedValues.get(32));
		d7.setText(solvedValues.get(33));
		d8.setText(solvedValues.get(34));
		d9.setText(solvedValues.get(35));
		
		e1.setText(solvedValues.get(36));
		e2.setText(solvedValues.get(37));
		e3.setText(solvedValues.get(38));
		e4.setText(solvedValues.get(39));
		e5.setText(solvedValues.get(40));
		e6.setText(solvedValues.get(41));
		e7.setText(solvedValues.get(42));
		e8.setText(solvedValues.get(43));
		e9.setText(solvedValues.get(44));
		
		f1.setText(solvedValues.get(45));
		f2.setText(solvedValues.get(46));
		f3.setText(solvedValues.get(47));
		f4.setText(solvedValues.get(48));
		f5.setText(solvedValues.get(49));
		f6.setText(solvedValues.get(50));
		f7.setText(solvedValues.get(51));
		f8.setText(solvedValues.get(52));
		f9.setText(solvedValues.get(53));
		
		g1.setText(solvedValues.get(54));
		g2.setText(solvedValues.get(55));
		g3.setText(solvedValues.get(56));
		g4.setText(solvedValues.get(57));
		g5.setText(solvedValues.get(58));
		g6.setText(solvedValues.get(59));
		g7.setText(solvedValues.get(60));
		g8.setText(solvedValues.get(61));
		g9.setText(solvedValues.get(62));
		
		h1.setText(solvedValues.get(63));
		h2.setText(solvedValues.get(64));
		h3.setText(solvedValues.get(65));
		h4.setText(solvedValues.get(66));
		h5.setText(solvedValues.get(67));
		h6.setText(solvedValues.get(68));
		h7.setText(solvedValues.get(69));
		h8.setText(solvedValues.get(70));
		h9.setText(solvedValues.get(71));
		
		i1.setText(solvedValues.get(72));
		i2.setText(solvedValues.get(73));
		i3.setText(solvedValues.get(74));
		i4.setText(solvedValues.get(75));
		i5.setText(solvedValues.get(76));
		i6.setText(solvedValues.get(77));
		i7.setText(solvedValues.get(78));
		i8.setText(solvedValues.get(79));
		i9.setText(solvedValues.get(80));
	}
	
}
