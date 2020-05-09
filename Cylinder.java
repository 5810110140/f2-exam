public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(String name,double radius,double height){
        super(name);
        this.height = height;
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    public void  setRadius(double radius){
        this.radius = radius;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void zoom(double factor){
        radius = radius * factor;
        height = height * factor;
    }
    public double getArea(){
        return (2*Math.PI*radius*radius) + (2*Math.PI*radius*height);
    }

    public double getVolume(){
        return Math.PI * radius * radius *height;
    }

    public static void main(String[] args){
        Cylinder c = new Cylinder("D", 3.0, 2.0);
        System.out.println("Area of"+c.getName()+"is"+ c.getArea());

    }


}