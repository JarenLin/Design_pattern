package chain_of_responsibility;

public final class AbstractLoggerDemo {

	public static AbstractLogger getLogger(){
		
		AbstractLogger infoLogger = new InfoLogger(AbstractLogger.INFO);
		AbstractLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		
		infoLogger.setNext(debugLogger);
		debugLogger.setNext(errorLogger);
		
		return infoLogger;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractLogger log = getLogger();
		log.d("debuging");
		log.i("info");
		log.e("some thing error!");
	}

}
