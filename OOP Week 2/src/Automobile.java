
public class Automobile {
	
	private String _make;
	private String _color;




	public Automobile() {
	
	}
	
	public void setMake(String make) {
		_make = make;
	}
	
	public void setColor(String color) {
		_color = color;
	}
	
	public Automobile printMake() {
		System.out.print(_make + " ");
		return this;
	}
	
	public Automobile printColor() {
		System.out.print(_color + " ");
		return this;
	}
}
