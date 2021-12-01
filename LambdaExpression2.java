@FunctionalInterface
interface Vehicles
{
    public abstract int speed(double d);
}

public class LambdaExpression2 {

    public static void main(String[] args) {
     
        Vehicles maruti=(double d3)->{System.out.println("my speed is "+d3+"km/hr");return (int)d3;};
        maruti.speed(85.6);
    }
}