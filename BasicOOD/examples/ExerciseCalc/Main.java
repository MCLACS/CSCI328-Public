public class Main
{
    public static void main(String[] args)
    {
        IExerciseCalc e = new RunCalc(10);
        System.out.println(e.calc());

        e = new WalkCalc(10);
        System.out.println(e.calc());
    }
}