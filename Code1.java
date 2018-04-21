package JavaFx1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Code1 extends Application {

		
		TextField txtFirst = new TextField();
		TextField txtSecond = new TextField();
		TextField txtResult = new TextField();
		@Override 
		   public void start(Stage stage) {
			
			stage.setTitle("My JavaFX Demo");			// Label the stage (a window)
			
			Pane theRoot = new Pane();
	Label lblHead = new Label("My JavaFX Demo Class");
			
			Label lblFirst = new Label("First No.");
			Label lblSecond = new Label("Second No.");
			Label lblResult = new Label("Result");
			
			Button btnOk = new Button("OK");
			Button btnClear = new Button("Clear");
			Button btnExit = new Button("Exit");
			
			lblHead.setLayoutX(300); lblHead.setLayoutY(50);
			lblHead.setFont(Font.font("Arial",24));
			
			
			lblFirst.setLayoutX(50); lblFirst.setLayoutY(100);
			lblSecond.setLayoutX(50); lblSecond.setLayoutY(150);
			
			txtFirst.setLayoutX(200); txtFirst.setLayoutY(100);
			
			btnOk.setLayoutX(50); btnOk.setLayoutY(300);
			
			btnOk.setOnAction((event) -> { calculation(); });
			
			theRoot.getChildren().addAll(lblHead, lblFirst,lblSecond,lblResult,
	                txtFirst,txtSecond,txtResult,
	                btnOk,btnClear,btnExit);
			
		
			Scene scene = new Scene(theRoot,800,600); //Creating a scene object
		     
			stage.setScene(scene);    //Adding scene to the stage 
		      
		     stage.show();            //Displaying the contents of the stage
		}
		
		public void calculation() {
			txtFirst.setText("Hello");
		}
		
		
		 public static void main(String args[]){ 
		      launch(args); 
		   } 
	}

		
