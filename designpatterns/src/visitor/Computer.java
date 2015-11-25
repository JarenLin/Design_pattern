package visitor;

public class Computer implements ComputerPart {
	ComputerPart[] parts;
	
	public Computer(){
		parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
	}

	@Override
	public void accept(ComputerPartVisitor computerpartvisitor) {
		// TODO Auto-generated method stub
		for(ComputerPart i:parts){
			i.accept(computerpartvisitor);
		}
		computerpartvisitor.visit(this);
	}

}
