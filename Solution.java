import java.util.Scanner;
public class Solution
{
    public static double averageProteinByType(Maize[] maizes,String tempmaizeType) {
        double sum=0.0;
        double avg=0.0;
        int count=0;
            for (int i = 0; i < maizes.length; i++) {
                
                if(maizes[i].getMaizeType().equalsIgnoreCase(tempmaizeType))
                {
                    ++count;
                    sum+=maizes[i].getProtein();
                }
            }

        avg=sum/count;
        // System.out.println("sum :"+String.format("%0.2f", sum)+" count:"+count+" :"+avg);
        return avg;
    }
    // public static Maize[] sortMaizeByPrice(Maize[] maizes,int value) {
        
    //     Maize []tempmaizes;
    //     return maizes;
    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Maize []maizes=new Maize[4];
        String type=null;
        for (int i = 0; i < 4; i++) 
        {
            maizes[i]=new Maize();
            System.out.println("Enter maize Type :");
            maizes[i].setMaizeType(sc.nextLine());
            System.out.println("Enter maize Name :");
            maizes[i].setMaizeName(sc.nextLine());
            System.out.println("Enter maize Protein :");
            maizes[i].setProtein(sc.nextDouble());
            System.out.println("Enter maize Price :");  
            maizes[i].setPrice(sc.nextInt());
            sc.nextLine();
            System.out.println("--------------------------------------------------------------------");
        }
        System.out.print("Enter type of maize to find average:");
        type=sc.nextLine();
        double avg=Solution.averageProteinByType(maizes,type);
        if (avg>0.0) {
            System.out.println(String.format("%0.2f",avg));
        } else {
            System.out.println("there is no such maize available");
        }
        sc.close();
    }
}