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

public class MyMovingImageView2 extends Application {

	private ImgController2 imc;
	private ImageView iv1;
	private final double WIDTH = 800;
	private final double HEIGHT = 600;
	
	public MyMovingImageView2(){
    	iv1 = new ImageView();
		imc = new ImgController2(this);
	}
		
    @Override
    public void start(Stage stage) {
 
    	Image im1 = new Image(getClass().getResourceAsStream("/img/commonMilkweed.png"));
    	iv1.setImage(im1);
    	iv1.setPreserveRatio(true);
    	iv1.setFitHeight(100);
    	iv1.setOnMouseDragged(imc.getHandlerForDrag());

    	Scene scene = new Scene(new StackPane(iv1), WIDTH, HEIGHT);
        stage.setScene(scene);
        
		iv1.setTranslateX(iv1.getLayoutX() - WIDTH/2 + imc.getStartingX());
		iv1.setTranslateY(iv1.getLayoutY() - HEIGHT/2 + imc.getStartingY());

        stage.show();
    }
    public void setX(double x) {
    	iv1.setTranslateX(iv1.getLayoutX() - WIDTH/2 + x);
    }
    public void setY(double y) {
    	iv1.setTranslateY(iv1.getLayoutY() - HEIGHT/2 + y);
    }
    public static void main(String[] args) {
        launch();
    }

}