import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class MainFrame extends JFrame
{
  public static void main(String args[])
  {
    JFrame frame = new MainFrame();
    frame.setVisible(true);
  }

  public MainFrame()
  {
    super("Game Engine Example");
    setSize(400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    int interval = 100;

    // model
    List<IGameObject> objects = new ArrayList<IGameObject>();
    objects.add(Factory.getInstance().createEnemy(10, 10, 30, 30, 5, 5));

    // view
    IGameView view = Factory.getInstance().createView(objects);

    // controller
    IGameController controller = Factory.getInstance().createController(interval, objects, view);

    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(view.getJPanel(), BorderLayout.CENTER);

    controller.startGame();
  }
}
