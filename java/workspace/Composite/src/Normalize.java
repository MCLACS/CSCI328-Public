import java.util.ArrayList;
import java.util.List;

public class Normalize implements ITransformation 
{
	@Override
	public List<Double> transform(List<Double> from) 
	{
		List<Double> to = new ArrayList<Double>();
		double min = min(from);
		double max = max(from);
		for (double d : from)
			to.add((d-min)/(max-min));
		return to;
	}

	private double max(List<Double> numbers)
	{
		if (numbers.size() == 0)
			throw new IllegalArgumentException("list must have at least one value");
				
		double largest = Double.MIN_VALUE;
		for (double d : numbers)
			largest = (d > largest) ? d : largest; 
		return largest;
	}

	private double min(List<Double> numbers)
	{
		if (numbers.size() == 0)
			throw new IllegalArgumentException("list must have at least one value");
		
		double smallest = Double.MAX_VALUE;
		for (double d : numbers)
			smallest = (d < smallest) ? d : smallest; 
		return smallest;
	}
	
	
}
