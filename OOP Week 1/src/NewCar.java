
public class NewCar extends Car {
	
	private String color;
	
	public NewCar(double cost, String color) {
		super(cost);
		this.color = color;
	}
	
	
	
	public boolean equals(NewCar compareCar) {
		if(color.equals(color) && getPrice()==getPrice()) {
			return true;
		}
		return false;
		}

	public void display() {
		System.out.println("Price = " + getPrice() +  ", color = "  + color + ". ");
	}
}
