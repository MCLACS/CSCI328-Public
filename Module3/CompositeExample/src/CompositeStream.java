import java.util.*;

public class CompositeStream implements IStream
{
    private List<IStream> m_streams;
    
    public CompositeStream()
    {
        m_streams = new ArrayList<IStream>();
    }
    
    public CompositeStream addStream(IStream s)
    {
        m_streams.add(s);
        return this;
    }
    
    @Override
    public char transform(char c)
    {
        for (IStream s : m_streams)
        {
            c = s.transform(c);
        }
        return c;
    } 
}