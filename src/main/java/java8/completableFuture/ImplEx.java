package java8.completableFuture;

import java.util.concurrent.CompletableFuture;

public class ImplEx {
	
	public static void main(String[] args) {
		checkCompletableFeature();
	}

	private static void checkCompletableFeature() {
		
		/*
			supplyAsync(Supplier)	Runs a task asynchronously and returns a result.
			runAsync(Runnable)	Runs a task asynchronously without returning a result.
			thenApply(Function)	Processes and transforms the result of a task.
			thenAccept(Consumer)	Consumes the result of a task without returning a new value.
			thenRun(Runnable)	Runs a task after another task is completed, without accessing the result.
			thenCompose(Function)	Chains dependent tasks, where the next task depends on the previous result.
			thenCombine(CompletableFuture, BiFunction)	Combines the results of two independent CompletableFuture instances.
			exceptionally(Function)	Handles exceptions and provides a fallback value.
			handle(BiFunction)	Handles results or exceptions, allowing for recovery or transformation.
			
			Ease of Use: Functional and fluent API makes asynchronous programming simpler.
			Efficiency: Non-blocking operations lead to better resource utilization.
			Exception Handling: Built-in mechanisms to handle errors gracefully.
			Extensibility: Ability to compose multiple futures for complex workflows.
			
			
		 */
		
		//Running a Task Asynchronously
		CompletableFuture<Void> cf = CompletableFuture.runAsync(() -> {
			System.out.println(Thread.currentThread().getName());
		});
		cf.join();
		
		//Return a result asynchronously
		CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(() -> {
			return Thread.currentThread().getName();
		});
		cf1.thenAccept(result -> System.out.println(result));
		cf1.join();
		
		
		
		CompletableFuture.supplyAsync(() -> {
			return "Aj";
		}).thenApply(a -> a + "re")
		.thenAccept(a -> System.out.println(a)).join();
		
		CompletableFuture.supplyAsync(() -> {

			if (true) {
				throw new RuntimeException("Sample Exception");
			}
			return "Success";

		}).exceptionally(e -> "Exception is: " + e.getMessage()).thenAccept(m -> System.out.println(m)).join();
		
		
		//Combining Futures
		CompletableFuture<String> cc1 = CompletableFuture.supplyAsync(() -> {
			return "Aj";
		});
		
		CompletableFuture<String> cc2 = CompletableFuture.supplyAsync(() -> {
			return "Re";
		});
		
		cc1.thenCombine(cc2, (result1, result2) -> {
			return result1 + " " + result2;
		}).thenAccept(a -> System.out.println(a)).join();
	}

}
