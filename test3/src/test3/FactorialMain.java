package test3;

public class FactorialMain {

	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		
		int result = factorial.calculate(10000000);
		System.out.println(result);
	}

}
