
public class Monster extends CompositeGameObject 
{
	private String m_description;
	public Monster(String desc)
	{
		m_description = desc;
	}
	
	@Override
	public String getDescription() 
	{
		System.out.println(m_description);
		System.out.println("The monster is hoarding:");
		System.out.println(super.getDescription());
		return "";
	}	
}
