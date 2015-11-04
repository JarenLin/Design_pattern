package facade;

public class ShapeMaker {
	private Circle cl = null;
	private Rectangle rg = null;
	private Square sq = null;
	public void drawCircle(){
		new Circle().draw();
	}
	public void drawRectangle(){
		
		new Rectangle().draw();
	}
	public void drawSquare(){
		
		new Square().draw();
	}
}
