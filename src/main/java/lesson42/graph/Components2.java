package lesson42.graph;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.event.MouseListener;

public class Components2 {
    public static void main(String[] args) throws InterruptedException {
	Frame window = new Frame();
	window.setSize(500, 500);
	window.setVisible(true);
	window.setLayout(null);

	Button knopka = new Button("SecondButton");
	Button knopka2 = new Button("ThirdButton");
	Checkbox chek = new Checkbox("Exit?", false);

	chek.setLocation(200, 30);
	chek.setSize(100, 30);
	knopka.setSize(60, 30);
	knopka.setLocation(30, 30);
	knopka2.setSize(100, 60);
	knopka2.setLocation(30, 30);

	/*FileDialog dialog = new FileDialog(window);
	dialog.setSize(100, 30);
	dialog.setLocation(100, 200);
	dialog.getFile();*/
	window.add(knopka);
	window.add(knopka2);
	window.add(chek);
	
	MouseListener l = new Listener();
	knopka.addMouseListener(l);
	window.addMouseListener(l);
	//window.getListeners(null);
    }
}
