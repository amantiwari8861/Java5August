interface EngineFactory
{
    int EngineNo=50;
}
interface TireFactory
{
    String TireName="TVS";
}
interface IronFactory
{
    Double Ironprice=56.78899;
}
class UserDad
{
    void displayClass()
    {
        System.out.println("i am user's parent");
    }
}
class user extends UserDad implements EngineFactory,TireFactory,IronFactory
{
    void drive()
    {
        System.out.println("car is drived well !");
        displayClass();
        System.out.println("variables in class user");
        System.out.println(EngineNo+" "+TireName+" "+Ironprice);
    }
    public static void main(String[] args) {
        // display1(); error
        user obj=new user();
        obj.drive();
    }
}