package lesson44.swingNoteAndPaint.app1;

import java.io.IOException;
import javax.swing.JFrame;
import lesson44.swingNoteAndPaint.PaintEditor;

public class MainClass {
    public static void main(String[] args) throws IOException {
	//new ConsoleView();
	/*NotepadFrame fr = new NotepadFrame();
	fr.setVisible(true);
	fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	fr.repaint();*/
	
	PaintEditor p = new PaintEditor();
	p.setVisible(true);
	p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
    }
}
