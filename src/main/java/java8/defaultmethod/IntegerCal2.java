package java8.defaultmethod;

public class IntegerCal2 implements dInt{

	@Override
	public int sum (int a, int b) {
		return a+b+(a*b);
	}
	
	@Override
	public int mul(int a, int b) {
		return a*b+b*a;
	}
	
}
