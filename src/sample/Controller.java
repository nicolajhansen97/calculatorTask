package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.awt.*;

public class Controller {


    @FXML
    Button b1, b2, b3, b4;

    @FXML
    TextField t1;

    int number1;
    int number2;

    int l;
    @FXML
    public void handlerOne(){
      String temp = t1.getText();
      t1.setText(temp+"1");
    }

    @FXML
    public void handlerTwo(){
        String temp = t1.getText();
        t1.setText(temp+"2");
    }

    @FXML
    public void handlerClear(){

        t1.setText("");
    }

    @FXML
    public void handlerPlus(){
        String temp = t1.getText();
        t1.setText(temp+"+");

        number1 = Integer.parseInt(temp);

        int l = t1.getText().length();

    }

    @FXML
    public void handlerEqual(){

        // Extract 2. number;

        // Make the addition
        // Display the result


    }
}