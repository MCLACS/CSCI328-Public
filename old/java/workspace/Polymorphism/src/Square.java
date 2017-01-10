public class Square extends BasicShape 
{
    private int m_s;
    
    public Square()
    {
        this(0);
    }

    public Square(int s)
    {
    	super();
        if (s < 0)
            throw new IllegalArgumentException("Side lenght must "
                    + "be positive or 0.");        
        this.m_s = s;
    }
    
    @Override
    public void draw() 
    {
    	System.out.println();
        for (int h = 0; h < this.m_s; h++)
        {        
            for (int w = 0; w < this.m_s; w++)
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
		return '-';
	}
}