/*class to become child of class  ==> extends
class has to access interface  ==> implements
interface has to access interface  ==> extends*/

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
interface car extends EngineFactory,TireFactory,IronFactory
// interface car  
{
    default void displayInterface()
    {
        System.out.println("variables in interface Car");
        System.out.println(EngineNo+" "+TireName+" "+Ironprice);
    }
}
class UserDad
{
    void displayClass()
    {
        System.out.println("i am user's parent");
    }
}
// class user extends UserDad implements car,EngineFactory,TireFactory,IronFactory
class user extends UserDad implements car
{
    void drive()
    {
        System.out.println("car is drived well !");
        displayInterface();
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