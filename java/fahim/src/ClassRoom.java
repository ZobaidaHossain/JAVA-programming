import java.util.ArrayList;

public class ClassRoom {
    private String classEnvironment, colourOfWalls, arrangementOfFurniture, decorationsOnWalls;
    public ArrayList<YoungStudent> StudentList = new ArrayList();

    public ClassRoom() {
    }

    public ClassRoom(String classEnvironment, String colourOfWalls, String arrangementOfFurniture, String decorationsOnWalls) {
        this.classEnvironment = classEnvironment;
        this.colourOfWalls = colourOfWalls;
        this.arrangementOfFurniture = arrangementOfFurniture;
        this.decorationsOnWalls = decorationsOnWalls;
    }

    public String getClassEnvironment() {
        return classEnvironment;
    }

    public void setClassEnvironment(String classEnvironment) {
        this.classEnvironment = classEnvironment;
    }

    public String getColourOfWalls() {
        return colourOfWalls;
    }

    public void setColourOfWalls(String colourOfWalls) {
        this.colourOfWalls = colourOfWalls;
    }

    public String getArrangementOfFurniture() {
        return arrangementOfFurniture;
    }

    public void setArrangementOfFurniture(String arrangementOfFurniture) {
        this.arrangementOfFurniture = arrangementOfFurniture;
    }

    public String getDecorationsOnWalls() {
        return decorationsOnWalls;
    }

    public void setDecorationsOnWalls(String decorationsOnWalls) {
        this.decorationsOnWalls = decorationsOnWalls;
    }

    public void EnsuringUtmostcomfort() {
        System.out.println("\nEnsured The Utmost Comfort for Each and Every Student !");
    }

    public void OfferingNeedfulRights() {
        System.out.println("Offered Needful Rights to Everyone !");
    }

    public void MinimizingDistractionsToStudies(){
        System.out.println("Minimized Distractions with Best Efforts !");
    }

    public void IncreasingEngagementAndParticipation(){
        System.out.println("Tried to Engage in Various Interesting Activities !");
    }

    public void addStudent(YoungStudent ys){
        StudentList.add(ys);
    }
    public void removeStudent(YoungStudent ys){
        StudentList.remove(ys);
    }

    public void displayStudentList(){
        for(YoungStudent ys : StudentList){
            ys.display();
        }
    }

    public void display(){
        System.out.println("\nEnvironment of Class     : "+this.getClassEnvironment());
        System.out.println("Colour of The Walls      : "+this.getColourOfWalls());
        System.out.println("Arrangement of Furniture : "+this.getArrangementOfFurniture());
        System.out.println("Decorations on Walls     : "+this.getDecorationsOnWalls());
    }

    public static void main(String[] args) {
        ClassRoom C1 = new ClassRoom();
        C1.setClassEnvironment("Sunlit, Great Airflow, Good Nature View from Window !");
        C1.setColourOfWalls("Green");
        C1.setArrangementOfFurniture("Sequential");
        C1.setDecorationsOnWalls("Various Pictures on Basic Shapes Such as : Square, Circle, Rentangle, Triangle");

        System.out.println("\n\tDisplaying Classroom Information : ");
        C1.display();
        System.out.println("\n\tDisplaying Physical Environment of The Classroom : ");
        C1.EnsuringUtmostcomfort();
        C1.OfferingNeedfulRights();
        C1.MinimizingDistractionsToStudies();
        C1.IncreasingEngagementAndParticipation();

        Teacher T1= new Teacher("Zakia",25,"MathTeacher","Teaching Students With Great Comfortability!");
        System.out.println("\n\tDisplaying Teacher Informations : ");
        T1.display();
        System.out.println("\n\tDisplaying Teaching Quality Informations : ");
        T1.TeachingQuality();
        T1.DrawingOnBoard();

        YoungStudent YS1 = new YoungStudent("Imran",8,"201-69","Bantering Fellow Friends");
        YoungStudent YS2 = new YoungStudent("Oshfaki",9,"201-70","Thabaing Her Friends");

        System.out.println("\n\tDisplaying Student Informations : ");
        C1.addStudent(YS1);
        C1.addStudent(YS2);
        C1.displayStudentList();

    }

}

    