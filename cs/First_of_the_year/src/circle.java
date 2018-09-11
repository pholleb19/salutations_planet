public class circle implements shape {
    private double radius;

    public circle (double r){
        radius =r;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
}
