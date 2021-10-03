public class String_Builder {
public static void main(String[] args) {

    String str="hello1";
    StringBuffer sBuffer=new StringBuffer("hello");
    // StringBuilder sb2=new StringBuilder(str);
    StringBuilder sb2=new StringBuilder(sBuffer);
    System.out.println(sb2.length()+" "+sb2.capacity());
    // sb2="hello"; //error
    // sb2=new StringBuffer("hello");
    StringBuffer sb3=new StringBuffer(sb2);
    System.out.println(sb3);
    String s=new String(sb2);
    String s2=new String(sb3);

    // System.out.println();
}  
}