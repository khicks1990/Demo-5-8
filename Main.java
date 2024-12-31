//NOTE: All .css files for demos 5-8 are included here, just fork to your own account and change the line which sets the stylesheet to see all of the examples

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class Main extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }

   @Override
   public void start(Stage primaryStage)
   {
      // Create a Label control.
      Label myLabel = new Label("Hello world!");

      // Put the Label in a VBox.
      VBox vbox = new VBox(myLabel);
      vbox.setAlignment(Pos.CENTER);
      vbox.setPadding(new Insets(10));

      // Create a Scene and display it.
      Scene scene = new Scene(vbox);
      scene.getStylesheets().add("demo6.css"); //change this line to see all examples
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}