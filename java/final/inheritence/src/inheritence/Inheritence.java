
package inheritence;


      
   class rectangle{
       protected int width,height;
       public rectangle(){
   }

        public rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }
       public void display(){
           System.out.println("rectangle colour is blue");
       }
       public static void count(){
           System.out.println("counting!! rectangle class");
       }
   }
  class square extends rectangle{

  public square(int px,int py){
      super(px,py);
      this.setHeight(px);
      this.setWidth(py);
  }
  @Override
  public void display(){
      System.out.println("Height: "+height);
      System.out.println("width: "+width);
       System.out.println("square colour is blue");
  }
   public static void count(){
        System.out.println("*****");
   }   
  }
public class Inheritence {
    public static void main(String[] args) {
    rectangle r1=new rectangle();
    square s1=new square(10,20);
    r1.display();
    s1.display();
    rectangle.count();
    square.count();
    }
    
}
