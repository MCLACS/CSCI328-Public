public class Monster
{
	private String m_name = "";
	private int m_hitPoints = 0;

	public Monster(String name, int hitPoints)
	{
		m_name = name;
		m_hitPoints = hitPoints;
	}

	public String toString()
	{
		String ret = String.format("My name is %s and I have %d hit points.",
			m_name, m_hitPoints);
		return ret;
	}
}
