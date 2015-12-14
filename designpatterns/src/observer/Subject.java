package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private int state;
	private List<Observer> obsList = new ArrayList();

	public void addObserver(Observer obs){
			obsList.add(obs);
	}
	
	public void addObserver(Observer[] obs){
		for(Observer obsOne:obs){
			obsList.add(obsOne);
		}
	}
	
	public void notifyAllObservers(){
		for(Observer obsOne:this.obsList){
			obsOne.update();
		}
	}
	
	public void setState(int state){
		this.state = state;
		notifyAllObservers();
	}
	
	public int getState(){
		return this.state;
	}
}
