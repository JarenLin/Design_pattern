package visitor;

public class Monitor implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerpartvisitor) {
		// TODO Auto-generated method stub
		computerpartvisitor.visit(this);
	}

}
