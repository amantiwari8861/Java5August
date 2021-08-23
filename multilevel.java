//multi level
class GrandParent
{
    int gpdata=1000;
    void gpfxn()
    {
        System.out.println("hello i am grand parent fxn");
    }
}
class Parent extends GrandParent
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

class SubChild extends Child
{
    int scdata=200;
    void scfxn()
    {
        System.out.println("hello i am subchild fxn");
    }
}
 class multilevel2 {
public static void main(String[] args) {
    SubChild objSubChild=new SubChild();
    objSubChild.gpfxn();
    objSubChild.pfxn();
    objSubChild.cfxn();
    objSubChild.scfxn();
    System.out.println(" sub child data "+objSubChild.scdata+" child data "+objSubChild.cdata+" parent data "+objSubChild.pdata+" grandparent data "+objSubChild.gpdata);
}  
}