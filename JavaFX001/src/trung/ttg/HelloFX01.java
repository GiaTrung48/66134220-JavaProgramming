package trung.ttg;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloFX01 extends Application {
		@Override
	public void start(Stage primaryStage) throws Exception {
			// Tạo 1 nút bấm 
			Button btn = new Button();
			// 
			btn.setText("Xin chào quý khách");
			// Tạo cửa sổ 
			StackPane root = new StackPane();
			
			root.getChildren().add(btn);
			
			// Màn hình / cảnh hiển thị
			Scene scn = new Scene(root, 400, 300);
			
			// Tiêu đề 
			primaryStage.setTitle("Java App");
			primaryStage.setScene(scn);
			primaryStage.show();
	}
		
			
	public static void main(String[] args) {
		launch(args);

	}

	

}

