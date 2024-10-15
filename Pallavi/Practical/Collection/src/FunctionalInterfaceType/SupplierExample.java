package FunctionalInterfaceType;

import java.util.function.Supplier;
public class SupplierExample {

	public static void main(String[] args) {

		Supplier<String> message =()->"Hi there";
		System.out.println(message.get());
	}

}
