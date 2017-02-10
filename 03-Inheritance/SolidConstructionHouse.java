public class SolidConstructionHouse extends House
{
    public SolidConstructionHouse(double sqrFt)
    {
        super(sqrFt);
    }

    public SolidConstructionHouse()
    {
        this(0.0);
    }

    @Override
    public double estimate()
    {
        return super.estimate()*1.25;
    }

}
