class Student
{
    String name="Ritik";
   
    public  Student giveStudent()
    {
        return this;
    }
}
class Run
{
    public static void main(String[] args) {

        String sname=new Student().giveStudent().name;
        System.out.println("the student name is "+sname);
    }
}