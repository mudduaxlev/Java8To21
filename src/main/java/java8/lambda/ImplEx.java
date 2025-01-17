package java8.lambda;

import java.util.Arrays;
import java.util.List;

import java8.common.SampleFunctionalInterface;

public class ImplEx {

	public static void main(String[] args) {
		checklambda();
	}

	static void checklambda() {
		// iterating over a list
		List<String> names = Arrays.asList("name1", "nameaj", "namere", "namepk");
		names.forEach(name -> System.out.println("This is:" + name));

		// Filter using lambda
		names.stream().filter(name -> name.toString().contains("aj"))
				.forEach(sortedName -> System.out.println("Sorted Name: " + sortedName));

		// Sorting names
		names.sort((name1, name2) -> (name1).compareTo(name2));
		System.out.println("Names after sorting:" + names);

		// Defining functional interface
		SampleFunctionalInterface sfi = (a, b) -> a + b;
		System.out.println("Addition: " + sfi.operate(3, 5));

		sfi = (a, b) -> a - b;
		System.out.println("Subtraction:" + sfi.operate(3, 5));

		// Wild card List
		List<?> obj = Arrays.asList("name", 1, 2, 12.34);
		obj.forEach(a -> System.out.println("wild card list elements are:" + a));

	}

}
