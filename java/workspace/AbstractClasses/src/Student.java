
public class Student extends AbstractPerson
{		
	private String m_id;
	
	public Student()
	{
		super();
		m_id = "Unknown";
	}
	
	public Student(String first, String last, String id)
	{
		super(first, last);
		m_id = id;
	}
		
	@Override
	public String getFullName()
	{
		return String.format("%s (%s)", getFirst() + " " + getLast(), m_id); 
	}	
}

	
	

