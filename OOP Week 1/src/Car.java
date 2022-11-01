
public class Car {

	private double price;
	private double cost;
	
	public Car (double cost) {
		this.cost = cost;
		price  = cost * 2;
	}
	
	
	public double getPrice () {
		return price;
	}

	
}
