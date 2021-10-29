public class Static {
    int num=100;
    static int num2=300;

    static void StaticFxn()
    {
        System.out.println("hii i am static fxn in same class ");
    }
    public static void main(String[] args) {
        
        // variable,method,class,static block
        // System.out.println(num); error
        // Static s1=new Static();

        // System.out.println(s1.num);
        // System.out.println(num2);
        InnerStatic i=new InnerStatic();
        i.show();
        // InnerStatic.show();
        // StaticFxn(); error (without static)
        StaticFxn();
    } 
}
// static class InnerStatic {
 class InnerStatic {
    // static void show()
    void show()
    {
        // Static.StaticFxn();
        // System.out.println(Static.num2);
        System.out.println("show fxn");
    }
}