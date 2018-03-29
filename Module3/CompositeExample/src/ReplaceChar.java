public class ReplaceChar implements IStream
{
    private char m_replace = 'x';
    
    public ReplaceChar(char c)
    {
        m_replace = (c + "").toUpperCase().charAt(0);
    }
    
    @Override
    public char transform(char c)
    {
        char c2 = (c+"").toUpperCase().charAt(0);
        return c2 == m_replace ? '*' : c;
    } 
}