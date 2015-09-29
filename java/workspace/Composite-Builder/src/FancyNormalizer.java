import java.util.ArrayList;
import java.util.List;

public class FancyNormalizer implements ITransformation 
{
	private ITransformation m_min = new Min();
	private ITransformation m_max = new Max();

	@Override
	public List<Double> transform(List<Double> from) 
	{
		List<Double> to = new ArrayList<Double>();
		double min = m_min.transform(from).get(0);
		double max = m_max.transform(from).get(0);
		for (double d : from)
			to.add((d-min)/(max-min));
		return to;
	}
}
