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
        int start = 1;
        int end = 10;
        int ans = m_rand.nextInt(end-start) + start;

        int guess1 = -1;
        int guess2 = -1;
        
        System.out.printf("Start the game, don't tell anyone but the answer is %s%n", ans);

        IGuessStrategy strategy1 = new DummyStrategy();
        IGuessStrategy strategy2 = new TopDownStrategy();
    
        do
        {
            guess1 = strategy1.guess(start, end);
            guess2 = strategy2.guess(start, end);
            
            System.out.printf("Strategy 1 guessed %s%n", guess1);
            System.out.printf("Strategy 2 guessed %s%n", guess2);
            
        } while (guess1 != ans && guess2 !=ans);
            
        if (guess1 == ans)
            System.out.println("Strategy 1 wins!");  

        if (guess2 == ans)
            System.out.println("Strategy 2 wins!");  

    }
}