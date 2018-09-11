import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class running_in_the_90s {
    public static List<Integer> listDeleteAll(List<Integer> list, int n) {
        for (int i = 0; i < list.size(); i++)
            if (list.get(i).equals(n)) {
                list.remove(i);
                i--;
            }
        return list;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList(Arrays.asList(5, 2, 5, 5, 7, 5));
        listDeleteAll(list, 5);
        System.out.println(list);
    }

}
