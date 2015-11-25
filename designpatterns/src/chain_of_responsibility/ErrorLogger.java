package chain_of_responsibility;

public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(int level){
		this.level = level;
	}

	@Override
	protected void write(String mes) {
		// TODO Auto-generated method stub
		System.out.println(ErrorLogger.class.toString() + " : " + mes);
	}

}
