
public class Room extends CompositeGameObject 
{
	private String m_description;
	public Room(String desc)
	{
		m_description = desc;
	}
	
	@Override
	public String getDescription() 
	{
		System.out.println("You enter " + m_description);
		System.out.println("The room contains:");
		System.out.println(super.getDescription());
		return "";
	}	
}
