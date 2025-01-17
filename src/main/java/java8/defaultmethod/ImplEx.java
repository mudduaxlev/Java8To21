package java8.defaultmethod;

/**
 * Abstract Methods vs Default Methods:
 * Abstract methods must be implemented by the class, while default methods are optional to override.
 * 
 * Backward compatibility for evolving APIs.
 * Eliminates the need for utility/helper classes.
 * Enhances interface flexibility by providing concrete behavior.
 */


public class ImplEx {
	
	public static void main(String[] args) {
		checkDefaultMethod();
	}
	
	
	static void checkDefaultMethod() {
		dInt d = new IntegerCal();
		System.out.println(d.sum(2, 3));
		System.out.println(d.mul(2, 3));
		
		dInt d1 = new IntegerCal2();
		System.out.println(d1.sum(2, 3));
		System.out.println(d1.mul(2, 3));
		
		CommonInt1 commonInt1 = new CommonImpl();
		System.out.println("Common Mul:"+commonInt1.mul(2, 3));
		
		CommonInt1 commonInt2 = new CommonImpl();
		System.out.println("Common Mul:"+commonInt2.mul(2, 3));
	}

}
