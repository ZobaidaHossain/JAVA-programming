public class YoungStudent extends Person {
    protected String ID;
    protected String favouriteHobby;

    public YoungStudent() {
    }

    public YoungStudent(String ID, String favouriteHobby) {
        this.ID = ID;
        this.favouriteHobby = favouriteHobby;
    }

    public YoungStudent(String name, int age, String ID, String favouriteHobby) {
        super(name, age);
        this.ID = ID;
        this.favouriteHobby = favouriteHobby;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFavouriteHobby() {
        return favouriteHobby;
    }

    public void setFavouriteHobby(String favouriteHobby) {
        this.favouriteHobby = favouriteHobby;
    }

    public void display(){
        System.out.println("\nStudent's Name   : "+this.Name);
        System.out.println("Student's Age    : "+this.Age);
        System.out.println("Student's ID     : "+this.ID);
        System.out.println("Favourite Hooby  : "+this.favouriteHobby);
    }
}

    