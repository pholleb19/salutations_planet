import java.util.ArrayList;
public class shapelist {
    public static void main(String[]args){
        ArrayList<shape> shaps= new ArrayList<shape>();
        shaps.add(new circle(2));
        shaps.add(new square(5));
        shaps.add(new triangle (2, 3));
        for(shape s: shaps){
            System.out.println(s.getArea());
        }
    }
}
