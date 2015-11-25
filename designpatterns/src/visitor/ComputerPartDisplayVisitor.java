package visitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	   @Override
	   public void visit(Computer computer) {
		   //maybe you want a ComputerDisplay class to display action partly.
	      System.out.println("Displaying Computer.");
	   }

	   @Override
	   public void visit(Mouse mouse) {
	      System.out.println("Displaying Mouse.");
	   }

	   @Override
	   public void visit(Keyboard keyboard) {
	      System.out.println("Displaying Keyboard.");
	   }

	   @Override
	   public void visit(Monitor monitor) {
	      System.out.println("Displaying Monitor.");
	   }
	}