public class Cuboid extends Shape {
private double width;
private double height;
private double depth;

    public Cuboid(String name, double width, double height,double depth){
        super(name);
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }
    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getDepth(){
        return depth;
    }

    public void setDepth(double depth){
        this.depth = depth;
    }

    public void zoom(double factor){
        depth = depth * factor;
        height = height * factor;
        width = width * factor;
    }

    public double getArea(){
        return (2*width*depth)+(2*depth*height)+(2*width*height);
    }

    public double GetVolume(){
        return width * depth *height;
    }
}