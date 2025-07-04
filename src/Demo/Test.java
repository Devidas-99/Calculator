package Demo;

import Interface.Calculator;
import InterfaceImpl.CalculatorImpl;

public class Test {

	public static void main(String[] args) {
		Calculator c = new CalculatorImpl();
		int add= c.add(12, 30);
		int sub = c.sub(50,5);
		System.out.println(add);
		System.out.println(sub);

	}

}
