public class Sphere extends Shape {
    private double radius;
    

    public Sphere(String name,double radius){
        super(name);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void zoom(double factor){
        radius = radius * factor;
    }
    public double getArea(){
       return 4*Math.PI*radius*radius;
    }

    public double getVolume(){
        return (4/3)*(Math.PI * radius * radius *radius);
    }


    public static void main(String[] args){
        Sphere s = new Sphere("C", 3.0);
        System.out.println("Area of "+ s.getName()+" is "+s.getArea());
    }
}