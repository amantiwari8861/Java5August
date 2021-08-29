class Vehicle
{
    Vehicle()
    {
        System.out.println("Vehicle created");
    }
    Vehicle(String name)
    {
        System.out.println(name+" vehicle created");
    }
}
class Bike extends Vehicle
{
    Bike()
    {
        // super(); //this super constructor is applied implicitly(already done) 
        super("2 wheeler");
        System.out.println("Bike created");
    }
}
class Run
{
    public static void main(String[] args) {
        Bike objBike=new Bike();
    }
}