package test2;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		int result = cal.add(4).add(5).subtract(3).out();
		System.out.println(result);
	}

}
