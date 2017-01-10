import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MainFrame extends JFrame implements MouseListener
{
	
	private static Random m_rand = new Random();
	
	private ShapePanel m_panel;
	
	public MainFrame()
	{
		setTitle("Prototype");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
	
		m_panel = new ShapePanel();
		m_panel.addMouseListener(this);
		add(m_panel, BorderLayout.CENTER);
		
		setSize(600, 400);
		setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) 
	{
		int size = Shape.getShapes().size();
		int choice = m_rand.nextInt(size);
		Shape s = Shape.getShapes().get(choice);
		
		// finally the prototype hidden here...
		// notice that this method has no idea what
		// shapes it is working with..,
		s = s.clone();
		
		s.setX(e.getX());
		s.setY(e.getY());
		
		int w = m_rand.nextInt(50) + 10;
		int h = m_rand.nextInt(50) + 10;		
		s.setW(w);
		s.setH(h);
		
		int r = m_rand.nextInt(256);
		int g = m_rand.nextInt(256);
		int b = m_rand.nextInt(256);
		s.setColor(new Color(r,g,b));
		
		m_panel.addShape(s);
		m_panel.repaint();		
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}
}
