public class BigEyes implements IBodyPart
{

    public boolean draw(int x, int y, int w, int h)
    {
        if ((x >= 2) && (x <= 4) && (y >= 2) && (y <= 3))
        {
            System.out.print("+");
            return true;
        }
        else if ((x >= (w - 5)) && (x <= (w - 3)) && (y >= 2) && (y <= 3))
        {
            System.out.print("+");
            return true;
        }
        else
            return false;
    }

}
