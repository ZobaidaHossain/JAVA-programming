import javax.swing.*;

public class Author {
    private String name, EMail, Gender;

    public Author(String name, String EMail, String gender) {
        this.name = name;
        this.EMail = EMail;
        Gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEMail() {
        return EMail;
    }

    public void setEMail(String EMail) {
        this.EMail = EMail;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", EMail='" + EMail + '\'' +
                ", Gender='" + Gender + '\'' +
                '}';
    }

    public void DisplayInfo()
    {
//        System.out.println("Author Name: "+this.name);
//        System.out.println("Author EMail: "+this.EMail);
//        System.out.println("Author Gender: "+this.Gender);
        JOptionPane.showMessageDialog(null, this.toString());
    }
}
