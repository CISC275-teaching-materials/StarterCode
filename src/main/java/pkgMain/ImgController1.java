package pkgMain;

import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class ImgController1 {

	private final boolean DEBUG = true;
	MyMovingImageView1 view;
	
	ImgController1(MyMovingImageView1 view){
		this.view = view;
		if (DEBUG) System.out.println("ic created");
	}
	
	public void drag(MouseEvent event) {
		if (DEBUG) System.out.println("ic mouse drag");
		Node n = (Node)event.getSource();
		n.setTranslateX(n.getTranslateX() + event.getX());
		n.setTranslateY(n.getTranslateY() + event.getY());
	}

	public void setHandlerForDrag(ImageView iv1) {
		iv1.setOnMouseDragged(event -> drag(event));		
	}
	
	
}
