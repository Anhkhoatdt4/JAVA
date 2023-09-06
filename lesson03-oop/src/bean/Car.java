package bean;

public class Car {
	public int serial;
	public String model ; 
	public String color ;
	
	public Car() {
		
	}
	
	public Car(int serial ,String model, String color) {
		this.serial = serial;
		this.model = model;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [serial=" + serial + ", model=" + model + ", color=" + color + "]";
	}
	
	
	
	
}
