package InterfaceImpl;

import Interface.Calculator;

public class CalculatorImpl implements Calculator {

	@Override
	public int add(int a, int b) {
		int add = a+b;
		return add;
	}

	@Override
	public int sub(int x, int y) {
		int sub = x/y;
		return sub;
	}

}
