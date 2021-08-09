public class foreach {

    public static void main(String[] args) {
        
        int numbers[]={1,20,3,43,242,2,423,67};

        // for (int number : numbers) {
        //     System.out.println("the value is :"+number);
        // }
        // .length() string fxn
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("the value at "+i+" index is "+numbers[i]);
            }

    }
}