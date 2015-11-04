package facade;

public class FacadeDemo {
	public static void main(String[] args){
		ShapeMaker sm = new ShapeMaker();
		sm.drawCircle();
		sm.drawRectangle();
		sm.drawSquare();
	}
}//Using the highest user interface ShapeMaker to control thing.
