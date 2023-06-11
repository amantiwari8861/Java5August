// Java 9 introduced private methods and private static method in interfaces.
//  In Java 9 and later versions, an interface can have six different things:

//     Constant variables
//     Abstract methods
//     Default methods
//     Static methods
//     Private methods
//     Private Static methods

//     These private methods will improve code re-usability inside interfaces and 
//     will provide choice to expose only our intended methods implementations to users.
//     These methods are only accessible within that interface only and cannot be accessed
//      or inherited from an interface to another interface or class.

/**
 * @author Aman Tiwari
 */

// Java 9 program to illustrate
// private methods in interfaces
interface TempI {

	public abstract void mul(int a, int b);

	public default void add(int a, int b) {
		// private method inside default method
		sub(a, b);

		// static method inside other non-static method
		div(a, b);
		System.out.print("Answer by Default method = ");
		System.out.println(a + b);
	}

	public static void mod(int a, int b) {
		div(a, b); // static method inside other static method
		System.out.print("Answer by Static method = ");
		System.out.println(a % b);
	}

	private void sub(int a, int b) {
		System.out.print("Answer by Private method = ");
		System.out.println(a - b);
	}

	private static void div(int a, int b) {
		System.out.print("Answer by Private static method = ");
		System.out.println(a / b);
	}
}

class Temp implements TempI {

	public void mul(int a, int b) {
		System.out.print("Answer by Abstract method = ");
		System.out.println(a * b);
	}

	public static void main(String[] args) {
		TempI in = new Temp();
		in.mul(2, 3);
		in.add(6, 2);
		TempI.mod(5, 3);
		// TempI.div(20,10);
	}
}
