public class Classes {
    int num=10;//instance variable 

    void fxn()
    {
        System.out.println("hello i am a fxn ");
    }
}
// num
/*
hii
*/
/**
 * InnerClasses
 * @author Aman Tiwari
 */
class Main 
{
    public static void main(String[] args) {
        Classes objClasses=new Classes();
        objClasses.fxn();
        System.out.println("the value of num is "+objClasses.num);

        Classes objClasses2=new Classes();

        System.out.println(objClasses==objClasses2);
        System.out.println(objClasses instanceof Classes);
        System.out.println(objClasses2 instanceof Classes);
    }
}
//NameConvention in java
// class -> uppercamel case (first letter of each word capital)
// object -> first letter of 1st word small then next each word's 1st letter capital
// function -> first letter of 1st word small then next each word's 1st letter capital ()
// Constant -> must be in uppercase






