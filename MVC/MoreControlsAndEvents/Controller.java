
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;

public class Controller
{
    @FXML private TextField textField1;
    @FXML private TextField textField2;
    @FXML private TextField textField3;
    @FXML private TextField textField4;

    @FXML private ComboBox comboBox1;
    @FXML private ComboBox comboBox2;
    @FXML private ComboBox comboBox3;
    @FXML private ComboBox comboBox4;


    private Model m_model = new Model();

    public void initialize()
    {
         textField1.focusedProperty().addListener((ov, oldV, newV) -> 
         {
            if (!newV)
            {
               handleValueChange1();
            }
         });
         textField2.focusedProperty().addListener((ov, oldV, newV) ->
         {
            if (!newV)
            {
               handleValueChange2();
            }
         });
         textField3.focusedProperty().addListener((ov, oldV, newV) ->
         {
            if (!newV)
            {
               handleValueChange3();
            }
         });
         textField4.focusedProperty().addListener((ov, oldV, newV) ->
         {
            if (!newV)
            {
               handleValueChange4();
            }
         });
     }

    @FXML protected void handleValueChange1()
    {
        m_model.setValue1(convert(textField1));
        updateView();
    }

    @FXML protected void handleValueChange2()
    {
        m_model.setValue2(convert(textField2));
        updateView();
    }

    @FXML protected void handleValueChange3()
    {
        m_model.setValue3(convert(textField3));
        updateView();
    }

    @FXML protected void handleValueChange4()
    {
        m_model.setValue4(convert(textField4));
        updateView();
    }

    @FXML protected void handleListChange1()
    {
        m_model.setUnits1(comboBox1.getValue().toString());
        updateView();
    }

    @FXML protected void handleListChange2()
    {
        m_model.setUnits2(comboBox2.getValue().toString());
        updateView();
    }

    @FXML protected void handleListChange3()
    {
        m_model.setUnits3(comboBox3.getValue().toString());
        updateView();
    }

    @FXML protected void handleListChange4()
    {
        m_model.setUnits4(comboBox4.getValue().toString());
        updateView();
    }

    private double convert(TextField tf)
    {
      try
      {
        return Double.parseDouble(tf.getText());
      }
      catch (NumberFormatException e)
      {
        return 0.0;
      }
    }
    private void updateView()
    {
      textField1.setText(m_model.getValue1()+"");
      textField2.setText(m_model.getValue2()+"");
      textField3.setText(m_model.getValue3()+"");
      textField4.setText(m_model.getValue4()+"");
    }
}
