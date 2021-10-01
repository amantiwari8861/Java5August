public class Test2 {
public static void main(String[] args) {
    
    String str="hello2";
    char []ch="He llo".toCharArray();
    int i=0;
    // for (i = 0; ch[i] !='\0'; i++); ArrayIndexOutOfBound Exception
    for (char c : ch) {
        ++i;
    }
    System.out.println(i);
    System.out.println(str.lastIndexOf(""));
}
}