package com.pos.controller;

import com.pos.db.DatabaseAccessCode;
import com.pos.entity.SystemUser;
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

public class SignupFormController {
    public AnchorPane context;
    public TextField txtL_name;
    public TextField txtEmail;
    public PasswordField txtPassword;
    public TextField txtF_name;
    public TextField txtContact_no;

    public void openLoginFormOnAction(ActionEvent actionEvent) throws IOException {
        setUi("LoginForm");
    }

    private void setUi(String location) throws IOException {
        Stage stage = (Stage) context.getScene().getWindow();
        stage.setScene(
                new Scene(
                        FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))
                )
        );
    }

    public void signUpOnAction(ActionEvent actionEvent) {
        SystemUser user = new SystemUser(
                null,
                txtF_name.getText(),
                txtL_name.getText(),
                txtEmail.getText(),
                txtContact_no.getText(),
                txtPassword.getText()
        );

        try{
            boolean isSaved = DatabaseAccessCode.createUser(user);
            if(isSaved){
                new Alert(Alert.AlertType.INFORMATION,"User has been created successfully").show();
                setUi("LoginForm");
            }else{
                new Alert(Alert.AlertType.WARNING,"Try Again").show();
            }
        }catch (ClassNotFoundException | SQLException | IOException e){
            new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
            e.printStackTrace();
        }
    }
}
