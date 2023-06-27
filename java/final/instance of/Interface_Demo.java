package interface_demo;



public class Interface_Demo {

    
    public static void main(String[] args) {
        Object[] objects={new Tiger(), new Orange(), new Chicken()};
        for(int i=0;i<objects.length;i++)
        {
            if(objects[i] instanceof Edible)
            {
                System.out.println(((Edible)objects[i]).howtoEat());
            }
            if(objects[i] instanceof Fruits)
                System.out.println("This is a Fruit"+ objects[i].toString());
        }
    }
    
}
