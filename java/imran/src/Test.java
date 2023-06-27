public class Test {

    public static void main(String args[])
    {
        Student s1 = new Student("Akash", 5, "123-45");
        Student s2 = new Student("Asif", 5, "123-45");
        Student s3 = new Student("Arian", 5, "123-45");
        Student s4 = new Student("Arman", 5, "123-45");
        Teacher t1 = new Teacher("Faruk", 25, "Math", "01761234567", "657-000012");
        Classroom c1 = new Classroom(2, true, true, true, true);
        c1.setColorOfWalls("White");

        s1.setT(t1);
        s1.setStandard(c1);
        s2.setT(t1);
        s2.setStandard(c1);
        s3.setT(t1);
        s3.setStandard(c1);
        s4.setT(t1);
        s4.setStandard(c1);


        c1.addStudent(s1);
        c1.addStudent(s2);
        c1.addStudent(s3);
        c1.addStudent(s4);

        System.out.println("Details Of the Student: ");
        s1.displayStudent();
        System.out.println("\nStudent List of the Class: ");
        c1.displayStudentList();
        System.out.println("\nBench Status of Class");
        c1.displayBenchStatus();

        Object WallPoster[] = {new Cube(), new Cylinder(), new Pyramid()};
        Object Draw[] = {new Circle(), new Triangle()};

        System.out.println("\nPosters set on the Wall: ");
        for(int i = 0; i< WallPoster.length; i++)
        {
            if(WallPoster[i] instanceof PostersOnWalls)
                System.out.println(((PostersOnWalls) WallPoster[i]).SetOnWall());
        }

        System.out.println("\nFigures Drawn in the Board: ");
        for(int i = 0; i< Draw.length; i++)
        {
            if(Draw[i] instanceof FigureDrawing)
                System.out.println(((FigureDrawing) Draw[i]).draw());
        }


    }

}