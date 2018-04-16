
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{

    public static void main(String[] args)
    {
        Application.launch(Main.class, args);
    }

    @Override
    public void start(Stage stage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("View.fxml"));

        stage.setTitle("Master Conveter");
        stage.setScene(new Scene(root, 400, 275));
        stage.show();
    }
}
