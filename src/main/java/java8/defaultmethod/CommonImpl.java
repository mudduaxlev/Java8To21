package java8.defaultmethod;

public class CommonImpl implements CommonInt1, CommonInt2 {

	// Duplicate default methods named mul with the parameters (int, int) and (int,
	// int) are inherited from the types CommonInt2 and CommonInt1

	@Override
	public int mul(int a, int b) {
		return a * b * a * b;
	}

}
