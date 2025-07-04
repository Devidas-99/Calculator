package Demo;

import Interface.Calculator;
import InterfaceImpl.CalculatorImpl;

public class Test {

	public static void main(String[] args) {
		
		Calculator c = new CalculatorImpl();
		int sum = c.add(11, 22);
		System.out.println("Addition : " + sum);

	}

}
