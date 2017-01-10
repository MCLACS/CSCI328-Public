package realEstate;

import java.awt.Color;
import java.text.NumberFormat;

public class House
{
    private int m_numWindows;
    private int m_numDoors;
    private int m_numFloors;
    private double m_sqrIn;
    private SimpleColor m_color;
    private Tools m_tools;

    private class SimpleColor
    {
    	int m_r;
    	int m_g;
    	int m_b;
    	
    	public SimpleColor(Color c)
    	{ 
    		m_r = c.getRed();
    		m_g = c.getGreen();
    		m_b = c.getBlue();
    	}    	
    	
    	@Override
    	public String toString()
    	{
    		if ( m_r > 0 && m_g == 0 && m_b == 0)
    			return "red";
    		else if ( m_g > 0 && m_r == 0 && m_b == 0)
    			return "green";
    		else if ( m_b > 0 && m_g == 0 && m_r == 0)
    			return "blue";
    		else if ( m_b == 0 && m_g == 0 && m_r == 0)
    			return "black";
    		else if ( m_b == 255 && m_g == 255 && m_r == 255)
    			return "white";
    		else if ( m_b == m_g && m_g == m_r)
    			return "gray";
    		else 
    			return "complex";    		
    			
    	}
    }
    
    public House(int numWindows, int numDoors, int numFloors, double sqrFt, Color c)
    {
        m_numWindows = numWindows;
        m_numDoors = numDoors;
        m_numFloors = numFloors;
        m_tools = new Tools();
        m_sqrIn = m_tools.ftToInc(sqrFt);
        m_color = new SimpleColor(c);
    }

    public House()
    {
        this(0, 0, 0, 0.0, Color.white);
    }

    public int getNumWindows()
    { return m_numWindows; }

    public int getNumDoors()
    { return m_numDoors; }

    public int getNumFloors()
    { return m_numFloors; }

    public double getSqrFt()
    { return m_tools.incToFt(m_sqrIn); }

    public String getColor()
    { return m_color.toString(); }
    
    public double estimateCost()
    {
        return getNumWindows() * 3000 + getNumDoors() * 500 + getNumFloors() * 30000 + m_sqrIn * 530; 
    }

    @Override
    public String toString()
    {
        NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
        return String.format("House%n"
        		+ "\tWindows: %d%n"
        		+ "\tDoors: %d%n"
                + "\tFloors: %d%n"
                + "\tSqrFt: %.2f%n"
                + "\tColor: %s%n"
                + "\tCost: %s", 
               getNumWindows(), getNumDoors(), getNumFloors(), 
               getSqrFt(), getColor(), fmt1.format(estimateCost()));
    }
}
