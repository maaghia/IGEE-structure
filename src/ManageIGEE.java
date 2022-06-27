import java.util.ArrayList;

public class ManageIGEE {
    //tests done are related to us, our group, and our promotion ...
    public static void main (String[]args){
        //TESTING Promotion CLASS
        Promotion ourPromo = new Promotion(2018, 350, 15.4);
        ourPromo.getAddmitanceAvg();
        ourPromo.promoInfo();


        //TESTING Course CLASS
        Course oop = new Course("Otmani Nassim", "OOP", 3, true, false);
        Course digital = new Course("Benzekri Azzouz", "advanced digital", 3, true, false);
        Course algebra = new Course("Hariche Kamel", "advanced algebra", 3, false, false);

        //TESTING Grade CLASS
        ArrayList<Grade> s1_grades = new ArrayList<Grade>();
        ArrayList<Grade> s0_grades = new ArrayList<Grade>();
        ArrayList<Grade> s2_grades = new ArrayList<Grade>();
        Student s1=new Student(4, 31072165, "Maria Toubal", 2018, s1_grades);
        Student s0=new Student(4,32003588 , "Mohammed Ezziane", 2018, s0_grades);
        Student s2=new Student(4, 31037917, "Bouchra Messouci", 2018, s2_grades);

        Grade s1_grade1=new Grade(s1, oop , 10, 3);
        Grade s1_grade2=new Grade(s1, digital , 16.5, 3);
        Grade s1_grade3=new Grade(s1, algebra , 12, 3);

        Grade s0_grade1=new Grade(s0, oop , 9.75, 3);
        Grade s0_grade2=new Grade(s0, digital , 12, 3);
        Grade s0_grade3=new Grade(s0, algebra , 6.75, 3);

        Grade s2_grade1=new Grade(s2, oop , 10, 3);
        Grade s2_grade2=new Grade(s2, digital , 12.5, 3);
        Grade s2_grade3=new Grade(s2, algebra , 10, 3);

        //TESTING Student CLASS
        s1.infoStudent(); s2.infoStudent(); s0.infoStudent();

        s1_grades.add(s1_grade1); s1_grades.add(s1_grade2); s1_grades.add(s1_grade3);
        s0_grades.add(s0_grade1); s0_grades.add(s0_grade2); s0_grades.add(s0_grade3);
        s2_grades.add(s2_grade1); s2_grades.add(s2_grade2); s2_grades.add(s2_grade3);

        System.out.println("The average of: "+s1.getName()+" is: "+ s1.average());
        System.out.println("The average of: "+s0.getName()+" is: "+ s0.average());
        System.out.println("The average of: "+s2.getName()+" is: "+ s2.average());

        //TESTING Group CLASS
        ArrayList<Student> studentsList = new ArrayList<Student>();
        studentsList.add(s0); studentsList.add(s1); studentsList.add(s2);
        Group group4=new Group(s0,14 , 4, studentsList);
        group4.groupInfo();
        System.out.println( "The average of group "+ group4.getGrpNbr()+" is: "+ group4.grpAvg());

        //TESTING Section CLASS
        ArrayList<Group> groupsList = new ArrayList<Group>();
        groupsList.add(group4);
        Section ourSection=new Section(1, groupsList);
        System.out.println("The average of section "+ourSection.getSectionNbr()+" is: "+ourSection.sectionAvg());

        //TESTING Major CLASS
        ArrayList<Section> sectionsList = new ArrayList<Section>();
        sectionsList.add(ourSection);
        Major compOption=new Major(Major.major.Computer, sectionsList);
        System.out.println("The average of "+compOption.getMajor() + " students is: "+compOption.majorAvg());

        //TESTING Schedule CLASS
          Room session1Sun=new Room(4,"A",07,"Otmani");
          Room session2Sun=new Room(4, "A", 07, "Otmani");
          Room session6Sun=new Room(0, "AMPHI", 4, "Terchi");

          Room session1Mon=new Room(4,"A",07, "Otmani");
          Room session5Mon=new Room(0,"AMPHI",3, "Hariche");
          Room session6Mon=new Room(0,"B",07, "Benzekri");
          Room session7Mon=new Room(4,"A",01, "Otmani");
         Room session8Mon=new Room(4,"A",01, "Otmani");

        Room session1Wed=new Room(4,"A",07, "Hariche");
        Room session2Wed=new Room(0,"AMPHI",3, "Hariche");
        Room session3Wed=new Room(0,"B",07, "Terchi");
        Room session5Wed=new Room(4,"B",07, "Benzekri");
        Room session6Wed=new Room(0,"AMPHI",2, "Terchi");
        Room session7Wed=new Room(2,"A",05, "Benzekri");
        Room session8Wed=new Room(2,"A",05, "Benzekri");

        FreeRoom free=new FreeRoom();
        Room [][] scheduleFilling =    {{free, session1Sun, session1Mon, free, session1Wed, free},
                                        {free, session2Sun, free, free, session2Wed, free},
                                        {free, free, free, free, session3Wed, free},
                                        {free, free, free, free, free, free},
                                        {free, free, session5Mon, free ,session5Wed, free},
                                        {free, session6Sun, session6Mon, free, session6Wed },
                                        {free, free, session7Mon, free, session7Wed},
                                        {free, free, session8Mon, free, session8Wed, free}};
        Schedule grp4Schedule=new Schedule(scheduleFilling);
        //last sesssion of Wednesday
        System.out.println(grp4Schedule.isAvailable(7,4));
        //firt sesssion of Saturday
        System.out.println(grp4Schedule.isAvailable(0,0));



        //TESTING Room CLASS
        session1Sun.whoWhere(session1Sun);
        session5Mon.whoWhere(session5Mon);




    }
}
