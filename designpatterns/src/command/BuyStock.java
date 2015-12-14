package command;

public class BuyStock implements Order {

	Stock stock = null;
	public BuyStock(Stock stock){
		this.stock = stock;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		if(this.stock != null){
			this.stock.buy();
		}
	}

}
