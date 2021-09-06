// final class Earth
class Earth
{
    final float PI=3.14f;
    final void display()
    {
        System.out.println("pi = "+PI);
    }
}
class India extends Earth
{
    void screen()
    {
        System.out.println("hii  "+PI);
    }
    void display()
    {
        System.out.println("display in child");
    }
}
class Run
{
    public static void main(String[] args) {
        // Earth obj=new Earth();
        // obj.PI=350.1f; //error
        India objIndia=new India();
        objIndia.display();
        objIndia.screen();
    }
}