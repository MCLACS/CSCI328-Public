
public class Random implements ICanGenerateNum 
{
	private java.util.Random m_rand = new java.util.Random();
	
	@Override
	public int generate(int from, int to) 
	{
		if (to <= from)
			throw new IllegalArgumentException("to must be greater than from");
		if (from < 0 || to < 0)
			throw new IllegalArgumentException("from and to must be positive");
			
		return m_rand.nextInt(to-from+1) + from;
	}
}
