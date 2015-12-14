package state;

public class StateDemo {
	public static void main(String[] args){
		Context context = new Context();
		StartState startS = new StartState();
		startS.doAction(context);
		StopState stopS =  new StopState();
		stopS.doAction(context);
	}

}
