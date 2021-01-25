public class DummyStrategy implements IGuessStrategy
{
    @Override
    public int guess(int start, int end)
    {
        return (int)((end-start+1)/2.0);
    }
}