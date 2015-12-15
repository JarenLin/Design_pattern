package interator;

public class NameRepository implements Container {
	private String[] name = {"jessie","jaren","mary","bob"};
	
	@Override
	public Interator getInterator() {
		// TODO Auto-generated method stub
		return new InerInterator();//who getInterator, also give it a new one, because it need to interator the container from the beginning.
	}

	private class InerInterator implements Interator{
		private int index = 0; 
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return (index < name.length)?true:false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			if ( index >= name.length)
				return null;
			else return name[index++];
		}
		
	}

}
