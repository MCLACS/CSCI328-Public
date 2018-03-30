public class Builder
{
    private static Builder m_instance;
    public static Builder getInstance()
    {
        if (m_instance == null)
            m_instance = new Builder();
        return m_instance;
    }
    
    private Builder() {}
    
    public IElement createElement()
    {
        CompositeElement e1 = new CompositeElement("animals");
        CompositeElement e2 = new CompositeElement("cats");
        IElement e3 = new SimpleElement("Pokey");
        IElement e4 = new SimpleElement("Minnie");
        IElement e5 = new SimpleElement("Sarge");
        
        e1.add(e2);
        e2.add(e3).add(e4).add(e5);
        
        return e1;
    }
}