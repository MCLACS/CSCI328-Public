public class TopDownStrategy implements IGuessStrategy
{
    private int m_lastGuess = 0;
    
    @Override
    public int guess()
    {
        if (m_lastGuess <= 0)
            m_lastGuess = 100;
        else
            m_lastGuess = m_lastGuess - 1;
        return m_lastGuess;
    }
}