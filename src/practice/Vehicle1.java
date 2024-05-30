package practice;

class Car extends Vehicle{
	int noOfTyre=4;
	void start() {
		System.out.println("Start with key");
	}
}
class Scooter extends Vehicle{
	int noOfTyre=2;
	void start() {
		System.out.println("Start with kick");
	}
}
public class Vehicle1 {

	public static void main(String[] args) {
		Car c=new Car();
		c.start();
		
		Scooter s=new Scooter();
		s.start();

	}

}
