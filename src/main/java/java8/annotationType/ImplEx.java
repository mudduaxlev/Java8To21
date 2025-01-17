package java8.annotationType;

public class ImplEx {
	
	@CustomInterfaceValue
	public static String valueTest;
	
	
	public static void main(@CustomInterfaceValue String[] args) {
		checkAnnotationType();
	}
	private static void checkAnnotationType() {
		
		@CustomInterfaceValue
		String value = valueTest;
		
		System.out.println("Value is: "+valueTest);
		
	}

}
