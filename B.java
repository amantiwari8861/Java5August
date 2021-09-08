// Java program to illustrate
// protected modifier

package p2;

// import all classes in package p1
import p1.*;

// Class B is a subclass of A
class B extends A {
	public static void main(String args[])
	{
		B obj = new B();
		obj.display();
		System.out.println(obj.num);
	}
}
