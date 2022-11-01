
public class UsedCar extends Car {

	private double mileage;
	
	public UsedCar(double cost, double mileage) {
		super(cost);
		this.mileage = mileage;
	}
	public boolean equals(UsedCar compareCar) {
		if(mileage==(mileage) && getPrice()==getPrice()) {
			return true;
		}
		return false;
		}
	
	public void display() {
		System.out.println("Price = " + getPrice() + " Miles = " + mileage + " .");
	}
}
