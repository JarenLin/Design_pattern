package chain_of_responsibility;

public class DebugLogger extends AbstractLogger {

	public DebugLogger(int level){
		this.level = level;
	}

	@Override
	protected void write(String mes) {
		// TODO Auto-generated method stub
		System.out.println(DebugLogger.class.toString() + " : " + mes);
	}

}
