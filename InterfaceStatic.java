// An example to show that interfaces can
// have default or static methods from JDK 1.8 onwards
interface In1
{
	final int a = 10;
	static void display()
	{
		System.out.println("hello");
	}
}

// A class that implements the interface.
class TestClass implements In1
{
	// Driver Code
	public static void main (String[] args)
	{
		In1.display();
        System.out.println(a);
	}
}
