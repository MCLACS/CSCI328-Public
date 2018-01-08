public class Main
{
    public static void main (String[] args) 
    {
        Main m = new Main();
        m.go();
    }
    
    private void go()
    {
        double height = 66.0;

        Triplet t = calcLengths(height, SkiConstants.getInstance());
        System.out.printf("Ski lengths %s:", t);
    }
    
    private Triplet calcLengths(double height, ISkiConstants constants)
    {
        Triplet t = new Triplet();
        t.beginner = constants.getBeginnerFactor() * height;
        t.intermediate = constants.getIntermediateFactor() * height;
        t.expert = constants.getExpertFactor() * height;
        return t;
    }
    
    private class Triplet
    {
        double beginner;
        double intermediate;
        double expert;
        
        @Override
        public String toString()
        { 
            return String.format("Beg: %.2f Int: %.2f Exp: %.2f", 
                beginner, intermediate, expert);
        }
    }
}