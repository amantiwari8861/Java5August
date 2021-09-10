protected class Animal
{
   void msg()
   {
       System.out.println("any msg");
   }
}

public class ProtectedClass {

    public static void main(String[] args) {
        Animal objAnimal=new Animal();
        objAnimal.msg();
    }
}