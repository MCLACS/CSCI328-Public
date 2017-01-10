public class Rectangle extends BasicShape 
{
	private int m_w;
	private int m_h;

	public Rectangle()
	{
		this(0, 0);
	}
	
	public Rectangle(int w, int h)
	{
		if (w < 0 || h < 0)
			throw new IllegalArgumentException("Width and height must be "
			        + "positive or 0.");		
		this.m_w = w;
		this.m_h = h;
	}
	
	@Override
	public void draw() 
	{
		System.out.println();
	    for (int h = 0; h < this.m_h; h++)
	    {	     
	        for (int w = 0; w < this.m_w; w++)
	        {
	            System.out.print(getChar());
	        }
	        System.out.println();
	    }
	    System.out.println();
	}

	@Override
	protected char getChar() 
	{	
		return '*';
	}
}