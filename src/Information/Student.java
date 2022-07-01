package Information;

public class Student {
    private int Code;
    private String Name;
    private double Mark;

    public Student() {

    }

    public Student(int Code, String Name, double Mark) {
        this.Code = Code;
        this.Name = Name;
        this.Mark = Mark;
    }
    public int getCode() {
        return Code;
    }
    public String getName() {
        return Name;
    }
    public double getMark() {
        return Mark;
    }
    public void setCode(int Code) {
        this.Code = Code;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public void setMark(double Mark) {
        this.Mark = Mark;
    }
    @Override
    public String toString() {
        return "Code: " + Code + "\nName: " + Name + "\nMark: " + Mark;
    }
}