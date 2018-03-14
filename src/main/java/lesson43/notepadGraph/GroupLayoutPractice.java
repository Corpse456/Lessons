package lesson43.notepadGraph;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GroupLayoutPractice {

    public static void main (String[] args) {
	JFrame win = new JFrame();
	win.setSize(500, 500);
	GroupLayout layout = new GroupLayout(win.getContentPane());
	win.getContentPane().setLayout(layout);
	layout.setAutoCreateGaps(true);
	layout.setAutoCreateContainerGaps(true);
	JButton one = new JButton("One");
	JButton two = new JButton("Two");
	JButton thr = new JButton("Three");
	JButton fou = new JButton("Four");
	JButton fiv = new JButton("Five");
	JButton six = new JButton("Six");
	
	layout.setHorizontalGroup(layout.createSequentialGroup()
		.addComponent(one)
		.addComponent(two)
		.addComponent(thr)
		.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addComponent(fou)
			.addComponent(fiv)
			.addComponent(six)));
	layout.setVerticalGroup(layout.createSequentialGroup()
		.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
			.addComponent(one)
			.addComponent(two)
			.addComponent(thr)
			.addComponent(fou))
		.addComponent(fiv)
		.addComponent(six));
	win.setVisible(true);
    }

    /**
     
    private void myLayout () {
	GroupLayout layout = new GroupLayout(getContentPane());
	getContentPane().setLayout(layout);
	layout.setAutoCreateGaps(true);
	layout.setAutoCreateContainerGaps(true);
	// Создание горизонтальной группы
	layout.setHorizontalGroup(layout.createSequentialGroup()
		.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addComponent(output)
			.addComponent(input))
		.addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
		.addComponent(title))
		.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addComponent(showAll)
			.addComponent(add)
			.addComponent(remove)
			.addComponent(period))
		.addComponent(back));
	layout.setVerticalGroup(layout.createSequentialGroup()
		.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
		.addComponent(title))
		.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addComponent(output)
			.addComponent(showAll))
		.addComponent(add)
		.addComponent(remove)
		.addComponent(period)
		.addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
			.addComponent(input)
			.addComponent(back)));
    }*/
}
