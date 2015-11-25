package visitor;

public class ComputerPartVisitorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Computer().accept(new ComputerPartDisplayVisitor());;
	}

}
