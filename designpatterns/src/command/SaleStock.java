package command;

public class SaleStock implements Order {

	Stock stock = null;
	public SaleStock(Stock stock){
		this.stock = stock;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		if(this.stock != null){
			this.stock.sale();
		}
	}

}
