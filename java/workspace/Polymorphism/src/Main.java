import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Main 
{

	public static void main(String[] args) 
	{
		PercentSquare pctSquare = new PercentSquare(3);
		drawPctSquare(pctSquare);
		drawSquare(pctSquare);
		drawShape(pctSquare);
		drawDrawable(pctSquare);
		
		Square square = new Square(3);		
		drawSquare(square);
		drawShape(square);
		drawDrawable(square);

		CarrotRectangle carrotRectangle = new CarrotRectangle(10, 3);
		drawCarrotRectangle(carrotRectangle);
		drawRectangle(carrotRectangle);
		drawShape(carrotRectangle);
		drawDrawable(carrotRectangle);

		Rectangle rectangle = new Rectangle(10, 3);		
		drawRectangle(rectangle);
		drawShape(rectangle);
		drawDrawable(rectangle);

		ArrayList<IDrawable> list1 = new ArrayList<IDrawable>();
		list1.add(pctSquare);
		list1.add(square);
		list1.add(carrotRectangle);
		list1.add(rectangle);
		drawLots(list1);
		
		LinkedList<IDrawable> list2 = new LinkedList<IDrawable>();
		list2.add(pctSquare);
		list2.add(square);
		list2.add(carrotRectangle);
		list2.add(rectangle);
		drawLots(list2);
		
	}
	
	public static void drawPctSquare(PercentSquare s)
	{
		s.draw();
	}
	
	public static void drawSquare(Square s)
	{
		s.draw();
	}

	public static void drawCarrotRectangle(CarrotRectangle r)
	{
		r.draw();
	}

	public static void drawRectangle(Rectangle r)
	{
		r.draw();
	}
	
	public static void drawShape(BasicShape s)
	{
		s.draw();
	}
	
	public static void drawDrawable(IDrawable d)
	{
		d.draw();
	}
	
	public static void drawLots(List<IDrawable> list)
	{
		for (IDrawable d : list)
			d.draw();
	}

}
