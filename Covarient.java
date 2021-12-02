class Student
{
    String name;
   
    public  Student giveStudent()
    {
        return this;
    }

}
class Run
{
    public static void main(String[] args) {

        // String sname=new Student().giveStudent().name;
        // new Student().giveStudent();
        // System.out.println("the student name is "+sname);
        Student s;
        s=new Student().giveStudent().name="Abhay";
        System.out.println("the student name is "+s.name);
    }
}