package inheritence;

public class Car {

	public static void main(String[] args) {
		
		
		AutoMobile car = new AutoMobile();
		
		car.setColor("red");
		car.setCompany("suzuki");
		car.setTopSpeed(100.0);
		car.setType("car");
		car.setWheels(4);
		
		System.out.println(car.getCompany());
		System.out.println(car.getColor());
		System.out.println(car.getTopSpeed());
		System.out.println(car.getWheels());
		System.out.println(car.getType());
	}
	
}
