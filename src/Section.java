import java.util.ArrayList;

public class Section {
    private int sectionNbr ;
    private ArrayList<Group> groupsList = new ArrayList<Group>(); //list of groups in this section

    public Section (int sectionNbr, ArrayList<Group> groupsList){
        this.sectionNbr=sectionNbr;
        this.groupsList=groupsList;
    }

    public int getSectionNbr() {
        return sectionNbr;
    }

    protected double sectionAvg(){
        double sectionAvg=0;
        for(Group g:groupsList){
            sectionAvg += g.grpAvg();
    }return sectionAvg;
}}
