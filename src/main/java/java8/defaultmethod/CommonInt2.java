package java8.defaultmethod;

public interface CommonInt2 {
	
	default int mul(int a, int b) {
		return a*b*a;
	}

}
