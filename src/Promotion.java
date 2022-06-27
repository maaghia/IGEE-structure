
public class Promotion {
   private int year, studentsNbr;
   private double addmitanceAvg;
  public Promotion(int year, int studentsNbr, double addmitanceAvg){
     this.studentsNbr=studentsNbr;
     this.year=year;
     this.addmitanceAvg=addmitanceAvg;
  }

    public double getAddmitanceAvg() {
        return addmitanceAvg;
    }

    public void promoInfo(){
      System.out.println("The promotion "+year+" has "+ studentsNbr+" student");
      System.out.println("The addmitance average for promotion "+ year+" is: "+ addmitanceAvg);
  }
}
