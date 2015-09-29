import java.util.ArrayList;
import java.util.List;

public class Max implements ITransformation 
{
	@Override
	public List<Double> transform(List<Double> from) 
	{
		double max = 0;
		List<Double> to = new ArrayList<Double>();
		for (double d : from)
		{
			if (d > max)
				max = d;
		}
		to.add(max);
		return to;
	}
}
