package Factory.factory1;
// import Factory.PartMaker.Engine1;
// import Factory.PartMaker.Tires;
import Factory.PartMaker.*;

public class CarFactory {

    public static void main(String[] args) {
       Engine1 objEngine=new Engine1(); 
       objEngine.makeEngine();

       Tires objTires=new Tires();
       objTires.makeTires();
        
    }
    
}