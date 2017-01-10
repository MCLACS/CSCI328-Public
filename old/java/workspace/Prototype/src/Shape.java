import java.awt.Color;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public abstract class Shape 
{
	private int m_x = 0;
	private int m_y = 0;	
	private int m_w = 0;
	private int m_h = 0;
	private Color m_color = null;
	
	private static List<Shape> m_shapes = new ArrayList<Shape>();
	static 
	{
		BufferedReader in = null;
		try		
		{
			in = new BufferedReader(new FileReader("shapes.txt"));
			String line = in.readLine();
			while (line != null)
			{
				@SuppressWarnings("unchecked")
				Class<Shape> cls = (Class<Shape>) Class.forName(line);
				Shape s = cls.newInstance();
				m_shapes.add(s); 
				line = in.readLine();
			}			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.exit(-1);
		}
		finally
		{
			try
			{
				if (in != null)
					in.close();
			}
			catch (Exception e)
			{
				e.printStackTrace();
				System.exit(-1);
			}
		}
	}

	public static List<Shape> getShapes()	
	{
		return m_shapes;
	}
	
	protected Shape()
	{
		m_x = 0;
		m_y = 0;
		m_w = 0;
		m_h = 0;
		m_color = Color.black;		
	}

	public void setX(int x)
	{ m_x = x; }

	public void setY(int y)
	{ m_y = y; }

	public void setW(int w)
	{ m_w = w; }

	public void setH(int h)
	{ m_h = h; }

	public void setColor(Color c)
	{ m_color = c; }
	
	public int getX()
	{ return m_x; }

	public int getY()
	{ return m_y; }

	public int getW()
	{ return m_w; }

	public int getH()
	{ return m_h; }

	public Color getColor()
	{ return m_color; }

	public abstract String getName();
	public abstract void draw(Graphics g);
	public abstract Shape clone();
}
