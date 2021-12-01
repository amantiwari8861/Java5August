import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo1 {
public static void main(String[] args) {
    
    String name[]=new String[4];
    name[0]="ritik";
    name[1]="aman";
    name[2]="avinash";
    name[3]="sourabh";

    // ArrayList aList=new ArrayList(Arrays.asList(name));

    // for (int i = 0; i < aList.size(); i++) {
    //     System.out.println(aList.get(i));
    // }
        // for (String naam : aList) {
        //     System.out.println(naam); //error casting exception
        // }
        ArrayList<String> aList=new ArrayList<>(Arrays.asList(name));
        // for (String naam : aList) 
        // {
        //         System.out.println(naam); //error casting exception
        //     }
        // Iterator itr=aList.iterator();
        // System.out.println(itr.next());
        // while (itr.hasNext()) {
        //     System.out.println(itr.next());
        // }
            // ListIterator li=aList.listIterator(aList.size());
            // ListIterator li=aList.listIterator(2);
            // while (li.hasNext()) {
            //     System.out.println(li.next());
            // }
            // while (li.hasPrevious()) {
            //     System.out.println(li.previous());
            // }
            Collections.sort(aList);
            aList.add("Sujata");
            aList.remove("Sujata");
            aList.addAll(aList.size(),Arrays.asList("Rahul","Sujata","Anjali"));
            aList.removeAll(Arrays.asList("Rahul","Sujata"));
            // aList.clear();
            aList.forEach(naam->{System.out.println(naam);});

}
    
}