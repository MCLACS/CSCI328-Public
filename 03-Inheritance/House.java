import java.text.NumberFormat;

public class House implements IEstimatable
{
    private double m_sqrFt;
    
    public House(double sqrFt)
    {
        if (m_sqrFt < 0)
            throw new Error
                ("A house must have a positive number of sqft.");
        m_sqrFt = sqrFt;
    }

    public House()
    {
        this(0.0);
    }

    public double getSqrFt()
    { return m_sqrFt; }

    public double estimate()
    {
        return getSqrFt() * 97; 
    }

    @Override
    public String toString()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return String.format("House%n\tSqrFt: %f%n\tCost: %s", 
                getSqrFt(), fmt.format(estimate()));
    }
}
