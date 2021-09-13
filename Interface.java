public interface Interface 
{
    int a=10; //public static final
	void fxn();	// public abstract
	//{
		//System.out.println("hii");
	//};	
	default void fxn2()
	{
		System.out.println("hii");
	}
}
class Abc implements Interface
{
	public void fxn()
	{
		System.out.println("hii");
	}
	public static void main(String args[])
	{
		System.out.println(a);
	}
}