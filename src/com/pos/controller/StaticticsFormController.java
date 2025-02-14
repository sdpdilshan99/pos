package com.pos.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class StaticticsFormController {
    public AnchorPane context1;

    public void backToHomeOnAction(ActionEvent actionEvent) throws IOException {
        setUi("DashboardForm");
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
}
