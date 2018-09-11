public class square implements shape {
    private double l;

    public square (double r){
        l =r;
    }
    public double getArea(){
        return l*l;
    }

}
