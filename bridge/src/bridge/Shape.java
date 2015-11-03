package bridge;

public abstract class Shape {
	protected DrawAPI drawaApi;

	public Shape(DrawAPI drawaApi) {
		super();
		this.drawaApi = drawaApi;
	}
	
	public abstract void draw();
}
