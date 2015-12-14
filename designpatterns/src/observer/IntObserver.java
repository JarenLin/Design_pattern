package observer;

public class IntObserver extends Observer {
	public IntObserver(Subject subject){
		this.subject = subject;
		this.subject.addObserver(this);
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(this.toString() + " : " + subject.getState());
	}

}
