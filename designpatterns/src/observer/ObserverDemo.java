package observer;

public class ObserverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject sub = new Subject();
		new BinaryObserver(sub);
		new IntObserver(sub);
		sub.setState(0);
		sub.setState(7);
		sub.setState(9);
	}
}
