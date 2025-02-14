package com.pos.controller;

import com.pos.db.DatabaseAccessCode;
import com.pos.db.LoggedUserData;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class LoginFormController {
    public AnchorPane context;
    public PasswordField txtPassword;
    public TextField txtEmail;

    public void openSignupFormOnAction(ActionEvent actionEvent) throws IOException {
        setUi("SignupForm");
    }

    private void setUi(String location) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/"+location+".fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = (Stage) context.getScene().getWindow();

        MainFormController controller = loader.getController();
        controller.printLoggedUserEmail(txtEmail.getText());
        stage.setScene(scene);
    }

    public void openMainFormOnAction(ActionEvent actionEvent) throws IOException {
        try{
            boolean isSaved = DatabaseAccessCode.loginUser(txtEmail.getText(), txtPassword.getText());
            if(isSaved){
                LoggedUserData.email = txtEmail.getText();
                new Alert(Alert.AlertType.INFORMATION,"User login successfully").show();
                setUi("MainForm");;
            }else{
                new Alert(Alert.AlertType.WARNING,"Email or Password Incorrect").show();
            }
        }catch (ClassNotFoundException | SQLException | IOException e){
            new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
            e.printStackTrace();
        }

    }
}
