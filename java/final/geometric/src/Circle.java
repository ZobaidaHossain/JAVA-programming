public class Circle extends GeometricObject{
    private double radius;
    
    public Circle(){
        super();
    }
    
    public Circle(double rad)
    {
        super();
        this.radius=rad;
    }
    public Circle(double rad, String c, boolean f)
    {
        super(c,f);
        this.radius=rad;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getDiameter(){
        return 2*radius;
    }
    
    @Override
    public double getArea()
    {
       return Math.PI*radius*radius;
    }
    @Override
    public double getPerimiter()
    {
        return 2*Math.PI*radius;
    }
}
