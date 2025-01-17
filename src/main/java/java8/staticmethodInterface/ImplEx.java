package java8.staticmethodInterface;

public class ImplEx {

	public static void main(String[] args) {
		checkStatic();
	}
	private static void checkStatic() {
		System.out.println(StaticInterface.mul(2, 3));
		System.out.println(StaticInterface.power(3));
	}

}
