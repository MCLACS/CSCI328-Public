import java.util.ArrayList;
import java.util.List;


public class Min implements ITransformation 
{
	@Override
	public List<Double> transform(List<Double> from) 
	{
		double min = Double.MAX_VALUE;
		List<Double> to = new ArrayList<Double>();
		for (double d : from)
		{
			if (d < min)
				min = d;
		}
		to.add(min);
		return to;
	}
}
