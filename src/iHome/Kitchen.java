package iHome;

public class Kitchen {

	private Fridge fridge;
	private String diningTable;
	private String oven;
	
	public Kitchen() {
		oven = "Wolf";
		diningTable = "mohoagany";
		fridge = new Fridge();
	}
	
	
	public void setFridgeTemp(int temp) {
		fridge.setTemp(temp);
	}

	public void setFridgeDoor(String door) {
		fridge.setDoorType(door);
	}
	
	public void print() {
		System.out.println("i have oven : " + oven);
		System.out.println("i have diningTable : " + diningTable);
		fridge.print();
	
	}
	
}
