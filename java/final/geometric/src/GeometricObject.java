
import java.util.Date;


public abstract class GeometricObject {
    private String color="Blue";
    private boolean filled;
    private java.util.Date dateCreated;
    
    protected GeometricObject(){
         dateCreated=new java.util.Date();
    }
    protected GeometricObject(String c, boolean f)
    {
        this.color=c; this.filled=f;
        dateCreated=new java.util.Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "GeometricObject{" + "color=" + color + ", filled=" + filled + ", dateCreated=" + dateCreated + '}';
    }
    public abstract double getArea();
    public abstract double getPerimiter();
    
}

