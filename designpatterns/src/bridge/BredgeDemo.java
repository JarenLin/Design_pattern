package bridge;

public class BredgeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape redcircle = new Circle(1,2,2,new RedCircle());
		redcircle.draw();
		new Circle(2,3,4,new BlueCircle()).draw();
	}

}
