public class SkiConstants implements ISkiConstants
{
    private final double m_begFactor = 0.92;
    private final double m_intFactor = 1.00;
    private final double m_expertFactor = 1.12;
    
    private static ISkiConstants m_instance;
    public static ISkiConstants getInstance()
    {
        if (m_instance == null)
        {
            m_instance = new SkiConstants();
        }
        return m_instance;
    }
    private SkiConstants() {}
    
    public double getBeginnerFactor()
    { return m_begFactor; }
    
    public double getIntermediateFactor()
    { return m_intFactor; }
    
    public double getExpertFactor()
    { return m_expertFactor; }
}