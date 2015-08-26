import java.util.ArrayList;
import java.util.List;


public class Add implements ITransformation 
{
	private double m_factor = 1.0;
	
	public Add(double factor)
	{
		m_factor = factor;
	}
	
	@Override
	public List<Double> transform(List<Double> from) 
	{
		List<Double> to = new ArrayList<Double>();
		for (double d : from)
			to.add(d+m_factor);
		return to;
	}
}
