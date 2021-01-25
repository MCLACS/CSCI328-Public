
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;

public class Controller
{
    @FXML private TextField textField;
    @FXML private ComboBox<String> comboBox;

    private Model m_model = new Model();

    public void initialize()
    {
         textField.focusedProperty().addListener((ov, oldV, newV) ->
         {
           handleValueChange();
         });
    }

    @FXML protected void handleValueChange()
    {
        m_model.setText(textField.getText());
        updateView();
    }

    @FXML protected void handleChoiceChange()
    {
        m_model.setChoice(comboBox.getValue());
        updateView();
    }

    private void updateView()
    {
      textField.setText(m_model.getText());
      comboBox.setValue(m_model.getChoice());
    }
}
