import java.awt.Color;
import java.awt.Graphics;


public class Line extends Shape 
{
	protected Line()
	{		
	}
	
	@Override
	public void draw(Graphics g) 
	{ 
		Color c = g.getColor();
		g.setColor(getColor());
		g.drawLine(getX(), getY(), getX()+getW(), getY()+getH());
		g.setColor(c);
	}

	@Override
	public Shape clone() 
	{
		Shape s = new Line();
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
		return "Line";
	}
}
