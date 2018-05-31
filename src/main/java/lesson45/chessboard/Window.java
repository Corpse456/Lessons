package lesson45.chessboard;

import java.awt.Color;

import javax.swing.JFrame;

public class Window {
    
    public Window() {
	
	JFrame f = new JFrame("Just Window");
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setSize(800, 800);
	f.setVisible(true);
	f.setLayout(null);
	f.setLocationRelativeTo(null);
	
	ChessBoardComponent bcomp = new ChessBoardComponent();
	bcomp.setDirection(ChessBoardComponent.WHITE_DOWN);
	bcomp.setColors(Color.BLUE, Color.RED);
	bcomp.setBounds(100, 100, 600, 600);
	bcomp.setBackground(Color.BLACK);
	f.add(bcomp);
    }
    
    public static void main(String[] args) {
	new Window();
    }
}
