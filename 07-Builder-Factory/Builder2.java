public class Builder2 implements IBuilder {

	@Override
	public MrPotatoHead makePotatoHead() 
	{
        return new MrPotatoHead(22, 12, new NoHead(),
                new BigEyes(), new SimpleNose(), new Happy());
	}

}
