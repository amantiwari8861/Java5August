interface Parent
{
    void display();
}
class child implements Parent
{
    public void display()
    {
        System.out.println("Child implemented this fxn");
    }
}
class Run
{
    public static void main(String[] args) {
        // child cobj=new child();
        // cobj.display();
        Parent oParent=new child();
        oParent.display();
    }
}