public class Builder1 implements IBuilder {

	@Override
	public MrPotatoHead makePotatoHead() 
	{
        return new MrPotatoHead(22, 12, new SquareHead(),
                new SmallEyes(), new SimpleNose(), new Sad());
	}

}
