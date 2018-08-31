public class harmonic_meme_test_final_v3 {
    public static void main(String[]args){
        double[] nums = {4, 9};
        System.out.println(harmonicas(nums));
    }
    public static double harmonicas(double[] arr){
        double sum = 0;
        for(double i: arr){
            sum+=1/i;

        }
        return arr.length/sum;
    }
}
