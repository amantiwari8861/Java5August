//default  non-access Modifiers
// package access1.access2.access3;   sending the Default.class file to where is University Package
import access1.access2.access3.University;

public class Default {

    public static void main(String[] args) {
        
        University objUniversity=new University();

        System.out.println("accessing the default data "+objUniversity.num3);
        
    }
}
