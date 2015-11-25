package chain_of_responsibility;

public abstract class AbstractLogger {
	//here static is needed, final is suggested
	public static final int ERROR = 1;
	public static final int DEBUG = 2;
	public static final int INFO = 3;
	
	public int level;
	
	// need it to create a chain
	protected AbstractLogger nextLogger;
	
	public void setNext(AbstractLogger logger){
		this.nextLogger = logger;
	}
	
	// what is owner responsibility?
	public void logmessage(int level, String mes){
		if(this.level <= level){
			write(mes);
		}
		else if(this.nextLogger != null){// if do not show log, go next
			nextLogger.logmessage(level, mes);
		}
		
	}
	abstract protected void write(String mes);
	
	public void d(String mes){
		logmessage(AbstractLogger.DEBUG,mes);
	}
	
	public void i(String mes){
		logmessage(AbstractLogger.INFO,mes);
	}
	
	public void e(String mes){
		logmessage(AbstractLogger.ERROR,mes);
	}
	
}
