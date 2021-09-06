class Vehicle
{
    Vehicle()
    {
        System.out.println("Vehicle created");
    }
    double speed=5.6;
    void acclerate()
    {
        System.out.println("vehicle started");
    }
}
class Bike extends Vehicle
{
    Bike()
    {
        super(); //this super constructor is applied implicitly(already done) 
        System.out.println("Bike created");
    }
    double speed=90;
    void acclerate()
    {
        System.out.println("Bike Started");
    }
    void display()
    {
        acclerate();
        super.acclerate();
        System.out.println("the speed of Bike is "+speed);
        System.out.println("the speed of vehicle is "+super.speed);
        
    }
}
class Run
{
    public static void main(String[] args) {
        Bike objBike=new Bike();
        objBike.display();
        // objBike.acclerate();//child
    }
}