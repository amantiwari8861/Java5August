//accesor(getter) and Mutator(setter)
public class StudentBean {

    private String studentName;
    private int studentId;

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
class GetStudentData
{
    public static void main(String[] args) {
        
        StudentBean objStudentBean=new StudentBean();
        objStudentBean.setStudentName("Aman Tiwari");
        System.out.println("the Student Name is "+objStudentBean.getStudentName());
    }
}