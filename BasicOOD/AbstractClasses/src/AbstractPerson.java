
public abstract class AbstractPerson 
{
	private String m_first;	
	private String m_last;
		
	public AbstractPerson(String first, String last)
	{
		m_first = first;
		m_last = last;
	}
	
	public AbstractPerson()
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
	
	public abstract String getFullName();
	
	@Override
	public String toString()
	{
		return getFullName();
	}
}