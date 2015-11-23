package interpreterdemo;

import interpreter.AndExpression;
import interpreter.Expression;
import interpreter.OrExpression;
import interpreter.TerminalExpression;

public class InterpreterDemo {
	
	public static Expression getMaleExpression(){
		Expression man1 = new TerminalExpression("Jack");
		Expression man2 = new TerminalExpression("Sam");
		return (Expression) new OrExpression(man1, man2);
	}
	
	public static Expression getMarriedExpression(){
		Expression married1 =  new TerminalExpression("Jack is married");
		Expression married2 = new TerminalExpression("Sam is a single person");
		return new AndExpression(married1,married2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Jack is a man," + getMaleExpression().interpret("Jack"));
		System.out.println("All is married," + getMarriedExpression().interpret("married"));
	}

}
