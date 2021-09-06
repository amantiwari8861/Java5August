class Building
{
    Building()
    {
        System.out.println("default constructor");
    }
    Building(int num)
    {
        System.out.println("1 parameterized constructor");
    }
    Building(int num,int num2)
    {
        System.out.println("2 parameterized constructor");
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {   
    Building obBuilding=new Building();
    Building obBuilding2=new Building(10,50);
    }
}