public class RandomMain
{
    public static void main(String[] args)
    {
        new RandomMain().go();
    }
    
    private void go()
    {
        System.out.println(RandomSingleton.getInstance().getRand().nextInt(10));
        System.out.println(RandomSingleton.getInstance().getRand().nextInt(10));
        System.out.println(RandomSingleton.getInstance().getRand().nextInt(10));
    }
}