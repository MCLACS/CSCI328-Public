
public class Top implements ICanGenerateNum 
{

	@Override
	public int generate(int from, int to) 
	{
		if (to <= from)
			throw new Error("to must be greater than from");
		if (from < 0 || to < 0)
			throw new Error("from and to must be positive");
			
		return to;
	}
}
