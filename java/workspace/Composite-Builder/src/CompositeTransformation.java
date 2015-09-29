import java.util.ArrayList;
import java.util.List;

public class CompositeTransformation implements ITransformation 
{
	private List<ITransformation> m_transformations = new ArrayList<ITransformation>();
		
	@Override
	public List<Double> transform(List<Double> from)
	{		
		List<Double> to = null;
		for (ITransformation t : m_transformations)
		{
			to = t.transform(from);
			from = to;
		}
		return to;
	}

	protected List<ITransformation> getTransformations()
	{
		return m_transformations;
	}
	
	public void add(ITransformation t)
	{
		m_transformations.add(t);
	}
	
}
