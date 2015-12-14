package command;

import java.util.ArrayList;
import java.util.List;

public class Manager {
	List<Order> list = new ArrayList();
	public Manager takeOrder(Order order){
		list.add(order);
		return this;
	}
	public void executeOrder(){
		for(Order order:list){
			order.execute();
		}
		list.clear();
	}
}
