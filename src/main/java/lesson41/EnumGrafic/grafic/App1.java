package lesson41.EnumGrafic.grafic;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

public class App1 {
    public static void main(String[] args) {
	JFrame fr = new FrameDemo();
	fr.setBackground(Color.LIGHT_GRAY);
	// ��������������� ������ ����. ����������!
	fr.setSize(new Dimension(560, 560));
	// ���������
	fr.setTitle("Leha-Application");
	// ��������� ���������. �����������!
	fr.setVisible(true);
	// ����������� - ����� paint()
	fr.repaint();
	
	JFrame fr2 = new FrameDemo2();
	fr2.setBackground(Color.LIGHT_GRAY);
	// ��������������� ������ ����. ����������!
	fr2.setSize(new Dimension(250, 281));
	// ���������
	fr2.setTitle("Leha-Application");
	// ��������� ���������. �����������!
	fr2.setVisible(true);
	// ����������� - ����� paint()
	fr2.repaint();
    }
}
