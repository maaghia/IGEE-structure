public class Room {
    private int floor, number;
    private String block , teacher;
    public Room (){}
    public Room(int floor, String block, int number, String teacher){
        this.floor=floor;
        this.block=block;
        this.number=number;
        this.teacher=teacher;
    }
    public String getRoomCode(){
    //if the block is not either A,B OR C it's an amphy and only has a number
        // (no floor because igee amphies are all underground)
      if(floor==0 && block.length()>1) return block+" "+number;
      else return block+floor+"0"+number;
    }

    public String whichTeacher(){
        return teacher;
    }

    //this method which teacher is in which room for an entered session number
    public void whoWhere(Room sessionNbr){
        System.out.println(sessionNbr.whichTeacher()+ " is in " + sessionNbr.getRoomCode());
    }


}
