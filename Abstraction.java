abstract class Vehicle1
{
    int num;
    Vehicle1()
    {
        num=0;
        System.out.println("vehicle created");
    }
    Vehicle1(int num)
    {
        this.num=num;
        System.out.println("vehicle created ");
    }
    void fxn()
    {
        System.out.println("hello i am a non-abstract function "+num);
    }
    public static void staticFxn() 
    {
        System.out.println("static fxn");
    }
    abstract void run();
}
// abstract class Abstraction extends Vehicle1
class Abstraction extends Vehicle1
{
    Abstraction()
    {
        // super();
        super(1000);
    }
    void run()
    {
        System.out.println("Running vehicle class");
    }
    public static void main(String[] args) {
        System.out.println("in main");
        Vehicle1 objVehicle1=new Abstraction();
        objVehicle1.fxn();
        objVehicle1.run();
        Vehicle1.staticFxn();
        // Abstraction obj=new Abstraction();
        // obj.run();
    }
}