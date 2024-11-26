/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package question17;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.shape.*;

/**
 *
 * @author areba
 */
public class Question17 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        //my buttons:
        Button b1 = new Button("left");
        
        Button b3  =new Button("right");
        
        Button b4 = new Button("up");
        
        Button b5 = new Button("down");
        
        Rectangle r1 = new Rectangle();
            r1.setHeight(30);
            r1.setWidth(10);
            r1.setX(0);
            r1.setY(0);
        
        
        b1.setOnMouseDragEntered(e->{
            
            
        }
        );
        
        
        
        TilePane tp1 = new TilePane();
        tp1.setAlignment(Pos.BOTTOM_CENTER);
        tp1.getChildren().addAll(r1,b1,b3,b4,b5);
        //VBox vb1  = new VBox();
        //vb1.getChildren().addAll(r1,tp1);
        
        Scene scene = new Scene(tp1, 300, 250);
        
        primaryStage.setTitle("moving the rectangle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
