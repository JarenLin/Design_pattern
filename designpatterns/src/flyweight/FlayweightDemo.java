package flyweight;

public class FlayweightDemo {
	static String[] colors = {"blue","yellow","green","white","red"};
	public static void main(String[] args){
		for (int i = 0; i < 20; i++){
			Circle sf = (Circle) new ShapeFactory().getCircle(getRandomColor());
			sf.setX(getRandomX());
			sf.setY(getRandomY());
			sf.draw();
		}

	}
	private static int getRandomY() {
		// TODO Auto-generated method stub
		return (int) (Math.random()*100);
	}
	private static int getRandomX() {
		// TODO Auto-generated method stub
		return (int) (Math.random()*100);
	}
	private static String getRandomColor() {
		// TODO Auto-generated method stub
		return colors[(int) (Math.random()*colors.length)];
	}

}
