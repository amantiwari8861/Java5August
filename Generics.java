import java.util.ArrayList;
import java.util.Collection;

public class Generics {
public static void main(String[] args) {
    
    Collection c=new ArrayList();
    // Collection<Room> c=new ArrayList<>();
    // c.add("Aman");
    // c.add(2);
    // c.add(6L);
    // c.add(new StudentBean().setStudentName("Aman"));
    c.add(new Room(101));

    // c.stream().forEach(e -> System.out.println(e.getClass()));
    c.stream().forEach(e -> System.out.println(((Room)e).getId()));
    // c.stream().forEach(e -> System.out.println(e.getId()));
    // c.stream().
}
}