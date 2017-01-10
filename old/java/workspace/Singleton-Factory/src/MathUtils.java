import java.util.List;
import java.util.Random;


public class MathUtils 
{	
	private static MathUtils m_instance = null;
	private MathUtils() {}
	public static MathUtils getInstance()
	{
		if (m_instance == null)
			m_instance = new MathUtils();
		return m_instance;
	}

	private static Random m_rand = new Random();
	
	public double ave(List<Double> numbers)
	{
		if (numbers.size() == 0)
			throw new IllegalArgumentException("list must have at least one value");
				
		double total = 0.0;
		for (double d : numbers)
			total += d;
		return total/numbers.size();
	}

	public double max(List<Double> numbers)
	{
		if (numbers.size() == 0)
			throw new IllegalArgumentException("list must have at least one value");
				
		double largest = Double.MIN_VALUE;
		for (double d : numbers)
			largest = (d > largest) ? d : largest; 
		return largest;
	}

	public double min(List<Double> numbers)
	{
		if (numbers.size() == 0)
			throw new IllegalArgumentException("list must have at least one value");
		
		double smallest = Double.MAX_VALUE;
		for (double d : numbers)
			smallest = (d < smallest) ? d : smallest; 
		return smallest;
	}

	public void randomNumbers(int size, int from, int to, List<Double> numbers)
	{
		for (int i = 0; i < size; i++)
		{
			double d = (m_rand.nextDouble() * (to-from)) + from;
			numbers.add(d);
		}		
	}


}
