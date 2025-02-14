package com.pos.controller;

import com.pos.db.LoggedUserData;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFormController {
    public AnchorPane context1;
    public void initialize() {
        //System.out.println(LoggedUserData.email);
    }

    public void printLoggedUserEmail(String email) {
        System.out.println(email);
    }

    public void goDashboardOnMouseClick(MouseEvent mouseEvent) throws IOException {
        setUi("DashboardForm");
    }

    public void goStaticOnMouseClick(MouseEvent mouseEvent) throws IOException {
        setUi("StaticticsForm");
    }

    public void goOrderHistoryOnMouseClick(MouseEvent mouseEvent) throws IOException {
        setUi("OrderHistoryForm");
    }

    public void goCustomerOnMouseClick(MouseEvent mouseEvent) throws IOException {
        setUi("CustomerForm");
    }

    public void goProductOnMouseClick(MouseEvent mouseEvent) throws IOException {
        setUi("ProductForm");
    }

    public void goPlaceOrderOnMouseClick(MouseEvent mouseEvent) throws IOException {
        setUi("PlaceOrderForm");
    }

    public void goActivitiesOnMouseClick(MouseEvent mouseEvent) throws IOException {
        setUi("ActivityForm");
    }

    private void setUi(String location) throws IOException {
        // Use FXMLLoader to load the FXML file corresponding to the provided location
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/" + location + ".fxml"));

        // Load the new page (FXML) into a Parent node
        Parent newPage = loader.load();

        // Clear any existing content in context1
        context1.getChildren().clear();

        // Add the newly loaded page into context1
        context1.getChildren().add(newPage);
    }

    public void setEmail(String email) {

    }





}
