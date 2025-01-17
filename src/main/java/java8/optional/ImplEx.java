package java8.optional;

import java.util.Optional;

//Helps handle null values gracefully
public class ImplEx {

	public static void main(String[] args) {

		checkOptional();

	}

	static void checkOptional() {
		Optional<String> oEStr = Optional.empty();
		System.out.println("Optional Empty String: "+oEStr.isEmpty());
		
		Optional<String> oNEStr = Optional.of("Aj");
		System.out.println("Optional Non  Empty String: "+oNEStr.isEmpty());
		oNEStr.ifPresent(a -> System.out.println("String is: "+a));
		
		Optional<String> oN = Optional.ofNullable(null);
		System.out.println("Optional Nullable: "+oN.isEmpty());
	}

}
