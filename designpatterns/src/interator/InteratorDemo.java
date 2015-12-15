package interator;

public class InteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameRepository nr = new NameRepository();
		for(Interator it = nr.getInterator();it.hasNext();){
			System.out.println(it.next());
		}
	}

}
