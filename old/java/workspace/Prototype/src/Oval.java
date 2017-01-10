import java.awt.Color;
import java.awt.Graphics;


public class Oval extends Shape 
{
	protected Oval()
	{		
	}
	
	@Override
	public void draw(Graphics g) 
	{
		Color c = g.getColor();
		g.setColor(getColor());
		g.fillOval(getX(), getY(), getW(), getH());
		g.setColor(c);
	}

	@Override
	public Shape clone() 
	{
		Shape s = new Oval();
		s.setX(getX());
		s.setY(getY());
		s.setW(getW());
		s.setH(getH());
		s.setColor(getColor());
		return s;
	}

	@Override
	public String getName() 
	{	
		return "Oval";
	}
}
