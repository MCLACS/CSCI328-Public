
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

public class Controller
{
    @FXML private Text actiontarget;
    @FXML private PasswordField passwordField;
    @FXML private TextField userNameField;

    private Model m_model = new Model();

    @FXML protected void handleSubmitButtonAction(ActionEvent event)
    {
        m_model.setUserName(userNameField.getText());
        m_model.setPassword(passwordField.getText());
        updateView();
    }

    private void updateView()
    {
      actiontarget.setText(m_model.getMessage());
    }
}
