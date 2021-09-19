public class StringImmutable {
public static void main(String[] args) {
    
    //String : sequence of characters

    String name="Aman";// string literals
    // String name2=new String("Aman"); //don't do this (bcz name2 is already an object)
    // System.out.println(name==name2); //comparing memory address
    // System.out.println(name.equals(name2)); //compare contents
    // System.out.println(name2);
    // System.out.println(name.concat(" tiwari")); //aman tiwari
    // System.out.println(name);
    // char arr[]={'A','m','a','n'};
    // char arr2[]={"aman"};error
    // String name3=arr; error
    // String name4=new String(arr);
    // System.out.println(name4);
    // String name5=String.valueOf(arr);
    // System.out.println(name5);

    name=name.concat("tiwari");  //re-initialization of string object

    System.out.println(name);


}
}