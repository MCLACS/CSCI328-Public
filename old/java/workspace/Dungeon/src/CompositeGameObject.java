import java.util.ArrayList;
import java.util.List;

public class CompositeGameObject implements IGameObject 
{
	private List<IGameObject> m_objects;
	
	public CompositeGameObject()
	{
		m_objects = new ArrayList<IGameObject>();
	}
	
	public void add(IGameObject obj)
	{
		m_objects.add(obj);
	}
	
	@Override
	public String getDescription() 
	{
		String ret = "";
		for (IGameObject o : m_objects)
			ret = ret + o.getDescription() + "\n";
		return ret;
	}

	@Override
	public String interactWith() 
	{
		return null;
	}

}
