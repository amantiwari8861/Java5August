import java.util.StringTokenizer;

class StringTokenizer1 {

    public static void main(String[] args) {
    
    StringTokenizer st=new StringTokenizer("hello everyone my name is aman"," ");

    System.out.println(st.countTokens());
    System.out.println();
        // System.out.println(st.nextToken());
        // System.out.println(st.nextToken());
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

    }
}