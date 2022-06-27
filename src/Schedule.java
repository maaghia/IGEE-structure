
public class Schedule {
    private Room room;
    int sessionNbr;// in inelec we have 8 sessions of 1h separated with a 5min gap
    private Room [][] scheduel=new Room[8][6];
    /*                  | sat | sun | mon | thu | wed | thu |
     INDEX                 0     1     2     3     4     5
    *  0       session 1
    *  1       session 2
    *  2       session 3
    *  3       session 4
    *  4       session 5
    *  5       session 6
    *  6       session 7
    *  7       session 8                                      */
    Room [][] sessionFilling;

    public Schedule(Room [][] scheduel){
        this.scheduel=scheduel;
        this.sessionFilling=scheduel;
    }
    //this method says if a room is available for a given session nbr
    public boolean isAvailable(int session , int day) {
        if (sessionFilling[session][day] instanceof FreeRoom ) return true;
       else return false;
    }

}
