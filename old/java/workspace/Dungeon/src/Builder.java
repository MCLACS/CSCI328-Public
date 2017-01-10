
public class Builder 
{
	private static Builder m_instance;
	public static Builder getInstance()
	{
		if (m_instance == null)
			m_instance = new Builder();
		return m_instance;
	}
	private Builder()
	{}
	
	public IGameObject createDungeon()
	{
		IGameObject p1 = new Prize("a gold coin worth 10 quidriples");
		IGameObject p2 = new Prize("a can of corn");
		IGameObject p3 = new Prize("a bag of donuts");
		
		CompositeGameObject m1 = new Monster("a pink flying tiger shark");
		m1.add(p3);
		
		CompositeGameObject room1 = new Room("a dark smelly classroom");
		room1.add(m1);
		room1.add(p1);
		room1.add(p2);
		
		return room1;
	}
	
	
	
}
