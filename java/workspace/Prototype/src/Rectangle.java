import java.awt.Color;
import java.awt.Graphics;


public class Rectangle extends Shape 
{
	protected Rectangle()
	{		
	}
	
	@Override
	public void draw(Graphics g) 
	{
		Color c = g.getColor();
		g.setColor(getColor());
		g.fillRect(getX(), getY(), getW(), getH());
		g.setColor(c);
	}

	@Override
	public Shape clone() 
	{
		Shape s = new Rectangle();
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
		return "Rectangle";
	}
}
