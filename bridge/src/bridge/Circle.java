package bridge;

public class Circle extends Shape {
	private int x, y, radius;

	public Circle(int x, int y, int radius,DrawAPI drawaApi) {
		super(drawaApi);
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		drawaApi.draw(radius, x, y);
	}

}
