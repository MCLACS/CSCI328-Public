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
    
    public IStream createStream()
    {
        IStream s1 = new ReplaceChar('b');
        IStream s2 = new ReplaceChar('g');
        IStream s3 = new ChangeCase(true);
        
        CompositeStream s4 = new CompositeStream();
        s4.addStream(s1).addStream(s2).addStream(s3);
        
        return s4;
    }
}