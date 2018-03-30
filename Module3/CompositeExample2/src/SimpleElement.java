public class SimpleElement implements IElement
{
    private String m_tag;
    
    public SimpleElement(String tag)
    {
        m_tag = tag;
    }
    
    @Override
    public String toString()
    {
        return String.format("<%s></%s>%n", m_tag, m_tag);
    }
}