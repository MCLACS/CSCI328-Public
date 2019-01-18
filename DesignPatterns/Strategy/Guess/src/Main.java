import java.util.*;

public class Main
{
    private Random m_rand = new Random();
    
    public static void main(String args[])
    {
        new Main().go();
    }
    
    public void go()
    {
        int ans = m_rand.nextInt(100) +1;
        System.out.printf("Start the game, don't tell anyone but the answer is %s%n", ans);
        
        int guess1 = -1;
        int guess2 = -1;

        MindReader tom = makeTomTheReader();
        MindReader sally = makeSallyTheReader();
    
        do
        {
            guess1 = tom.readMind();
            guess2 = sally.readMind();
            
            System.out.printf("Tom guessed %s%n", guess1);
            System.out.printf("Sally guessed %s%n", guess2);
            
        } while (guess1 != ans && guess2 !=ans);
            
        if (guess1 == ans)
            System.out.println("Tom wins!");  

        if (guess2 == ans)
            System.out.println("Sally wins!");  

    }
    
    private MindReader makeTomTheReader()
    {
        return new MindReader(new DummyStrategy());
    }
    
    private MindReader makeSallyTheReader()
    {
        return new MindReader(new TopDownStrategy());
    }
    
}