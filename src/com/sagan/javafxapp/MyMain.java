package com.sagan.javafxapp;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Optional;

public class MyMain extends Application {

	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("app_layout.fxml"));
		VBox rootNode = loader.load();

		MenuBar menuBar = createMenu();
		rootNode.getChildren().add(0,menuBar);


		Scene scene = new Scene(rootNode);

		primaryStage.setScene(scene);
		primaryStage.setTitle("Temperature Converter");
		primaryStage.show();
	}
		private  MenuBar createMenu()
		{

			Menu fileMenu = new Menu("File");
			MenuItem newMenuItem = new MenuItem("New");

			newMenuItem.setOnAction(event -> System.out.println("New Menu Item Clicked"));
			MenuItem SeparatorMenuItem = new SeparatorMenuItem();
			MenuItem quitMenuItem = new MenuItem("Quit");
			quitMenuItem.setOnAction(event -> {
				Platform.exit();
				System.exit(0);
			});
			fileMenu.getItems().addAll(newMenuItem,SeparatorMenuItem,quitMenuItem);

			Menu helpMenu = new Menu("Help");
			MenuItem aboutMenuItem = new MenuItem("About");
			aboutMenuItem.setOnAction(event -> aboutMenuItem());
			helpMenu.getItems().addAll(aboutMenuItem);

			MenuBar menuBar = new MenuBar();
			menuBar.getMenus().addAll(fileMenu,helpMenu);

			return  menuBar ;
	    }

	    private void aboutMenuItem(){

		    Alert alertDialog = new Alert(Alert.AlertType.INFORMATION);
		    alertDialog.setTitle("My First Desktop App");
			alertDialog.setHeaderText("Learning Java");
			alertDialog.setContentText("i am vasu and i am a beginner");

			ButtonType yesBtn = new ButtonType("Yes");
			ButtonType noBtn = new ButtonType("No");
			alertDialog.getButtonTypes().setAll(yesBtn,noBtn);
		    Optional<ButtonType> clickeBtn =  alertDialog.showAndWait();

		    if(clickeBtn.get() == yesBtn){
			    System.out.println("Yes Button Clicked");}
			    else {
				    System.out.println("No Button Clicked");
			    }
		    }
	    }


