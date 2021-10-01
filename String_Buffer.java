public class String_Buffer {
    public static void main(String[] args) {
        
        // String str="123456789123456789123456789";
        String str="Hello";
        // StringBuffer sb="hiii"; //error
        StringBuffer sb=new StringBuffer(str);
        System.out.println(str.length()+" "+sb.capacity());
        sb.append("_Sir");
        // System.out.println(sb.length()+" "+sb);
        System.out.println(sb.insert(5,"!!"));
        // System.out.println(sb.replace(7,10," ")); //7 include 10 exclude
        System.out.println(sb.replace(7,8," "));
        System.out.println(sb.delete(7, 10));

    }
}
