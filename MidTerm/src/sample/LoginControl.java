package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by hossein on 12/15/2018.
 */
public class LoginControl implements Initializable{
    @FXML
    private AnchorPane Welcome_login;
    @FXML
    private TextField Id_input;
    @FXML
    private TextField Pass_input;

    static int i;

    public void LogInButton(ActionEvent actionEvent) throws IOException {
        for (i=0;i<Main.users.size() ; i++)
        if (Main.users.get(i).getUserName().equals(Id_input.getText()) && Main.users.get(i).getPassword().equals(Pass_input.getText())) {
            AnchorPane goGamePane = FXMLLoader.load(getClass().getResource("gamePane.fxml"));
            Welcome_login.getChildren().setAll(goGamePane);
        }
    }

    public void SignUpButton(ActionEvent actionEvent) throws IOException {
        System.out.println("fuck2");
        AnchorPane signUpPane = FXMLLoader.load(getClass().getResource("SignUpPage.fxml"));
        Welcome_login.getChildren().setAll(signUpPane);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void Id_input(ActionEvent actionEvent) {
    }

    public void Pass_input(ActionEvent actionEvent) {
    }
}
