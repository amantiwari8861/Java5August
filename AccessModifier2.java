package access1.access2;
import access1.access2.access3.*;

public class AccessModifier2 extends University {
    public static void main(String[] args) {
        
        AccessModifier2 obj2=new AccessModifier2();
        University oUniversity=new University();
        System.out.println("accessing protected data in different package subclass "+oUniversity.num2);
    }
}