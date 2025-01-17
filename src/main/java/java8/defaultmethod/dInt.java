package java8.defaultmethod;

public interface dInt {
	
	public int sum(int a, int b);
	
	default int mul(int a, int b) {
		return a * b;
	}

}
