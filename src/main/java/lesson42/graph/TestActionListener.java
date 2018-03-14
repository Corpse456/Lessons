package lesson42.graph;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
	Components3.textField.setText(e.getActionCommand());
    }
}
