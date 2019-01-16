public class MindReader
{
    private IGuessStrategy m_strategy;
    
    public MindReader(IGuessStrategy strategy)
    {
        m_strategy = strategy;
    }
    
    public int readMind()
    {
        return m_strategy.guess();
    }
}