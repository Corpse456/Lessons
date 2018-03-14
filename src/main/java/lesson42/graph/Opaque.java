package lesson42.graph;

import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Color;
//import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings ("serial")
public class Opaque extends JFrame {

    public Opaque () {
	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	// Make sure where in the top left corner, please lookup how
	// to find the screen insets ;)
	setLocation(0, 0);
	setSize(dim);
	// Set undecorated
	setUndecorated(true);
	// Apply a transparent color to the background
	// This is ALL important, without this, it won't work!
	setBackground(new Color(0, 255, 0, 0));

	// This is where we get sneaky, basically where going to
	// supply our own content pane that does some special painting
	// for us
	setContentPane(new ContentPane());
	getContentPane().setBackground(Color.BLACK);
	setLayout(new BorderLayout());
	// Add out image pane...
	ShowImage panel = new ShowImage();
	panel.setBackground(Color.RED);

	setContentPane(new ContentPane());
	getContentPane().setBackground(Color.BLACK);
	setLayout(new BorderLayout());
	//add(panel);

	JPanel pnlButtons = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	pnlButtons.setOpaque(false);
	pnlButtons.add(new JButton("<<"));
	pnlButtons.add(new JButton("<"));
	pnlButtons.add(new JButton(">"));
	pnlButtons.add(new JButton(">>"));
	// Okay, in theory, getContentPane() is required, but better safe the sorry
	getContentPane().add(pnlButtons, BorderLayout.SOUTH);
	setVisible(true);
    }

    public class ContentPane extends JPanel {
	public ContentPane () {
	    setOpaque(false);
	}

	@Override
	protected void paintComponent (Graphics g) {
	    // Allow super to paint
	    super.paintComponent(g);
	    // Apply our own painting effect
	    Graphics2D g2d = (Graphics2D) g.create();
	    // 50% transparent Alpha
	    g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f));

	    g2d.setColor(getBackground());
	    g2d.fill(getBounds());

	    g2d.dispose();
	}
    }
    class ShowImage extends Components{

	public void setBackground (Color red) {
	    // TODO Auto-generated method stub
	    
	}
	
    }
}
