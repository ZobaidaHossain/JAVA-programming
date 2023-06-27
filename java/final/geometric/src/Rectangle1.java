
public class Rectangle1 extends GeometricObject{
    private double width, height;
    public Rectangle1(){
        super();
    }
    public Rectangle1(double w, double h)
    {
        super();
        this.width=w; this.height=h;
    }
    public Rectangle1(double w, double h, String c, boolean f)
    {
        super(c,f);
        this.width=w; this.height=h;
    }

   

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public double getArea() {
       return this.height*this.width;
    }

    @Override
    public double getPerimiter() {
        return 2*(this.height+this.width);
    }
    
}
