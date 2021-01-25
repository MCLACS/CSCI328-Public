package utilities;

public class AreaCalc
{
    // singleton stuff...
    private static AreaCalc m_instance;
    public static AreaCalc getInstance()
    {
        if (m_instance == null)
            m_instance = new AreaCalc();
        return m_instance;
    }
    private AreaCalc() {}
    
    public double squareArea(double l)
    { return l*l; }

    public double rectArea(double w, double h)
    { return w*h; }
}