package observer;

public abstract class Observer {
	protected Subject subject;//which obj to observer?
	public abstract void update();//when observered, to do what?
}
