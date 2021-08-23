class Building
{
    int data1=100;
    int data2;

    Building()
    {
        System.out.println("hello i am default construtor");
        data2=50; 
    }
    void swimingPool()
    {
        System.out.println("i am in pool "+data1+" "+ data2);
    }
    int swimingPool2()
    {
        return 10000;
    }
}
public class Method {
    public static void main(String[] args) {
        
        Building objBuilding=new Building();
        System.out.println(objBuilding.data1);
        objBuilding.swimingPool();
        int result=objBuilding.swimingPool2();
        System.out.println("the capacity of pool is "+result);
    }
}