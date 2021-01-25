import java.util.*;
import java.io.*;

public class Main
{
    public static void main (String[] args) throws Exception
    {
        IStream stream = Builder.getInstance().createStream();
        Scanner in = new Scanner(new File("fun.txt"));     
        while (in.hasNextLine())
        {
            String line = in.nextLine();
            for (char c : line.toCharArray())
            {
                System.out.printf("%s", stream.transform(c));
            }
            System.out.println();
        }
    }
}