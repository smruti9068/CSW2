
 class college{
    private String collegeName;
    private String collegeLoc;
    college(String collegeName,String collegeLoc){
        this.collegeName = collegeName;
        this.collegeLoc = collegeLoc;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCollegeLoc() {
        return collegeLoc;
    }

    public void setCollegeLoc(String collegeLoc) {
        this.collegeLoc = collegeLoc;
    }
}
class student extends college{
    private String studentId;
    private String studentName;
    student(String collegeName, String collegeLoc,String studentId,String studentName) {
        super(collegeName, collegeLoc);
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    void display(){
        System.out.println(super.getCollegeName()+" "+super.getCollegeLoc()+" "+studentId+" "+studentName);
    }
}

 public class college_Main {
    public static void main(String[] args) {
        college c1 = new college("Iter","Jagamara");
        college c2 = new college("Kiit","Patia");
        student s1 = new student(c1.getCollegeName(), c1.getCollegeLoc(), "12345678","smruty");
        student s2 = new student(c2.getCollegeName(), c2.getCollegeLoc(), "12345678","prishita");
        s1.display();
        s2.display();
    }
}
