package memto;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	List<Memento> memList= new ArrayList<Memento>();
	public void add(Memento mem){
		memList.add(mem);
	}
	public Memento getMemento(int index){
		if(index <= memList.size()){
			return memList.get(index);
		}
		else{
			return null;
		}
	}
}
