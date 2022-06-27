
public class Course {
    private String teacher, courseName;
    private int coefficient;
    boolean hasLab, hasRec;
    public Course(String teacher, String courseName, int coefficient, boolean hasLab, boolean hasRec){
       this.teacher=teacher;
       this.courseName=courseName;
       this.coefficient=coefficient;
       this.hasLab=hasLab;
       this.hasRec=hasRec;
    }
    public void courseInfo(){
      System.out.println(courseName+" taught by:(Mr/Mme)"+teacher+" has coefficient:"+coefficient);
      if(hasLab==true) System.out.println("Has LAB session");
        if(hasRec==true) System.out.println("Has Recitation session");
    }
}
