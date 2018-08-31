public class hw_1_test_final {
    public static void main (String [] args){
        System.out.println(mean("2 3 4"));
    }
    public static double mean(String s){
        double de =0;
        int n = 0;
        String [] nums = s.split(" ");
        for(String i : nums){
            n+=Integer.parseInt(i);
        }
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)==' ') de++;
        }
        de++;
        return n/de;

    }
}
