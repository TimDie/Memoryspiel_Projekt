package main;

import java.util.ArrayList;
import java.util.Observable;
import java.util.concurrent.TimeUnit;

import javafx.application.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.*;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Programm extends Application   {


	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub



		Scene scene = view.View.initScene();
		primaryStage.setScene(scene);
		primaryStage.setTitle("Memory 0.9.1");
		primaryStage.show();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}




}

