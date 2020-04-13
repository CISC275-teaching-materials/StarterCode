package pkgMain;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/*
 * 
 */

public class MyMovingImageView1 extends Application {

	private ImgController1 imc;
	private ImageView iv1;

	public MyMovingImageView1(){
    	iv1 = new ImageView();
		imc = new ImgController1(this);
	}
	
    @Override
    public void start(Stage stage) {
 
    	Image im1 = new Image(getClass().getResourceAsStream("/img/commonMilkweed.png"));
    	iv1.setImage(im1);
    	iv1.setPreserveRatio(true);
    	iv1.setFitHeight(100);

    	imc.setHandlerForDrag(iv1);

    	Scene scene = new Scene(new StackPane(iv1), 800, 600);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
	
}