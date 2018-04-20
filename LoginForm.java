package JavaFx1;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LoginForm extends Application {

		
		TextField txtFirst = new TextField();
		PasswordField txtSecond = new PasswordField();
		private Labeled lblThnk;
		
		@Override 
		   public void start(Stage stage) {
			
			stage.setTitle("Login form by Jawahar");			// Label the stage (a window)
			
			Pane theRoot = new Pane();
			// setting labels and buttons and text fields
	       Label lblHead = new Label("Login form");
			
			Label lblUser = new Label("User");
			Label lblPassword = new Label("Password");
			
            DatePicker datePicker = new DatePicker();
			
			Button btnOk = new Button("Login");
			
			
			lblHead.setLayoutX(300); lblHead.setLayoutY(50);
			lblHead.setFont(Font.font("Arial",24));
			
			
			lblUser.setLayoutX(50); lblUser.setLayoutY(100);
			lblPassword.setLayoutX(50); lblPassword.setLayoutY(150);
			
			datePicker.setLayoutX(200); datePicker.setLayoutY(240);
			
			txtFirst.setLayoutX(200); txtFirst.setLayoutY(100);
			txtSecond.setLayoutX(200); txtSecond.setLayoutY(145);
			
			btnOk.setLayoutX(300); btnOk.setLayoutY(200);
			
			btnOk.setOnAction((event) -> { });
			
			
			theRoot.getChildren().addAll(lblHead, lblUser,lblPassword,
	                txtFirst,txtSecond,datePicker,
	                btnOk);
			
		
			Scene scene = new Scene(theRoot,600,400); //Creating a scene object
		     
			stage.setScene(scene);    //Adding scene to the stage 
		      
		     stage.show();            //Displaying the contents of the stage
		}
		
	
		
	



		public static void main(String args[]){ 
		      launch(args); 
		   } 
	}

		
