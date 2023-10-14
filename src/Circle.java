public class Circle {
    private double radius;
    private String color;


    public Circle(){
        radius = 1;
        color="blue";
    }
    public Circle(double r){
        radius =r;
        color="blue";

    }
    public Circle(double r,String c){
        radius=r;
        color = c;
    }


    public double getRadius() {
        return radius;
    }



    public double getArea(){
        return radius*radius*Math.PI;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        return "color\n"+color+"\n radius\n"+radius;

    }
}
