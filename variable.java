class Car {
    int a;//instance variable (behaving like global variable for functions in class)
    void sayHello()
    {
        int b;//local variable 
        System.out.println("hello");
    }
    void sayHello2()
    {
        int b;//local variable 
        System.out.println("hello");
    }
}
public class variable {
 
    public static void main(String[] args) {
        
        Car refeVariable=new Car();//reference variable
        refeVariable.sayHello();
    }
    
}