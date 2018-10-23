//Mei-Ying Croddy
//CS141 
//activity 3
//4/2/18

//package activity3;

public class Vehicle {

	private String color;
	private int wheels;
	private String name;
	private String driver;
	
	
	public static void main(String[] args) {
		//make one or two data fields and ways to change it
		
	Vehicle v1 = new Vehicle();
	v1.setColor("white");
	v1.setWheels(4);
	v1.setName("van");
	v1.setDriver("Tony");
	
	Vehicle v2 = new Vehicle();
	v2.setColor("black");
	v2.setWheels(4);
	v2.setName("sedan");
	v2.setDriver("Elise");
	
	System.out.print("The first vehicle was a " + v1.getColor() + " " + v1.getName() + ".");
	System.out.print(" ");
	System.out.print("The driver's name is " + v1.getDriver() + ".");	
	System.out.print(" ");
	System.out.print("The second vehicle was a " + v2.getColor() + " " + v2.getName() + ".");
	System.out.print(" ");
	System.out.print("I think the driver's name was... " + v2.getDriver() + " .");	
	
		

	}
	
	public void setColor(String str) {
		color = str;
		
	}
	
	public String getColor() {
		return color;
	}

	public void setWheels(int i) { 
		wheels = i;
	}
	
	public int getWheels() {
		return wheels;
	}
	
	public void setName(String str) {
		name = str;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDriver(String str) {
		driver = str;
	}
	
	public String getDriver() {
		return driver;
	}
	
	
}
