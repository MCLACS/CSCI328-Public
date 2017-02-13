import java.util.ArrayList;
import java.util.List;

public class Main 
{
	public static void main(String[] args) 
	{
		List<Double> numbers = new ArrayList<Double>();
		MathUtils.getInstance().randomNumbers(1000, 10, 20, numbers);
		
		System.out.println(MathUtils.getInstance().min(numbers));
		System.out.println(MathUtils.getInstance().max(numbers));
		System.out.println(MathUtils.getInstance().ave(numbers));
	}
}
