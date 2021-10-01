class MyDataType 
{
    String var;
    MyDataType(String var)
    {
        this.var=var;
    }
    @Override
    public String toString() {
        return  var;
    }
    
}
class Test
{
    public static void main(String[] args) {
        
        String str="hii";
        MyDataType m="Hiii2";//cannot convert from string to MyDataType object
        MyDataType md=new MyDataType("Hello");
        System.out.println("str = "+str+" md = "+md);
    }
}