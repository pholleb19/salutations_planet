public class triangle implements shape {
    private double length;
    private double height;

    public triangle (double l, double h){
        length =l;
        height = h;
    }
    public double getArea(){
        return (length*height)/2;
    }
}
