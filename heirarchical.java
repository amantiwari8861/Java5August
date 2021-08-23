//heirarchical level

class Parent 
{
    int pdata=1000;
    void pfxn()
    {
        System.out.println("hello i am parent fxn");
    }
}
class Child1 extends Parent
{
    int cdata1=200;
    void cfxn1()
    {
        System.out.println("hello i am child1 fxn");
    }
}
class Child2 extends Parent
{
    int cdata2=200;
    void cfxn2()
    {
        System.out.println("hello i am child2 fxn");
    }
}
class Child3 extends Parent
{
    int cdata3=200;
    void cfxn3()
    {
        System.out.println("hello i am child3 fxn");
    }
}
class SubChild1 extends Child2
{
    int scdata=200;
    void scfxn()
    {
        System.out.println("hello i am subchild fxn of child2 ");
    }
}

 class heirarchical {
public static void main(String[] args) {
    SubChild1 objSubChild=new SubChild1();
    objSubChild.pfxn();
    objSubChild.cfxn2();
    objSubChild.scfxn();
    System.out.println(" sub child data "+objSubChild.scdata+" child data "+objSubChild.cdata2+" parent data "+objSubChild.pdata);
}  
}