package memto;

public class MementoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Originator or = new Originator();
		CareTaker ct = new CareTaker();
		or.setState("state-001");
		ct.add(or.SaveMemento());
		or.setState("state-002");
		ct.add(or.SaveMemento());
		System.out.println(or.getState());//current state
		or.getMemento(ct.getMemento(0));
		System.out.println(or.getState());//old state
	}

}
