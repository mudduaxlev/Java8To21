package java8.defaultmethod;

public interface CommonInt1{
	
	default int mul(int a, int b) {
		return a*b;
	}
	
}