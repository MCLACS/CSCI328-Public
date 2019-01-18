import java.util.*;

public class DummyStrategy implements IGuessStrategy
{
    private Random m_rand = new Random();
    
    @Override
    public int guess()
    {
        return m_rand.nextInt(100) + 1;
    }
}