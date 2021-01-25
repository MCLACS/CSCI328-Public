public class SimpleNose implements IBodyPart
{

    public boolean draw(int x, int y, int w, int h)
    {
        if ((x >= ((w / 2) - 2)) && (x <= ((w / 2))) && (y == (h / 2)))
        {
            System.out.print("^");
            return true;
        }
        else
            return false;
    }
}
