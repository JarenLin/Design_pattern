package visitor;

public class Mouse implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerpartvisitor) {
		// TODO Auto-generated method stub
		computerpartvisitor.visit(this);
	}

}
