
public class Builder
{
	private static Builder m_instance = null;
	private Builder() {}
	public static Builder getInstance()
	{
		if (m_instance == null)
			m_instance = new Builder();
		return m_instance;
	}
	
	public ITransformation buildTransformation()
	{
		ITransformation add = new Add(10);
		ITransformation multi = new Multiply(2);
		ITransformation shuffle = new Shuffle();

		CompositeTransformation composite = new CompositeTransformation();
		composite.add(add);
		composite.add(multi);
		composite.add(shuffle);
		return composite;
	}

}
