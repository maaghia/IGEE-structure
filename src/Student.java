import java.util.*;

public class Student {
    private int group, id, promo;
    private String name;
    private ArrayList<Grade> gradesList = new ArrayList<Grade>(); //list of grades of students

    public Student(int group, int id, String name, int promo , ArrayList<Grade> gradesList){
        this.group=group;
        this.id=id;
        this.name=name;
        this.promo=promo;
        this.gradesList=gradesList;
    }
    public void infoStudent(){
        System.out.println("id: "+id+" of "+name+" an "+ promo+" student");
    }

    public int getGroup() {
        return group;
    }
    public String getName(){
        return name;
    }

    public double average(){
        double sumOfProducts=0;
        int coeffTot=0;
        for(Grade g:gradesList){
            sumOfProducts += g.product();
            coeffTot+=g.getCoefficient();
    }return sumOfProducts/coeffTot;
}}
