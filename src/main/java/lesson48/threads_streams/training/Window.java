package lesson48.threads_streams.training;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings ("serial")
public class Window extends JFrame {

    private JTextArea out;

    public JTextArea getOut () {
        return out;
    }

    public Window () {
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Animals");
        setResizable(false);
        setLayout(new FlowLayout());
        setVisible(true);

        setContentPane(new JPanel());
        getContentPane().setSize(getWidth(), getHeight());
        getContentPane().setLayout(null);

        out = new JTextArea();
        out.setEditable(false);
        out.setSize(getSize());
        out.setAutoscrolls(true);

        JScrollPane scrollPane = new JScrollPane(out);
        scrollPane.setBounds(getContentPane().getBounds());
        getContentPane().add(scrollPane, BorderLayout.CENTER);
    }
}
