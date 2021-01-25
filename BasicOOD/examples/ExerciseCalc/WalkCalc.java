public class WalkCalc extends RunCalc
{
    public WalkCalc(double miles)
    { 
        super(miles); 
    }
    
    @Override
    public double calc()
    { return getMiles() * 20; }
}