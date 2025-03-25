package inheritence;

public class Bike {
	
public static void main(String[] args) {
		
		
		AutoMobile Bike = new AutoMobile();
		
		Bike.setColor("Black");
		Bike.setCompany("Honda");
		Bike.setTopSpeed(220.0);
		Bike.setType("Bike");
		Bike.setWheels(2);
		
		System.out.println(Bike.getCompany());
		System.out.println(Bike.getColor());
		System.out.println(Bike.getTopSpeed());
		System.out.println(Bike.getWheels());
		System.out.println(Bike.getType());
     }
}

