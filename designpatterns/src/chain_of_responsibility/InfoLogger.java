package chain_of_responsibility;

public class InfoLogger extends AbstractLogger {

	public InfoLogger(int level){
		this.level = level;
	}

	@Override
	protected void write(String mes) {
		// TODO Auto-generated method stub
		System.out.println(InfoLogger.class.toString() + " : " + mes);
	}

}
