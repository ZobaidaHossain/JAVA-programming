public class student {
    private String name,id;
    public student(){
        this("Abdul","123");
    }
    public student(String n,String i){
        this.name=n;
        this.id=i;
        //this.display();
    }
    public student(student s){
        this.name=s.name;
        this.id=s.id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getId(){
        return id;
    }
    public void display(){
        //System.out.println(this.getName());
        //System.out.println(this.getId());
        String name="karim";
        String id="199";
        System.out.println(name);
        System.out.println(id);
        System.out.println(this.name);
        System.out.println(this.id);
        
    }
    public static void main(String args[]){
        student s1=new student();
        s1.display();
        student s2=new student("Rahim","191");
        s2.display();
    }
    
}
