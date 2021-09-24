class Url
{
    public static void main(String[] args) {
        
        //https://learning.oracle.com/secure_content_v2/ohr/media/200574034/V1/S1102502GC10_sg/files/mobile/5.jpg?210609113740

        String url="https://learning.oracle.com/secure_content_v2/ohr/media/200574034/V1/S1102502GC10_sg/files/mobile/";
    
        for (int i = 1; i < 117; i++) {
            
            System.out.println(url+i+".jpg?210609113740/");

        }

    }
}