package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by hossein on 12/15/2018.
 */
public class SignUpControl  implements Initializable {

    public Label Id_setter;

    @FXML
    private AnchorPane signUpPane;
    @FXML
    private TextField user_set;
    @FXML
    private TextField password_set;




    public void BackLogin(ActionEvent actionEvent) throws IOException {
        Main.users.add(new UserPass(user_set.getText(),password_set.getText(),0));
        AnchorPane back = FXMLLoader.load(getClass().getResource("WelcomePage.fxml"));
        signUpPane.getChildren().setAll(back);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }


    public void password_set(ActionEvent actionEvent) {


    }

    public void user_set(ActionEvent actionEvent) {
    }
}
