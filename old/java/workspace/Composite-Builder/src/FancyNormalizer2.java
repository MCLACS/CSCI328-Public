import java.util.ArrayList;
import java.util.List;

public class FancyNormalizer2 extends CompositeTransformation
{
	@Override
	public List<Double> transform(List<Double> from) 
	{
		List<Double> to = new ArrayList<Double>();
		ITransformation min = getTransformations().get(0);
		ITransformation max = getTransformations().get(1);

		double dmin = min.transform(from).get(0);
		double dmax = max.transform(from).get(0);

		for (double d : from)
			to.add((d-dmin)/(dmax-dmin));
		return to;
	}
}
