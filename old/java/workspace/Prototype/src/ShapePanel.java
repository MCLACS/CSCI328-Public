import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;


@SuppressWarnings("serial")
public class ShapePanel extends JPanel 
{	
	private List<Shape> m_shapes;
	
	public ShapePanel()
	{	
		m_shapes = new ArrayList<Shape>();
	}

	public void addShape(Shape s)
	{
		m_shapes.add(s.clone());
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		for (Shape s : m_shapes)
		{
			s.draw(g);
		}
	}
	
}
