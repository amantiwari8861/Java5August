public class Scp {

    public static void main(String[] args) {
        
        String str1="aman";// SCP
        String str2="aman";// SCP

        String objString=new String("aman"); //heap

        System.out.println(str1==str2);// pointing to same memory location
        System.out.println(str1==objString);// pointing to different memory location

    }
    
}