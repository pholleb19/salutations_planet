import java.util.Scanner;
import java.util.ArrayList;
public class practice_one {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        ArrayList <Double> arr = new ArrayList <Double>();
        while(true){
            double num = s.nextDouble();
            arr.add(num);
            for(int i=1;i<arr.size()-1;i++){
                if(num==arr.get(i)){
                    System.out.println(arr);
                    System.out.println(art(arr));
                    System.out.println(harm(arr));
                    break;
                }
            }

        }
    }
    public static double art(ArrayList<Double> d){
        double sum = 0;
        for(int i = 1; i<d.size();i++){
            sum+=d.get(i);
        }
        return sum/d.size();
    }
    public static double harm(ArrayList<Double>d){
        double sum = 0;
        for(int i=1; i<d.size();i++){
            sum+=1/i;

        }
        return d.size()/sum;
    }

}
