import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Shuffle implements ITransformation {

	@Override
	public List<Double> transform(List<Double> from) 
	{
		List<Double> copy = new ArrayList<Double>(from);
		Collections.shuffle(copy);
		return copy;
	}

}
