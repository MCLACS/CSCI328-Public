
public class CarrotRectangle extends Rectangle 
{
	public CarrotRectangle(int w, int h)
	{
		super(w, h);		
	}	
	
	@Override
	protected char getChar()
	{
		return '^';
	}
}
