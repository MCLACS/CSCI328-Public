
public class Person extends AbstractPerson
{		
	public Person()
	{
		super();
	}
	
	public Person(String first, String last)
	{
		super(first, last);
	}
		
	public String getFullName()
	{
		return getFirst() + " " + getLast();
	}	
}

	
	

