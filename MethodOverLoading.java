class Shape
{
    // void defineShape()
    // {
    //     System.out.println("default shape");
    // }
    // void defineShape(int num)
    // {
    //     System.out.println("a line of "+num +" meter");
    // }
    // void defineShape(float num)
    // {
    //     System.out.println("a line of "+num +" meter");
    // }
    void defineShape(float num,int num2)
    {
        System.out.println("a line of "+num +" meter");
    }
    // void defineShape(int num,int num2)
    // {
    //     System.out.println("a line of "+num +" meter int ");
    // }
    // void defineShape(double num,double num2)
    // {
    //     System.out.println("a line of "+num +" meter double");
    // }
    //1. no. of parameters must be different
    //2. data type must be different 
    //3. sequence of parameters must be different
    // int defineShape(float num,int num2)
    // {
    //     System.out.println("a line of "+num +" meter");
    //     return 100;
    // }
}
class MethodOverLoading
{
    public static void main(String[] args) {
        Shape oShape=new Shape();
        // oShape.defineShape();
        // oShape.defineShape(5);
        // oShape.defineShape(5,10);
        // oShape.defineShape(5.0,10.0);
        oShape.defineShape(5D,10D);
    }
}