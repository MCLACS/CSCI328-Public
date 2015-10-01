
public class Prize implements IGameObject
{
	private String m_description;
	
	public Prize(String desc)
	{
		m_description = desc;
	}
	
	@Override
	public String getDescription()
	{
		return m_description;
	}

	@Override
	public String interactWith()
	{
		return null;
	}

}
