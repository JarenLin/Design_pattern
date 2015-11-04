package memto;

public class Originator {
	private String state = null;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public Memento SaveMemento(){
		return new Memento(state);
	}
	
	public void getMemento(Memento memento){
		state = memento.getState();
	}
}
