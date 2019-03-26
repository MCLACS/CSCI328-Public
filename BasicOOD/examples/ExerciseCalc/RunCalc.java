public class RunCalc implements IExerciseCalc
{
    private double m_miles;
    
    public RunCalc(double miles)
    { m_miles = miles; }
    
    public double getMiles()
    { return m_miles; }
    
    @Override
    public double calc()
    { return m_miles * 10; }
}