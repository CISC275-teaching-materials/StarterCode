package pkgMain;

import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class ImgController2 {

	private final boolean DEBUG = true;
	MyMovingImageView2 view;
	MyMovingImageModel2 model;
	
	ImgController2(MyMovingImageView2 view){
		this.view = view;
		model = new MyMovingImageModel2();
		if (DEBUG) System.out.println("ic created");
	}
	
	public void drag(MouseEvent event) {
		Node n = (Node)event.getSource();
		if (DEBUG) System.out.println("ic mouse drag tx: " + n.getTranslateX() + ", ex: " + event.getX() );
		model.setX(model.getX() + event.getX()); //event.getX() is the amount of horiz drag
		model.setY(model.getY() + event.getY());
		view.setX( model.getX() );
		view.setY( model.getY() );
		//n.setTranslateX(n.getTranslateX() + event.getX()); //not MVC! what problem does this create?
		//n.setTranslateY(n.getTranslateY() + event.getY());
	}

	public EventHandler getHandlerForDrag() {
		return event -> drag((MouseEvent) event);
	}

/*	public void tellModelStartingCoords(double x, double y) {
		model.setX(view.getImgStartingX());
		model.setY(view.getImgStartingY());
		if (DEBUG) System.out.println("start: " + model.getX() + " " + model.getY());
	}
*/
	public double getStartingX() {
		return model.getX();
	}
	public double getStartingY() {
		return model.getY();
	}
	
	
}
