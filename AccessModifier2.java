package access1.access2;
import access1.access2.access3.*;

public class AccessModifier2 extends University {
    public void hi()
    {
        System.out.println("accessing protected data in different package subclass "+num2);
    }
    public static void main(String[] args) {
        
        AccessModifier2 obj2=new AccessModifier2();
        obj2.hi();
    } 
}