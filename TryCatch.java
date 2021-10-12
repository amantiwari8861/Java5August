public class TryCatch {
public static void main(String[] args) {
    System.out.println("before try");
    try 
    {
       int num1=10,num2=0;
       System.out.println("Dividing num2 with num1");
       try{
       System.out.println(num1/num2); 
       }
       catch(ArithmeticException e)
       {
        System.out.println("exception handeled");
       }
       System.out.println("It will not execute !");
       System.out.println("It will not execute !");
       System.out.println("It will not execute !");
       System.out.println("It will not execute !");
    } 
    catch (Exception e) 
    {
        System.out.println("Don't divide by zero");
    }
    System.out.println("after catch");
} 
}