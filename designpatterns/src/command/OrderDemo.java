package command;

public class OrderDemo {
	public static void main(String[] args){
		Stock stock = new Stock();
		BuyStock buyS = new BuyStock(stock);
		SaleStock sale = new SaleStock(stock);
		Manager mana = new Manager();
		mana.takeOrder(buyS).takeOrder(sale);
		mana.executeOrder();
	}
}
