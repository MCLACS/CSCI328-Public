public class SadHeadFactory implements IBodyPartFactory
{
    @Override
    public IBodyPart createEyes()
    {
        return new SmallEyes();
    }

    @Override
    public IBodyPart createNose()
    {
        return new SimpleNose();
    }

    @Override
    public IBodyPart createMouth()
    {
        return new Sad();
    }

    @Override
    public IBodyPart createHead()
    {
        return new AngleHead();
    }

}
