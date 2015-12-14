package state;

public class Context {
	State state = null;
	public void setState(State state){
		this.state = state;
	}
	public State getState(){
		return this.state;
	}
}
