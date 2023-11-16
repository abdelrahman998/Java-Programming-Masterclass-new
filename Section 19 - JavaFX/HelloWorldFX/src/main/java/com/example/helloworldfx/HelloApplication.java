package com.example.helloworldfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

//        Parent root = FXMLLoader.load(Objects.requireNonNull(HelloApplication.class.getResource("hello-view.fxml")));


        // load the UI from FXML file
//        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
//
//        GridPane root = new GridPane();
//        root.setAlignment(Pos.CENTER);
//        root.setVgap(10);
//        root.setHgap(10);
//
//        Label greeting = new Label("Welcome to JavaFX!");
//        greeting.setTextFill(Color.GREEN);
//        greeting.setFont(Font.font("Times New Roman", FontWeight.BOLD, 70));
//
//        root.getChildren().add(greeting);


//        primaryStage.setTitle("Hello JavaFX!");
//        primaryStage.setScene(new Scene(root, 500, 240));
//        primaryStage.show();

        primaryStage.setTitle("Messaging Chat App");

        // Create a VBox to hold the chat components
        VBox chatLayout = new VBox();
        chatLayout.setSpacing(10);
        chatLayout.setPadding(new Insets(10));

        // Create a TextArea for displaying the chat messages
        TextArea chatTextArea = new TextArea();
        chatTextArea.setEditable(false);
        chatTextArea.setWrapText(true);
        chatTextArea.setPrefHeight(400);

        // Create a TextField for entering new messages
        TextField messageTextField = new TextField();
        messageTextField.setPromptText("Type your message...");
        messageTextField.setPrefHeight(40);

        // Create a Button for sending messages
        Button sendButton = new Button("Send");
        sendButton.setPrefHeight(40);
        sendButton.setDefaultButton(true); // Triggered when Enter is pressed

        // Add components to the chat layout
        chatLayout.getChildren().addAll(chatTextArea, messageTextField, sendButton);

        // Event handler for the send button
        sendButton.setOnAction(event -> {
            String message = messageTextField.getText();
            if (!message.isEmpty()) {
                chatTextArea.appendText("You: " + message + "\n");
                messageTextField.clear();
            }
        });

        // Create a scene and set it in the stage
        Scene scene = new Scene(chatLayout, 400, 500);
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();



    }

    public static void main(String[] args) {
        launch();
    }

}