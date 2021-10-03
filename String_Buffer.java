public class String_Buffer {
    public static void main(String[] args) {
        
        //String immutable 
        // String str="123456789123456789123456789";
        String str="Hello";
        // str=str.concat("  ");//re-initialize of string
        // // StringBuffer sb="hiii"; //error
        // StringBuffer sb=new StringBuffer(str);// initial capacity 16 bytes
        // System.out.println(str.length()+" "+sb.capacity()); // length + 16 => capacity
        // sb.append("_Sir");
        // System.out.println(sb.length()+" "+sb);
        // System.out.println(sb.insert(5,"!!"));
        // System.out.println(sb.replace(7,10," ")); //7 include 10 exclude
        // System.out.println(sb.replace(7,8," "));
        // System.out.println(sb.delete(7, 10));
        char arr[]=str.toCharArray();
        // System.out.println(sb.append(arr));
        // System.out.println(sb.codePointAt(2));// 108 ascii of l
        // System.out.println(String.valueOf(sb.charAt(sb.indexOf("e"))).hashCode());
        System.out.println(String.valueOf(arr, 1, 3));
        // System.out.println(str.matches("//s"));
    }
}
