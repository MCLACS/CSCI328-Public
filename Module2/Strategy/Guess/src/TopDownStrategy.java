public class TopDownStrategy implements IGuessStrategy
{
    private int m_lastGuess = -1;
    
    @Override
    public int guess(int start, int end)
    {
        if (m_lastGuess == -1)
            m_lastGuess = end;
        else
            m_lastGuess = m_lastGuess - 1;
            
        if (m_lastGuess < start)
            throw new IllegalStateException("Stop asking!!");
            
        return m_lastGuess;
    }
}