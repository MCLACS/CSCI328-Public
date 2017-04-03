public class AskMain
{
    public static void main(String args[])
    {
        new AskMain().go();
    }
    
    public void go()
    {
        IAskForCash strat = getStrategy();
        strat.ask();
    }
    
    private IAskForCash getStrategy()
    {
        return new Gentle();    
    }
}