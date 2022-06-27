import java.util.ArrayList;

public class Major {
    enum major{
        Electronics, Computer, Telecommunication, Power, Control;
    } //here we created an enum so that the majors entered are the only majors we study at inelec

    private major major;
    private ArrayList<Section> sectionsList = new ArrayList<Section>(); //list of sections in this major
    public Major(major major, ArrayList<Section> sectionsList){
       this.major=major;
       this.sectionsList=sectionsList;
   }

    public major getMajor() {
        return major;
    }

    public double majorAvg(){
        double majorAvg=0;
        for(Section s:sectionsList){
            majorAvg += s.sectionAvg();
    }return majorAvg;

}}
