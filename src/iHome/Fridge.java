package iHome;

public class Fridge {

	private int temperature;
	private String doorType;
	
	public void setTemp(int temperature) {
		
		this.temperature = temperature;
		
	}
	
	public void setDoorType(String doorType) {
		
		this.doorType = doorType;
		
	}
	
	public void print() {
		
		System.out.println("i have temp : " + temperature);
		System.out.println("i have door : " + doorType);
		
	}
	
	
	
	
}
