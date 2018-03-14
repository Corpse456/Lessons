package lesson42.graph;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Components3 {

    public static JTextField textField;
    public static Checkbox chek;
    private static final String TEXT = "You can get a blog started in less time than \n"
	    + " it takes you to read this sentence. All you need is an email \n"
	    + " address. You’ll get your own WordPress.com address \n"
	    + " (like you.wordpress.com), a selection of great free \n"
	    + " and customizable designs for your blog (we call them themes), \n"
	    + " 3 gigabytes of file storage (that’s about 2,500 pictures!) \n"
	    + " and all the other great features listed here. \n" + " You can blog as much as you want for free, \n"
	    + " your blog can be public to the world or private \n"
	    + " for just your friends, and our premium features \n" + "are completely optional.";
    
    public static void main(String[] args) {
	JFrame window = new JFrame("Window");
	//window.pack();
	window.setLayout(new FlowLayout());
	window.setSize(500, 200);
	Color color = new Color(220, 220, 220);
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setVisible(true);
	
	JTextArea textArea = new JTextArea(10, 20);
	int s = "-------------------------------------------------\n".length();
	System.out.println(s);
	textArea.setText(TEXT);
	textArea.setCaretPosition(0);
	
	final JScrollPane scrollPane = new JScrollPane(textArea);
	window.add(scrollPane, BorderLayout.CENTER);
	
	JButton knopka = new JButton("OK");
	knopka.setActionCommand("\"OK\" was pressed!");
	JButton knopka2 = new JButton("Apply");
	knopka2.setActionCommand("\"Apply\" was pressed!");
	chek = new Checkbox("Exit?", false);
	textField = new JTextField();
	textField.setBackground(color);
	textField.setColumns(23);
	textField.setEditable(false);

	window.add(textField);
	window.add(knopka);
	window.add(knopka2);
	window.add(chek);
	
	MouseListener l = new Listener();
	ActionListener actionListener = new TestActionListener();
	knopka.addMouseListener(l);
	knopka.addActionListener(actionListener);
	knopka2.addActionListener(actionListener);
	
	System.out.println(scrollPane.getBounds());
	System.out.println(scrollPane.getWidth());
	System.out.println(scrollPane.getHeight());
	System.out.println(scrollPane.getX());
	System.out.println(scrollPane.getY());
    }
}
