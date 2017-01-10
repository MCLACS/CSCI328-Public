import java.util.ArrayList;
import java.util.List;

public class Main 
{
	public static void main(String[] args) 
	{
		List<Double> numbers = new ArrayList<Double>();
		for (int i = 0; i < 5; i++)
			numbers.add((double)i*i);
		
		System.out.println("Numbers: " + numbers + "\n");

		ITransformation shuffle = new Shuffle();
		System.out.println("Shuffled: " + shuffle.transform(numbers) + "\n");		
		
		ITransformation add = new Add(10);
		System.out.println("Add 10: " + add.transform(numbers) + "\n");

		ITransformation multi = new Multiply(2);
		System.out.println("Multiply 2: " + multi.transform(numbers) + "\n");
		
		ITransformation norm = new Normalize();
		System.out.println("Normalize: " + norm.transform(numbers) + "\n");		
		
		ITransformation composite = Builder.getInstance().buildTransformation();
		List<Double> newNumbers = composite.transform(numbers);
		System.out.println("Composite: " + newNumbers + "\n");	
		
		System.out.println("Composite normalized: " + norm.transform(newNumbers) + "\n");	

		ITransformation norm2 = Builder.getInstance().buildTransformation2();
		System.out.println("Norm: " + norm2.transform(numbers) + "\n");	
	}
}
