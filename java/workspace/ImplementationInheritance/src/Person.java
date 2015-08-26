
public class Person 
{
	private String m_first;	
	private String m_last;
		
	public Person(String first, String last)
	{
		m_first = first;
		m_last = last;
	}
	
	public Person()
	{
		this("Unknown" , "Unknown");
	}
	
	public String getFirst()
	{ 
		return m_first;
	}

	public String getLast()
	{ 
		return m_last;
	}
	
	public String getFullName()
	{
		return m_first + " " + m_last;
	}
	
	@Override
	public String toString()
	{
		return getFullName();
	}
}

	
	

