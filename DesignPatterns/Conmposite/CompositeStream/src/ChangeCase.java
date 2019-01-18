public class ChangeCase implements IStream
{
    private boolean m_upper = true;
    
    public ChangeCase(boolean upper)
    {
        m_upper = upper;
    }
    
    @Override
    public char transform(char c)
    {
        String temp = "" + c;
        return m_upper ? temp.toUpperCase().charAt(0) : temp.toLowerCase().charAt(0);
    }
}