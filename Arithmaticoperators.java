package Programs;

class Arithmaticoperators {
	public static void main(String[] args) 
	{
		// initializing variables
		int num1 = 100, num2 = 20, sum = 0, sub = 0, mult = 0, div = 0, mod = 0;
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		sum = num1 + num2;
		sub = num1 - num2;
		mult = num1 * num2;
		div = num1 / num2;
		mod = num1 % num2;
		
		System.out.println("The sum = " + sum);
		System.out.println("The subtraction = " + sub);
		System.out.println("The multiplication = " + mult);
		System.out.println("The division = " + div);
		System.out.println("The remainder = " + mod);
		
	}

}
