import java.util.*;

public class CompositeElement implements IElement
{
    private String m_tag;
    private List<IElement> m_elements;
    
    public CompositeElement(String tag)
    {
        m_tag = tag;
        m_elements = new ArrayList<IElement>();
    }
    
    public CompositeElement add(IElement e)
    {
        m_elements.add(e);
        return this;
    }
    
    @Override
    public String toString()
    {
        String s = String.format("<%s>%n", m_tag);
        for (IElement e : m_elements)
        {
            s += String.format("%s", e);
        }
        s += String.format("</%s>%n", m_tag);
        return s;
    }
}