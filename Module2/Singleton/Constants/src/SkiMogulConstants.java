public class SkiMogulConstants implements ISkiConstants
{
    private final double m_begFactor = 0.87;
    private final double m_intFactor = 0.95;
    private final double m_expertFactor = 1.00;
    
    public double getBeginnerFactor()
    { return m_begFactor; }
    
    public double getIntermediateFactor()
    { return m_intFactor; }
    
    public double getExpertFactor()
    { return m_expertFactor; }
}