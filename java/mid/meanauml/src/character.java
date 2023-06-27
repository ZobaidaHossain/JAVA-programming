
import java.util.ArrayList;


public class character {
    private String charactername;
    private ArrayList<character>characterList=new ArrayList();

    public character(String charactername) {
        this.charactername = charactername;
    }
    public void addcharacter(character c){
        this.characterList.add(c);
    }
    public void display(){
        System.out.println(this.charactername);
    }
    public void displaycharacter(){
        for(character c: characterList){
            System.out.println("character name: ");
            c.display();
        }
    }
}
