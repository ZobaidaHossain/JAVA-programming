
public class meanashow extends character {
    protected String creation;
    protected String creatorteam;
    protected String episod1;

    public meanashow(String creation, String creatorteam, String episod1, String charactername) {
        super(charactername);
        this.creation = creation;
        this.creatorteam = creatorteam;
        this.episod1 = episod1;
    }
  

    

    @Override
    public String toString() {
        return "meanashow{" + "creation=" + creation + ", creatorteam=" + creatorteam + ", episod1=" + episod1 + '}';
    }
   public void displaymeanashow(){
       System.out.println(this.toString());
   }
    
}
