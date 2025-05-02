package Programs;
class Vehicle1{
	void run() {
		System.out.println("Vehicle is running");
	}	
}
class Bike extends Vehicle1{
	void run() {
		System.out.println("Bike is running safely");
	}	
		
	}

public class methodoveerriding {
	public static void main(String args[]) {
		Vehicle1 obj=new Vehicle1();
		obj.run();
	}

}
