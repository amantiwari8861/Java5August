class MyStaticDemo
{
	static int a;
    static int c;
	int b;
	
	static  //static block
	{
		a=100;
		System.out.println("i am called when class is first loaded");
		
	}
	MyStaticDemo()
	{
		b=200;
	}
	public void nonstaticfunction()
	{
	System.out.println("this is NON static app"+" "+b);
	}
	public static void Display()
	{
		System.out.println("this is static app"+" "+a);
	}
	public static void main(String []args)
	{
		System.out.println(a); //100
        System.out.println("checking null either default"+" "+c);
		MyStaticDemo ok=new MyStaticDemo();
        System.out.println("checking null either default"+" "+ok.b);
		ok.nonstaticfunction();
		Display();
		MyStaticDemo.Display();
		System.out.println(ok.b);
	}
}
	