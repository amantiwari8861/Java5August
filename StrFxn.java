public class StrFxn {
    public static void main(String[] args) {
        // char arr[]={'a','m','a','n'};
        // System.out.println(arr.length);
        // String str="Aman";
        // System.out.println(str.length());
        // String str1="    heLLo.eVERYONE     my name is Amn      .";
        // System.out.println(str1.toUpperCase());
        // System.out.println(str1.toLowerCase());
        // System.out.println(str1.charAt(4));
        // System.out.println(str1.indexOf('A'));
        // System.out.println(str1.indexOf("Aman"));// not found
        // System.out.println(str1.length());
        // System.out.println(str1.trim());
        // System.out.println(str1.trim().length());
        // // System.out.println(str1.trim().length().toLowerCase()); //error
        // System.out.println(str1.substring(4,9));//9th index not included but 4th index is included
        // System.out.println(str1.substring(12));
        // String name1="aman",name2="Bman"; 
        // String name1="aman",name2="Aman"; 
        // System.out.println(name1.equals(name2));
        // System.out.println(name1.equalsIgnoreCase(name2));
        // System.out.println(name1.compareTo(name2));//(a)97-(B)66=31
        // System.out.println(name1.compareToIgnoreCase(name2));// 0 for exact match
        // String num="89";
        // String num="A";
        // int sum=5+num; //error
        // int num2=Integer.parseInt(num);
        // float num2=Float.parseFloat(num);
        // float sum=(float)5+num2;
        // int sum=(int)(5+num2);
        // System.out.println(sum);
        // System.out.println(num.hashCode());
        // String str=" ",str2="";
        // System.out.println(str.isBlank());
        // System.out.println(str.isEmpty());
        // System.out.println(str2.isBlank());
        // System.out.println(str2.isEmpty());
        // String objString=new String("hello");
        // String obj=objString; //true
        // String obj=objString.intern();//false 
        // System.out.println(objString == obj);
        // String str1="hii hello  hola ciao";
        // System.out.println(str1.endsWith("n"));
        // System.out.println(str1.endsWith(" "));
        // System.out.println(str1.lastIndexOf(" "));
        // String strs[]=str1.split(" ");
        // for (int i = 0; i < strs.length; i++) {
        //     System.out.println(" strs["+i+"] = "+strs[i]);
        // }
        String str=String.join(" ","Aman","Tiwari","sir");
        System.out.println(str);

    }
}