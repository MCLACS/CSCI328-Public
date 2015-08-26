
public class Student extends Person 
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
		String name = super.getFullName();
		return String.format("%s (%s)", name, m_id); 
	}	
}
