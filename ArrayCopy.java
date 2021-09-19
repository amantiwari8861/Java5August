public class ArrayCopy {

    public static void main(String[] args) {
        
        int source[]={10,20,30,40,50,60,70,80};
        int destination[]=new int[4];

        System.arraycopy(source, 2, destination, 1, 3);

        for (int i = 0; i < destination.length; i++) {
            System.out.println("at index "+i+" value is "+destination[i]);
        }
    }
}