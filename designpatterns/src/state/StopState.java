package state;

public class StopState implements State {
	public void doAction(Context context){
		System.out.println("I am in StopState.");
		context.setState(this);
	}
	public String toString(){
		return "Stop state!";
	}
}
