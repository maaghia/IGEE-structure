
public class Grade {
    private double grade;
    private int  coefficient;
    Course course;
    Student student;

    public Grade(Student student, Course course, double grade, int coefficient){
    this.student=student;
    this.course=course;
    this.grade=grade;
    this.coefficient= coefficient;
    }
    public void gradeInfo(){
        System.out.println("The grade of: "+student.getName()+" in "+course+"is "+grade);
    }
    public double product(){
        return grade*coefficient;
    }

    public int getCoefficient() {
        return coefficient;
    }
}
