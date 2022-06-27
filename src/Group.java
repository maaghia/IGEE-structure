import java.util.ArrayList;

public class Group {
    private Student delegate;
    private int nbrOfStudents, grpNbr;

    public Group (Student delegate, int nbrOfStudents, int grpNbr, ArrayList<Student> studentsList){
        this.delegate=delegate;
        this.nbrOfStudents=nbrOfStudents;
        this.grpNbr=grpNbr;
        this.studentsList=studentsList;
    }

    public void groupInfo(){
        System.out.println("Group "+ grpNbr+" has "+ nbrOfStudents+" student");
        System.out.println("The delegate of group "+ grpNbr +" is: "+ delegate.getName());
    }
    private ArrayList<Student> studentsList = new ArrayList<Student>(); //list of students in this group

  public int getGrpNbr(){return grpNbr;}

    public double grpAvg(){
        double sumAvg=0;
        for(Student s:studentsList){
           sumAvg += s.average();
        } return sumAvg/studentsList.size() ;

    }
}
