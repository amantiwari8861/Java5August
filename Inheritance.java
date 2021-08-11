//inheritance
//polymorphism
//encapsulation
//abstraction

//single 

class Parent
{
    int pdata=1000;
    void pfxn()
    {
        System.out.println("hello i am parent fxn");
    }
}
class Child extends Parent
{
    int cdata=200;
    void cfxn()
    {
        System.out.println("hello i am child fxn");
    }
}
public class Inheritance {
public static void main(String[] args) {
    Child objChild=new Child();
    objChild.pfxn();
    objChild.cfxn();
    System.out.println(" child data "+objChild.cdata+" parent data "+objChild.pdata);
}  
}