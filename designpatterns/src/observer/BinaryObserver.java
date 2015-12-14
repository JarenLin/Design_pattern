package observer;

public class BinaryObserver extends Observer {

	public BinaryObserver(Subject subject){
		this.subject = subject;
		this.subject.addObserver(this);
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(this.toString() + " : " + Integer.toBinaryString(subject.getState()));
	}

}
