public class Main
{
    public static void main(String args[])
    {
        new Main().go();
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